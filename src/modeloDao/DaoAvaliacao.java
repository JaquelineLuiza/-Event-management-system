/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.BeansAvaliacao;
import modeloConection.ConexaoBD;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class DaoAvaliacao {

    private final List<BeansAvaliacao> listAvaliacao;
    ConexaoBD conex = new ConexaoBD();
    BeansAvaliacao mod = new BeansAvaliacao();
    int codAvalia;
    int codtrab;

    public DaoAvaliacao() {
        this.listAvaliacao = new ArrayList<>();
    }

    public void salvar(BeansAvaliacao mod){
        buscaPessoa(mod.getAvaliador());
        buscaTrabalho(mod.getTrabalho());
        conex.conexao();
        try {
            String sql = "insert into avaliacao"
                    + "(avaliador,trabalho_avaliado,notaCriterio1,notaCriterio2,notaCriterio3,notaCriterio4"
                    + ",notaCriterio5,notaCriterio6,notaCriterio7,notaCriterio8,notaCriterio9,notaCriterio10"
                    + ",notaCriterio11,notaCriterio12, notaCriterio13, data, periodo)"
                    + "	values	(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement pst = conex.con.prepareStatement(sql)) {
                pst.setInt(1, codAvalia);
                pst.setInt(2, codtrab);
                pst.setString(3, mod.getNota1());
                pst.setString(4, mod.getNota2());
                pst.setString(5, mod.getNota3());
                pst.setString(6, mod.getNota4());
                pst.setString(7, mod.getNota5());
                pst.setString(8, mod.getNota6());
                pst.setString(9, mod.getNota7());
                pst.setString(10, mod.getNota8());
                pst.setString(11, mod.getNota9());
                pst.setString(12, mod.getNota10());
                pst.setString(13, mod.getNota11());
                pst.setString(14, mod.getNota12());
                pst.setString(15, mod.getNota13());
                pst.setDate(16, new java.sql.Date(mod.getDt().getTime()));
                pst.setString(17, mod.getPeriodo());

                pst.execute();
            }
            JOptionPane.showMessageDialog(null, "Dados inseridos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco"+ex);
        }
        conex.desconecta();
    }

    public void buscaPessoa(String nomePessoa) {
        conex.conexao();
        conex.executaSQL("select *from pessoa where login like'%" + nomePessoa + "%'");
        try {
            conex.rs.first();
            codAvalia = conex.rs.getInt("idpessoa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pessoa não cadastrada!");
        }
    }

    public void buscaTrabalho(String nometrabalho) {
        conex.conexao();
        conex.executaSQL("select *from trabalho where titulo like'%" + nometrabalho + "%'");
        try {
            conex.rs.first();
            codtrab = conex.rs.getInt("idtrabalho");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Trabalho não cadastrado!");
        }
    }

    public void EditarAvaliacao(BeansAvaliacao mod) {
        conex.conexao();
        try {

            PreparedStatement pst = conex.con.prepareStatement("update avaliacao set avaliador=?"
                    + ", trabalho_avaliado=?, notaCriterio1=?, notaCriterio2=?"
                    + ", notaCriterio3=? notaCriterio4=?, notaCriterio5=?, notaCriterio6=?"
                    + ", notaCriterio7=?, notaCriterio8=?, notaCriterio9=?"
                    + ",notaCriterio10=?, notaCriterio11=?, notaCriterio12=?, notaCriterio13=? where idavaliacao=?");
            pst.setInt(1, codAvalia);
            pst.setInt(2, codtrab);
            pst.setString(3, mod.getNota1());
            pst.setString(4, mod.getNota2());
            pst.setString(5, mod.getNota3());
            pst.setString(6, mod.getNota4());
            pst.setString(7, mod.getNota5());
            pst.setString(8, mod.getNota6());
            pst.setString(9, mod.getNota7());
            pst.setString(10, mod.getNota8());
            pst.setString(11, mod.getNota9());
            pst.setString(12, mod.getNota10());
            pst.setString(13, mod.getNota11());
            pst.setString(14, mod.getNota12());
            pst.setString(15, mod.getNota13());
            pst.setDate(16, new java.sql.Date(mod.getDt().getTime()));
            pst.setString(17, mod.getPeriodo());
            pst.setInt(18, mod.getIdAvaliacao());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados do Aluno\n Erro: " + ex);
        }

        conex.desconecta();
    }

    public void ExcluirAluno(BeansAvaliacao mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from avaliacao where idavaliacao=?");
            pst.setInt(1, mod.getIdAvaliacao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados do Aluno\n Erro: " + ex);
        }
        conex.desconecta();
    }

}
