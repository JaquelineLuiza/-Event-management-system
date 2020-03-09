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
public enum BeansEnumCriterios {
    CRITERIO1, CRITERIO2, CRITERIO3, CRITERIO4, CRITERIO5, 
    CRITERIO6, CRITERIO7, CRITERIO8, CRITERIO9, CRITERIO10, 
    CRITERIO11, CRITERIO12, CRITERIO13;

    public String getDescricao() {
        switch (this) {
            case CRITERIO1:
                return "Qual o nível de complexidade para o desenvolvimento do projeto: ";
            case CRITERIO2:
                return "O projeto está realizando suas funcionalidades adequadamente: ";
            case CRITERIO3:
                return "O projeto cumpriu todos os objetivos propostos: ";
            case CRITERIO4:
                return "Foi apresentada documentação de acordo com o projeto: ";
            case CRITERIO5:
                return "O projeto apresenta um ambiente de fácil utilização, com um layout funcional: ";
            case CRITERIO6:
                return "Foram utilizadas abordagens inovadoras na resolução do problema: ";
            case CRITERIO7:
                return "O produto apresenta ideias criativas em seu desenvolvimento e/ou implementação: ";
            case CRITERIO8:
                return "Você foi bem atendido pela equipe: ";
            case CRITERIO9:
                return "A equipe apresentou o produto de uma forma clara e objetiva: ";
            case CRITERIO10:
                return "A equipe participante se apresentou com aparência profissional: ";
            case CRITERIO11:
                return "O espaço para apresentação do produto está organizado de forma adequada: ";
            case CRITERIO12:
                return "A logomarca desenvolvida para o produto expressa as características do produto: ";
            case CRITERIO13:
                return "Quanto aos mecanismos de propaganda e divulgação do produto (cartaz, banner, pôster) estão adequados: ";
            default:
                return "";
        }
    }
}
