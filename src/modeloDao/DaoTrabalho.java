/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansTrabalho;
import modeloConection.ConexaoBD;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class DaoTrabalho {

    ConexaoBD conex = new ConexaoBD();
    BeansTrabalho mod = new BeansTrabalho();
    int codAluno;
    int codPessoa;
    int codEvento;

    public void salvar(BeansTrabalho mod) {
        bucaAluno(mod.getAlunoLider());
        bucaAluno(mod.getListadeIntegrantes());
        buscaPessoa(mod.getOrientador());
        buscaPessoa(mod.getCoorientador());
        conex.conexao();
        try {
            String sql = "insert into trabalho"
                    + "	(titulo,alunoLider,integrantes,orientador,coorientador,resumo,equipamentos, evento)"
                    + "	values	(?,?,?,?,?,?,?,?)";
            try (PreparedStatement pst = conex.con.prepareStatement(sql)) {
                pst.setString(1, mod.getTitulo());
                pst.setInt(2, codAluno);
                pst.setInt(3, codAluno);
                pst.setInt(4, codPessoa);
                pst.setInt(5, codPessoa);
                pst.setString(6, mod.getResumo());
                pst.setString(7, mod.getEquipamentos());
                pst.setInt(8, codEvento);
                pst.execute();
            }
            JOptionPane.showMessageDialog(null, "Dados inseridos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco"+ex);
        }
        conex.desconecta();
    }

    public void bucaAluno(String nomeAluno) {
        conex.conexao();
        conex.executaSQL("select *from aluno where nome like'%"+nomeAluno+"%'");
        try {
            conex.rs.first();
            codAluno = conex.rs.getInt("idaluno");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aluno não cadastrado!");
        }
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

    public void bucaEvento(String nomeEvento) {
        conex.conexao();
        conex.executaSQL("select *from evento where nome like'%"+nomeEvento+"%'");
        try {
            conex.rs.first();
            codEvento = conex.rs.getInt("idevento");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Evento não cadastrado!");
        }
    }
    public BeansTrabalho buscaTrabalho(BeansTrabalho mod) {
        conex.conexao();
        conex.executaSQL("select * from trabalho where titulo like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setIdtrabalho(conex.rs.getInt("idtrabalho"));
            mod.setTitulo(conex.rs.getString("titulo"));
            mod.setAlunoLider(conex.rs.getString("alunoLider"));
            mod.setListadeIntegrantes(conex.rs.getString("integrantes"));
            mod.setOrientador(conex.rs.getString("orientador"));
            mod.setCoorientador(conex.rs.getString("coorientador"));
            mod.setResumo(conex.rs.getString("resumo"));
            mod.setEquipamentos(conex.rs.getString("equipamentos"));
            mod.setEvento(conex.rs.getString("evento"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Trabalho não encontrado");
        }

        conex.desconecta();
        return mod;
    }

    public void EditarPessoa(BeansTrabalho mod) {
        bucaAluno(mod.getAlunoLider());
        bucaAluno(mod.getListadeIntegrantes());
        buscaPessoa(mod.getOrientador());
        buscaPessoa(mod.getCoorientador());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update trabalho set titulo=?, alunoLider=?, integrantes=?, orientador=?"
                    + ", coorientador=?, resumo=?, equipamentos=? where idtrabalho=?");
            pst.setString(1, mod.getTitulo());
            pst.setInt(2, codAluno);
            pst.setInt(3, codAluno);
            pst.setInt(4, codPessoa);
            pst.setInt(5, codPessoa);
            pst.setString(6, mod.getResumo());
            pst.setString(7, mod.getEquipamentos());
            pst.setString(8, mod.getEvento());
            pst.setInt(9, mod.getIdtrabalho());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados\n Erro: " + ex);
        }

        conex.desconecta();
    }

    public void ExcluirTrabalho(BeansTrabalho mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from trabalho where idtrabalho=?");
            pst.setInt(1, mod.getIdtrabalho());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados\n Erro: " + ex);
        }
        conex.desconecta();
    }
}
