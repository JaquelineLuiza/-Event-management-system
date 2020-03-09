/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansEvento;
import modeloConection.ConexaoBD;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class DaoEvento {

    ConexaoBD conex = new ConexaoBD();
    BeansEvento mod = new BeansEvento();

    public void salvar(BeansEvento mod) {
        conex.conexao();
        try {
            String sql = "insert into evento"
                    + "	(nome,ano,dtInicio,dtTermino,qtMinMenbro,qtMaxMenbro,nota,qtAvaliador,criterio)"
                    + "	values	(?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement pst = conex.con.prepareStatement(sql)) {
                pst.setString(1, mod.getNome());
                pst.setString(2, mod.getAno());
                pst.setDate(3, new java.sql.Date(mod.getDtInicio().getTime()));
                pst.setDate(4, new java.sql.Date(mod.getDtFim().getTime()));
                pst.setString(5, mod.getQtMinMembro());
                pst.setString(6, mod.getQtMaxMembro());
                pst.setString(7, mod.getNota());
                pst.setString(8, mod.getQtMinAvaliador());
                pst.setString(9, mod.getCriterio());

                pst.execute();
            }
            JOptionPane.showMessageDialog(null, "Dados inseridos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco"+ex);
        }
        conex.desconecta();
    }

    public BeansEvento buscaEvento(BeansEvento mod) {
        conex.conexao();
        conex.executaSQL("select * from evento where nome like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setIdevento(conex.rs.getInt("idevento"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setAno(conex.rs.getString("ano"));
            mod.setDtInicio(conex.rs.getDate("dtInicio"));
            mod.setDtFim(conex.rs.getDate("dtTermino"));
            mod.setQtMinMembro(conex.rs.getString("qtMinMenbro"));
            mod.setQtMaxMembro(conex.rs.getString("qtMaxMenbro"));
            mod.setNota(conex.rs.getString("nota"));
            mod.setQtMinAvaliador(conex.rs.getString("qtAvaliador"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Evento não encontrado");
        }

        conex.desconecta();
        return mod;
    }

    public void EditarEvento(BeansEvento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update evento set nome=?, ano=?, dtInicio=?, dtTermino=?, qtMinMenbro=?, qtMaxMenbro=?"
                    + ", nota=?, qtAvaliador=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getAno());
            pst.setDate(3, new java.sql.Date(mod.getDtInicio().getDate()));
            pst.setDate(4, new java.sql.Date(mod.getDtFim().getDate()));
            pst.setString(5, mod.getQtMinMembro());
            pst.setString(6, mod.getQtMaxMembro());
            pst.setString(7, mod.getNota());
            pst.setString(8, mod.getQtMinAvaliador());
            pst.setInt(6, mod.getIdevento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados do Evento\n Erro: " + ex);
        }

        conex.desconecta();
    }

    public void ExcluirEvento(BeansEvento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from evento where idevento=?");
            pst.setInt(1, mod.getIdevento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados do Evento\n Erro: " + ex);
        }
        conex.desconecta();
    }
}
