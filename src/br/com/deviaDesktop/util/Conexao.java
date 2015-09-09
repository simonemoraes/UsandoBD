
package br.com.deviaDesktop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/testeDesktop";
    final private String usuario = "simone";
    final private String senha = "442332si";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    /* Classe que faz a conexão com o banco de dados.*/
   public Connection getConection() {
       
       boolean result = false;
       conexao = null;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            
        } catch ( ClassNotFoundException Driver ) {
            System.out.println( "Driver não localizado!!" + Driver );
        } catch( SQLException Fonte ) {
            System.out.println( "Erro na conexão com a fonte de dados " + Fonte );
        }
       
       if ( conexao != null ) {
           result = true;
       }
       
       return conexao;
   }
   
   /* Classe que faz uma execução no banco.*/
   public Statement getStatemant() {
       
       Statement retorno = null;
       
        try {
            retorno = getConection().createStatement();
        } catch (SQLException e) {
            System.out.println( "Erro: " + e.getMessage() );
        }
        return retorno;
   }
   
   /* Classe que prepara uma execução no banco.*/
   public PreparedStatement getPreparedStatement( String sql ) {
       
       PreparedStatement retorno = null;
        
        try {
            retorno = getConection().prepareStatement( sql, Statement.RETURN_GENERATED_KEYS );
        } catch ( SQLException e ) {
            System.out.println( "Erro: " + e.getMessage() );
        }
       
       return retorno;
   }
   
   /* Classe que fecha a conexão com o banco.*/
   public void closeAll() {
       
       if( conexao != null ) {
           try {
               conexao.close();
           } catch ( SQLException e ) {
               System.out.println( "Erro: " + e.getMessage() );
           }
       }
   }
    
}
