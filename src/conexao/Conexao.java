package conexao;

import java.sql.*;

public class Conexao {
    static Connection connection = null;
    
    static String url = "jdbc:mysql://localhost:3306/lojadebolsas";
    static String user = "root";
    static String password = "@Suellen08112005";


    public static Connection getConexao() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Problema na conexao: " + e.getMessage());
        }

        return connection;
    }
}


