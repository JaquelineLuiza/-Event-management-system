/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joao
 */
public class BeansAvaliacao {

    private int idAvaliacao;
    private String avaliador;
    private String nota1;
    private String nota2;
    private String nota3;
    private String nota4;
    private String nota5;
    private String nota6;
    private String nota7;
    private String nota8;
    private String nota9;
    private String nota10;
    private String nota11;
    private String nota12;
    private String nota13;
    private List<BeansAluno> alunos = new ArrayList<>();
    private double media;
    private String trabalho;
    private Date dt;
    private String periodo;
    private boolean temGrupo;

    public BeansAvaliacao(double media, Date dt, String periodo, boolean temGrupo, String avaliador) {
        this.media = media;
        this.avaliador = avaliador;
        this.periodo = periodo;
        this.temGrupo = false;
    }

    public BeansAvaliacao() {
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    /**
     * @return the idAvaliacao
     */
    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    /**
     * @param idAvaliacao the idAvaliacao to set
     */
    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    /**
     * @return the alunos
     */
    public List<BeansAluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(List<BeansAluno> alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }

    /**
     * @return the trabalho
     */
    public String getTrabalho() {
        return trabalho;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the temGrupo
     */
    public boolean isTemGrupo() {
        return temGrupo;
    }

    /**
     * @param temGrupo the temGrupo to set
     */
    public void setTemGrupo(boolean temGrupo) {
        this.temGrupo = temGrupo;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }

    public String getNota4() {
        return nota4;
    }

    public void setNota4(String nota4) {
        this.nota4 = nota4;
    }

    public String getNota5() {
        return nota5;
    }

    public void setNota5(String nota5) {
        this.nota5 = nota5;
    }

    public String getNota6() {
        return nota6;
    }

    public void setNota6(String nota6) {
        this.nota6 = nota6;
    }

    public String getNota7() {
        return nota7;
    }

    public void setNota7(String nota7) {
        this.nota7 = nota7;
    }

    public String getNota8() {
        return nota8;
    }

    public void setNota8(String nota8) {
        this.nota8 = nota8;
    }

    public String getNota9() {
        return nota9;
    }

    public void setNota9(String nota9) {
        this.nota9 = nota9;
    }

    public String getNota10() {
        return nota10;
    }

    public void setNota10(String nota10) {
        this.nota10 = nota10;
    }

    public String getNota11() {
        return nota11;
    }

    public void setNota11(String nota11) {
        this.nota11 = nota11;
    }

    public String getNota12() {
        return nota12;
    }

    public void setNota12(String nota12) {
        this.nota12 = nota12;
    }

    public String getNota13() {
        return nota13;
    }

    public void setNota13(String nota13) {
        this.nota13 = nota13;
    }

   

}
