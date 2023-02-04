package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import javax.swing.JOptionPane;
import models.Cliente;

public class ClienteDAO{
    
     Connection conn;
     PreparedStatement prep;
        
    public void cadastrar(Cliente cliente) {
        String sql = "INSERT INTO CLIENTE(nome, cpf, senha, email, telefone) VALUES(?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement prep = null;

        try {
            conn = Conexao.getConexao();
            prep = conn.prepareStatement(sql);
            prep.setString(1, cliente.getNome());
            prep.setString(2, cliente.getCPF());
            prep.setString(3, cliente.getSenha());
            prep.setString(4, cliente.getEmail());
            prep.setString(5, cliente.getTelefone());

            prep.executeUpdate();

            System.out.println("Cliente Cadastrado!!!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        } finally {

            try {
                if (prep != null) {
                    prep.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public boolean login(String email, String senha) {

        boolean verificacao = false;
        Cliente cliente = null;

        Connection conn = null;
        String sql = "SELECT * FROM CLIENTE WHERE EMAIL = ? AND SENHA = ?";
        PreparedStatement prep = null;
        ResultSet rSet = null;

        try {
            conn = Conexao.getConexao();
            prep = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            prep.setString(1, email);
            prep.setString(2, senha);

            rSet = prep.executeQuery();

            rSet.first();
            int id = rSet.getInt("id");
            String nome = rSet.getString("nome");
            String cpf = rSet.getString("cpf");
            String senha2 = rSet.getString("senha");
            String email2 = rSet.getString("email");
            String telefone = rSet.getString("telefone");
            cliente = new Cliente(id, nome, cpf, senha2, email2, telefone);

        } catch (SQLException e) {
            System.out.println("Email e/ou senha incorretos. " + e.getMessage());
        } finally {

            try {
                if (prep != null) {
                    prep.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(cliente != null){
            verificacao = true;
        }

        return verificacao;
    }

    public void deletar(String cpf) {

        try {
            conn = Conexao.getConexao();
            prep = conn.prepareStatement("DELETE FROM CLIENTE WHERE CPF = ?");
            
            prep.setString(1, cpf);
            
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "usuario removido", "sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "usuario removido: "+ex, "sucesso", JOptionPane.INFORMATION_MESSAGE);
        }finally {

            try {
                if (prep != null) {
                    prep.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    
    public void atualizar(Cliente cliente){
        
        try {
            conn = Conexao.getConexao();
            prep = conn.prepareStatement("UPDATE CLIENTE SET NOME = ?, SENHA = ?, EMAIL = ?, TELEFONE = ? WHERE CPF = ?");
            
            prep.setString(1, cliente.getNome());
            prep.setString(2, cliente.getSenha());
            prep.setString(3, cliente.getEmail());
            prep.setString(4, cliente.getTelefone());
            prep.setString(5, cliente.getCPF());

            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "usuario atualizado", "sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "usuario não atualizado: "+ex, "sucesso", JOptionPane.INFORMATION_MESSAGE);
        }finally {

            try {
                if (prep != null) {
                    prep.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
    }
    
    
}


