/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexao.Conexao;
import models.Bolsa;

/**
 *
 * @author suell
 */
public class BolsasDAO {
    
     Connection conn;
     PreparedStatement prep;
        
    public ArrayList<Bolsa> consultarPorMarca(String marca){
            
        ArrayList<Bolsa> bolsas = new ArrayList<Bolsa>(null);

            try{
                conn = Conexao.getConexao();
                prep = conn.prepareStatement("SELECT * FROM BOLSAS WHERE MARCA = ?");
                prep.setString(1, marca);
                ResultSet rs = prep.executeQuery();
                
                while(rs.next()){
                    
                    int id = rs.getInt("ID");
                    String marca2 = rs.getString("MARCA");
                    double preco = rs.getDouble("PRECO");
                    double desconto = rs.getDouble("DESCONTO");
                    int quantidadeEstoque = rs.getInt("QUANTIDADE_ESTOQUE");

                    Bolsa bolsa = new Bolsa(preco, desconto, quantidadeEstoque, marca);
                    bolsas.add(bolsa);
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + e.getMessage());
                System.out.println("Erro ao consultar: " + e.getMessage());
            }finally{
                try{
                    if(prep != null){
                        prep.close();
                    }
                    if(conn != null){
                        conn.close();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            return bolsas;
    }    
    public void comprar(int idBolsa, int idUsuario) throws SQLException{
        
        try{
            conn = Conexao.getConexao();
            prep = conn.prepareStatement("INSERT INTO BOLSAS_USUARIO (ID_BOLSA, ID_USUARIO) VALUES (?, ?)");
            prep.setInt(1, idBolsa);
            prep.setInt(2, idUsuario);
            prep.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao comprar: " + e.getMessage());
            System.out.println("Erro ao comprar: " + e.getMessage());
        }finally{
            try{
                if(prep != null){
                    prep.close();
                }
                if(conn != null){
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
}
