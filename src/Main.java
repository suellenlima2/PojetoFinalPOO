import java.sql.Connection;

import conexao.Conexao;
import dao.*;
import models.*;

public class Main {
    public static void main(String args[]){

      // Connection conexao = Conexao.getConexao();
       // System.out.println("Conexão realizada com sucesso");

       //ClienteDAO clienteDAO = new ClienteDAO();
       //clienteDAO.deletar("123456789");
       
       ClienteDAO clienteDAO = new ClienteDAO();
       Cliente cliente = new Cliente( "Maria", "123456789", "123", "46477", "123456789");
       clienteDAO.atualizar(cliente);
    }
}
