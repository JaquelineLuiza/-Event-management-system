/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAvaliadorTrabalho;
import modeloConection.ConexaoBD;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class DaoAvaliadorTrabalho {

    ConexaoBD conex = new ConexaoBD();
    BeansAvaliadorTrabalho mod = new BeansAvaliadorTrabalho();
    int codPessoa;
    int codTrabalho;

    public void salvar(BeansAvaliadorTrabalho mod) {
        buscaPessoa(mod.getAvaliador());
        buscaTrabalho(mod.getTrabalho());
        conex.conexao();
        try {
            String sql = "insert into avaliador_trabalho"
                    + "	(pessoa_avaliador,trabalho_avaliar)"
                    + "	values	(?,?)";
            try (PreparedStatement pst = conex.con.prepareStatement(sql)) {
                pst.setInt(1, codPessoa);
                pst.setInt(2, codTrabalho);

                pst.execute();
            }
            JOptionPane.showMessageDialog(null, "Dados inseridos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco");
        }
        conex.desconecta();
    }

   public void buscaPessoa(String nomePessoa) {
        conex.conexao();
        conex.executaSQL("select *from pessoa where nome like'%" + nomePessoa + "%'");
        try {
            conex.rs.first();
            codPessoa = conex.rs.getInt("idpessoa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pessoa não cadastrada!");
        }
    }
     public void buscaTrabalho(String tituloTrabalho) {
        conex.conexao();
        conex.executaSQL("select *from trabalho where titulo like'%" + tituloTrabalho + "%'");
        try {
            conex.rs.first();
            codTrabalho = conex.rs.getInt("idtrabalho");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Trabalho não cadastrado!");
        }
    }

    public BeansAvaliadorTrabalho buscaVinculacao(BeansAvaliadorTrabalho mod) {
        conex.conexao();
        conex.executaSQL("select * from avaliador_trabalho where pessoa_avaliador like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setIdVinculacao(conex.rs.getInt("idavaliador_trabalho"));
            mod.setAvaliador(conex.rs.getString("pessoa_avaliador"));
            mod.setTrabalho(conex.rs.getString("trabalho_avaliar"));
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Vinculação não encontrada");
        }

        conex.desconecta();
        return mod;
    }

    public void EditarVinculação(BeansAvaliadorTrabalho mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update avaliador_trabalho set pessoa_avaliador=?, trabalho_avaliar=? where idavaliador_trabalho=?");
            pst.setString(1, mod.getAvaliador());
            pst.setString(2, mod.getTrabalho());
            pst.setInt(3, mod.getIdVinculacao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados \n Erro: " + ex);
        }

        conex.desconecta();
    }

    public void ExcluirVinculacao(BeansAvaliadorTrabalho mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from avaliador_trabalho where idavaliador_trabalho=?");
            pst.setInt(1, mod.getIdVinculacao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados\n Erro: " + ex);
        }
        conex.desconecta();
    }
}
