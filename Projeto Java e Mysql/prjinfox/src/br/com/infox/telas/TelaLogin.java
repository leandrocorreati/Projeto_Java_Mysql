package br.com.infox.telas;

import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import java.awt.Toolkit;
import javafx.scene.paint.Color;

import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame
{
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar()
    {
        String sql = "select * from tbusuarios where login=? and senha =?"; // O ? é substituito pelo que for digitado na caixas de texto
        try  /// 
        {
            pst = conexao.prepareStatement(sql); // Responsavel por preparar a conexão 
            pst.setString(1, txtUsuario.getText()); // A variavel pst chamada o metodo setString que por sua vez recebe como parametro o metodo para obter o que foi digitado no campo txt
            pst.setString(2, txtSenha.getText()); //  O metodo getSenha está riscado devido campo txt armazenar senha
            // A linha abaixo executa a query(consulta)
            rs = pst.executeQuery();
            // Caso o usuario digite um usuario ou senha incorretos, a estrutura de condição irá apresentar uma mensagem. Caso esteja tudo ok chama a tela principal
            if(rs.next()) // O metodo next() retorna true ou false em relação a consulta(query)
            {
                // A linha abaixo obtem o conteudo do campo perfil da tabela tbusuario
                String perfil = rs.getString(6); // O getString obtem a sexta coluna de uma query realizada na tabela tbusuario
                //System.out.println(perfil);
               // conexao.close(); // Variavel conexao chama o método close(), que serve para fechar a conexão com o banco de dados
                if(perfil.equals("admin"))
                {
                TelaPrincipal principal = new TelaPrincipal(); // Criasse um objeto da classe que é a tela principal
                principal.setVisible(true); // O objeto chama o método para tornar a tela visivel com parametro verdadeiro
                TelaPrincipal.MenuRel.setEnabled(true); // Habilita a opção relatorio para o perfil de admin do banco de dados
                TelaPrincipal.MenuCadUsu.setEnabled(true); // Habilita a opção Cadastro Usuário para o perfil de admin do banco de dados
                TelaPrincipal.lblUsuario.setText(rs.getString(2)); // Classe TelaPrincipal chama sua varialvel e a configura com o método setTex() que recebe como parametro rs que é uma variavel do tipo ResultSet e em seguida chama o método getString(), recebendo o 2 que é a segunda coluna da tabela
                TelaPrincipal.lblUsuario.setForeground(BLUE); // Altera a cor da label lblusuario, caso aja login como admin
                dispose();  // Método responsavel por ocultar a janela de login da aplicação
                }else
                {
                TelaPrincipal principal = new TelaPrincipal(); // Criasse um objeto da classe que é a tela principal
                principal.setVisible(true); // O objeto chama o método para tornar a tela visivel com parametro verdadeiro
                TelaPrincipal.lblUsuario.setText(rs.getString(2));
                dispose();  // Método responsavel por ocultar a janela de login da aplicação
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(a)");
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void acaobotaolimpa() // Método responsavel por limpar os campos de texto
    {
            txtUsuario.setText("");
            txtSenha.setText("");
    }
    
    
    public TelaLogin() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/infox/icones/LeandroTI_Icon.png")));
        conexao = ModuloConexao.conector();
        // A linha abaixo serve para mostrar o status da conexão
        //System.out.println(conexao);
       
        if (conexao != null)
        {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/Conectado.png"))); // Altera uma label para uma imagem especifica
         //   lblStatus.setText("Conectato");
           
        } else
        {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/Desconectado.png"))); // Altera uma label para uma imagem especifica
         //  lblStatus.setText("Não Conectato");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão de Serviços X - Login");
        setResizable(false);

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/Desconectado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(btnLogin)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin)
                    .addComponent(lblStatus))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(391, 228));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       /// Chamando o método logar
       logar(); // Realiza a consulta ao banco de dados
       acaobotaolimpa(); // Chamada do método responsavel por limpar os campos assim que o botão é acionado
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
