/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author leandro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/infox/icones/LeandroTI_Icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuCad = new javax.swing.JMenu();
        MenuCadCli = new javax.swing.JMenuItem();
        MenuCadOs = new javax.swing.JMenuItem();
        MenuCadUsu = new javax.swing.JMenuItem();
        MenuAju = new javax.swing.JMenu();
        MenuAjuSobre = new javax.swing.JMenuItem();
        MenuRel = new javax.swing.JMenu();
        MenuRelRel = new javax.swing.JMenuItem();
        MenuOpc = new javax.swing.JMenu();
        MenuOpcSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão de Serviços X - Controle de OS");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblData.setText("Data");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/Logo1.png"))); // NOI18N

        MenuCad.setText("Cadastro ");

        MenuCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenuCadCli.setText("Cliente");
        MenuCad.add(MenuCadCli);

        MenuCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MenuCadOs.setText("Ordem de Serviço");
        MenuCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadOsActionPerformed(evt);
            }
        });
        MenuCad.add(MenuCadOs);

        MenuCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        MenuCadUsu.setText("Usuários");
        MenuCadUsu.setEnabled(false);
        MenuCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadUsuActionPerformed(evt);
            }
        });
        MenuCad.add(MenuCadUsu);

        Menu.add(MenuCad);

        MenuAju.setText("Ajuda");

        MenuAjuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        MenuAjuSobre.setText("Sobre");
        MenuAjuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjuSobreActionPerformed(evt);
            }
        });
        MenuAju.add(MenuAjuSobre);

        Menu.add(MenuAju);

        MenuRel.setText("Relatórios");
        MenuRel.setEnabled(false);

        MenuRelRel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenuRelRel.setText("Relatório de Serviços");
        MenuRelRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelRelActionPerformed(evt);
            }
        });
        MenuRel.add(MenuRelRel);

        Menu.add(MenuRel);

        MenuOpc.setText("Opções");

        MenuOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuOpcSai.setText("Sair");
        MenuOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpcSaiActionPerformed(evt);
            }
        });
        MenuOpc.add(MenuOpcSai);

        Menu.add(MenuOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Desktop)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        setSize(new java.awt.Dimension(944, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRelRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelRelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuRelRelActionPerformed

    private void MenuCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadUsuActionPerformed
        // As linhas abaixo irão abriri o form TelaUsuario dentro do desktopPane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        Desktop.add(usuario);
    }//GEN-LAST:event_MenuCadUsuActionPerformed

    private void MenuCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadOsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadOsActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // A linhas Abaixo substituem a label pela data atual do sistema ao inicializar o form
      Date data = new Date(); // É criado um objeto da classe Date que serve para obter a data do sistema
      DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL); // É criado um ojeto da classe DateFormat que irá formatar a data obtida do sistema
       lblData.setText(formatador.format(data)) ; // O label da data e configurado com o método set recebendo como parametro o objeto formatador que recebeu o formato desejado, que chama o metodo                                                                                 para formatar o objeto instanciado data
      // lblData.setText(data.toString()) ;
    }//GEN-LAST:event_formWindowActivated

    private void MenuOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpcSaiActionPerformed
        // Exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair ?", "Atenção", JOptionPane.YES_NO_OPTION); // Os parametros do médodo showConfirmDialog são;  
        // primeiro é a dependência, ou seja, de qual janela esta confirmação está sendo gerada. Como nosso exemplo acima não possue nenhuma dependência, então, sempre usaremos null neste argumento. segundo é a mensagem que irá aparecer, terceiro é o cabeçalho da janela de alerta e  quarto é o atributo da classe JOptionPane que mostra botões "SIM" ou "NÃo".
        
        if (sair == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_MenuOpcSaiActionPerformed

    private void MenuAjuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjuSobreActionPerformed
        // Chamando a tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true); // Chama a tela sobre
    }//GEN-LAST:event_MenuAjuSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuAju;
    private javax.swing.JMenuItem MenuAjuSobre;
    private javax.swing.JMenu MenuCad;
    private javax.swing.JMenuItem MenuCadCli;
    private javax.swing.JMenuItem MenuCadOs;
    public static javax.swing.JMenuItem MenuCadUsu;
    private javax.swing.JMenu MenuOpc;
    private javax.swing.JMenuItem MenuOpcSai;
    public static javax.swing.JMenu MenuRel;
    private javax.swing.JMenuItem MenuRelRel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
