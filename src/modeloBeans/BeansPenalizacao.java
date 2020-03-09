/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author joao
 */
public class BeansPenalizacao {
    private long idPenalizacao;
    private String razao;
    private double notaDescontada;
    private String aluno;

    public BeansPenalizacao(String razao, double notaDescontada) {
        this.razao = razao;
        this.notaDescontada = notaDescontada;
    }

    public BeansPenalizacao() {
    }

    public long getIdPenalizacao() {
        return idPenalizacao;
    }

    public double getNotaDescontada() {
        return notaDescontada;
    }

    public void setNotaDescontada(double notaDescontada) {
        this.notaDescontada = notaDescontada;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setIdPenalizacao(long idPenalizacao) {
        this.idPenalizacao = idPenalizacao;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }
    
}
