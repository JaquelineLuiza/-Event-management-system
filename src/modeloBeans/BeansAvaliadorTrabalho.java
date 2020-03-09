/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class BeansAvaliadorTrabalho {

    private int idVinculacao;
    private String avaliador;
    private String trabalho;
    private String pesquisa;

    public BeansAvaliadorTrabalho() {
    }

    public BeansAvaliadorTrabalho(String avaliador, String trabalho) {
        this.avaliador = avaliador;
        this.trabalho = trabalho;
    }

    /**
     * @return the idVinculacao
     */
    public int getIdVinculacao() {
        return idVinculacao;
    }

    /**
     * @param idVinculacao the idVinculacao to set
     */
    public void setIdVinculacao(int idVinculacao) {
        this.idVinculacao = idVinculacao;
    }

    /**
     * @return the avaliador
     */
    public String getAvaliador() {
        return avaliador;
    }

    /**
     * @param avaliador the avaliador to set
     */
    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
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

    @Override
    public String toString() {
        return "BeansAvaliadorTrabalho{" + "idVinculacao=" + idVinculacao + ", avaliador=" + avaliador + ", trabalho=" + trabalho + '}';
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
