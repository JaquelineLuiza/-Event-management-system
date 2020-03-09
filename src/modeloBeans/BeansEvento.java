/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.Date;



/**
 *
 * @author TI-MANUTENÇÃO
 */
public class BeansEvento {

    private int idevento;
    private String nome;
    private String ano;
    private Date dtInicio;
    private Date dtFim;
    private String qtMinMembro;
    private String qtMaxMembro;
    private String nota;
    private String qtMinAvaliador;
    private String criterio;
    private String pesquisa;

    /**
     * @return the idevento
     */
    public int getIdevento() {
        return idevento;
    }

    /**
     * @param idevento the idevento to set
     */
    public void setIdevento(int idevento) {
        this.idevento = idevento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the dtInicio
     */
    public Date getDtInicio() {
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return the dtFim
     */
    public Date getDtFim() {
        return dtFim;
    }

    /**
     * @param dtFim the dtFim to set
     */
    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    /**
     * @return the qtMinMembro
     */
    public String getQtMinMembro() {
        return qtMinMembro;
    }

    /**
     * @param qtMinMembro the qtMinMembro to set
     */
    public void setQtMinMembro(String qtMinMembro) {
        this.qtMinMembro = qtMinMembro;
    }

    /**
     * @return the qtMaxMembro
     */
    public String getQtMaxMembro() {
        return qtMaxMembro;
    }

    /**
     * @param qtMaxMembro the qtMaxMembro to set
     */
    public void setQtMaxMembro(String qtMaxMembro) {
        this.qtMaxMembro = qtMaxMembro;
    }

    /**
     * @return the nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return the qtMinAvaliador
     */
    public String getQtMinAvaliador() {
        return qtMinAvaliador;
    }

    /**
     * @param qtMinAvaliador the qtMinAvaliador to set
     */
    public void setQtMinAvaliador(String qtMinAvaliador) {
        this.qtMinAvaliador = qtMinAvaliador;
    }

    /**
     * @return the criterio
     */
    public String getCriterio() {
        return criterio;
    }

    /**
     * @param criterio the criterio to set
     */
    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}
