/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Vaga;

/**
 *
 * @author 03017719014
 */
public class VagaDAO {
    
    public void create(Vaga v){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    try{
        stmt = con.prepareStatement("INSERT INTO vaga (numero, rua, obliqua) VALUES(?,?,?)");
        stmt.setInt(1, v.getNumero());
        stmt.setString(2, v.getRua());
        stmt.setBoolean(3, v.getObliqua());
        
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Vaga salva com sucesso!");
        
    } catch(SQLException e){
    JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ e);
    
    } finally{
    ConnectionFactory.closeConnection(con, stmt);
    
    }
    }
    
}
