/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansPessoa;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class DaoPessoa {
    ConexaoBD conex = new ConexaoBD();
    BeansPessoa mod = new BeansPessoa();

    public void salvar(BeansPessoa mod) {
        conex.conexao();
        try {
             String sql = "insert into pessoa"
                + "	(nome,siape,tipo,login,senha)"
                + "	values	(?,?,?,?,?)";
            try (PreparedStatement pst = conex.con.prepareStatement(sql)) {
                
                pst.setString(1, mod.getNome());
                pst.setString(2, mod.getSiape());
                pst.setString(3, mod.getTipo());
                pst.setString(4, mod.getLogin());
                pst.setString(5, mod.getSenha());
                
                pst.execute();
            }
            JOptionPane.showMessageDialog(null, "Dados inseridos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco"+ex);
        }
        conex.desconecta();
    }
    public BeansPessoa busca(BeansPessoa mod) {
        conex.conexao();
        conex.executaSQL("select * from pessoa where nome like'%" +mod.getNome()+ "%'");
        try {
            conex.rs.first();
            mod.setIdPessoa(conex.rs.getInt("idpessoa"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setSiape(conex.rs.getString("siape"));
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setLogin(conex.rs.getString("login"));
            mod.setSenha(conex.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
        }

        conex.desconecta();
        return mod;
    }

     public BeansPessoa buscaPessoa(BeansPessoa mod) {
        conex.conexao();
        conex.executaSQL("select * from pessoa where nome like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setIdPessoa(conex.rs.getInt("idpessoa"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setSiape(conex.rs.getString("siape"));
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setLogin(conex.rs.getString("login"));
            mod.setSenha(conex.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
        }

        conex.desconecta();
        return mod;
    }

    public void EditarPessoa(BeansPessoa mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update pessoa set nome=?, siape=?, tipo=?, login=?, senha=? where idpessoa=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSiape());
            pst.setString(3, mod.getTipo());
            pst.setString(4, mod.getLogin());
            pst.setString(5, mod.getSenha());
            pst.setInt(6, mod.getIdPessoa());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados\n Erro: " + ex);
        }

        conex.desconecta();
    }

    public void ExcluirPessoa(BeansPessoa mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from pessoa where idpessoa=?");
            pst.setInt(1, mod.getIdPessoa());
            pst.execute();  
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados\n Erro: " + ex);
        }
        conex.desconecta();
    }
   

}
