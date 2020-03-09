/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.BeansAluno;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class DaoAluno {

    private final List<BeansAluno> listAlunos;
    ConexaoBD conex = new ConexaoBD();
    BeansAluno mod = new BeansAluno();
   
    public DaoAluno() {
        this.listAlunos = new ArrayList<>();
    }

    public void salvar(BeansAluno mod) throws Exception {
        conex.conexao();
        try {
            String sql = "insert into aluno"
                    + "	(nome,ra,turma,curso,email)"
                    + "	values	(?,?,?,?,?)";
            try (PreparedStatement pst = conex.con.prepareStatement(sql)) {
                pst.setString(1, mod.getNome());
                pst.setString(2, mod.getRa());
                pst.setString(3, mod.getTurma());
                pst.setString(4, mod.getCurso());
                pst.setString(5, mod.getEmail());

                pst.execute();
                listAlunos.add(mod);
            }
            JOptionPane.showMessageDialog(null, "Dados inseridos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco");
        }
        conex.desconecta();
    }

    public BeansAluno buscaAluno(BeansAluno mod) {
        conex.conexao();
        conex.executaSQL("select * from aluno where nome like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setIdaluno(conex.rs.getInt("idaluno"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRa(conex.rs.getString("ra"));
            mod.setTurma(conex.rs.getString("turma"));
            mod.setCurso(conex.rs.getString("curso"));
            mod.setEmail(conex.rs.getString("email"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado");
        }

        conex.desconecta();
        return mod;
    }

    public void EditarAluno(BeansAluno mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update aluno set nome=?, ra=?, turma=?, curso=?, email=? where idaluno=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getRa());
            pst.setString(3, mod.getTurma());
            pst.setString(4, mod.getCurso());
            pst.setString(5, mod.getEmail());
            pst.setInt(6, mod.getIdaluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados do Aluno\n Erro: " + ex);
        }

        conex.desconecta();
    }

    public void ExcluirAluno(BeansAluno mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from aluno where idaluno=?");
            pst.setInt(1, mod.getIdaluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados do Aluno\n Erro: " + ex);
        }
        conex.desconecta();
    }

   

}
