/**
 * @autor leandro
 */
package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {
    // Método responsavel pela conexão com o banco de dados

    public static Connection conector() // Método (função) que deve retornar algo, o tipo do método é Connection(que é uma classe pré-estabelecida pelo java)
    {
        // Variavel do tipo Connection
        java.sql.Connection conexao = null;
        // A linha abaixo "chama" o drive
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referentes ao banco dados
        String url = "jdbc:mysql://localhost:3303/dbinfox";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão com o banco
        try 
        {
            Class.forName(driver); // Essa linha tenta realizar a execução do drive
            conexao = DriverManager.getConnection(url, user, password); // DriveManager chama o método acessor getConnection que pega os parametros de conexão
            return conexao;
        } 
        catch (Exception e) 
        {
            // A linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
        
    }
}
