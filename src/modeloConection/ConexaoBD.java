/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class ConexaoBD {

    public Statement smt;
    public ResultSet rs;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/gerenciadorevento?useTimezone=true&serverTimezone=UTC";
    private final String usuario = "root";
    private final String senha = "";
    public Connection con;

    public Connection conexao() {
        try {
            Properties properties = new Properties();
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            properties.setProperty("useSSL", "false");
            properties.setProperty("useTimezone", "true");
            properties.setProperty("serverTimezone", "UTC");
            properties.setProperty("allowPublicKeyRetrieval", "true");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar com o banco de dados\n" + e.getMessage());
        }
        return con;
    }

    public void executaSQL(String sql){
        try {
            smt = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = smt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSQL\n" + ex.getMessage());
        }
        
    }
    
    public void desconecta() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com BD\n" + ex.getMessage());
        }
    }

}
