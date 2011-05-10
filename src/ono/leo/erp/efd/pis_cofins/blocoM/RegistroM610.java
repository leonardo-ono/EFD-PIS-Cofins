package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M610. 
 * Detalhamento da contribuicao para a seguridade social - Cofins do periodo.
 * 
 * Obs.: no layout, este registro esta como obrigatorio. Porem, 
 *       nao foi necessario preenche-lo para passar no validador.
 *       Portanto, provisoriamente, esta como OC.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 11:35)
 */
public class RegistroM610 extends Registro {

    private String COD_CONT = "";
    private String VL_REC_BRT = "";
    private String VL_BC_CONT = "";
    private String ALIQ_COFINS = "";
    private String QUANT_BC_COFINS = "";
    private String ALIQ_COFINS_QUANT = "";
    private String VL_CONT_APUR = "";
    private String VL_AJUS_ACRES = "";
    private String VL_AJUS_REDUC = "";
    private String VL_CONT_DIFER = "";
    private String VL_CONT_DIFER_ANT = "";
    private String VL_CONT_PER = "";
    
    public RegistroM610() {
        REG = "M610";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC; // no layout esta como obrigatorio
    }

    public String getALIQ_COFINS() {
        return ALIQ_COFINS;
    }

    public void setALIQ_COFINS(String ALIQ_COFINS) {
        this.ALIQ_COFINS = ALIQ_COFINS;
    }

    public String getALIQ_COFINS_QUANT() {
        return ALIQ_COFINS_QUANT;
    }

    public void setALIQ_COFINS_QUANT(String ALIQ_COFINS_QUANT) {
        this.ALIQ_COFINS_QUANT = ALIQ_COFINS_QUANT;
    }

    public String getCOD_CONT() {
        return COD_CONT;
    }

    public void setCOD_CONT(String COD_CONT) {
        this.COD_CONT = COD_CONT;
    }

    public String getQUANT_BC_COFINS() {
        return QUANT_BC_COFINS;
    }

    public void setQUANT_BC_COFINS(String QUANT_BC_COFINS) {
        this.QUANT_BC_COFINS = QUANT_BC_COFINS;
    }

    public String getVL_AJUS_ACRES() {
        return VL_AJUS_ACRES;
    }

    public void setVL_AJUS_ACRES(String VL_AJUS_ACRES) {
        this.VL_AJUS_ACRES = VL_AJUS_ACRES;
    }

    public String getVL_AJUS_REDUC() {
        return VL_AJUS_REDUC;
    }

    public void setVL_AJUS_REDUC(String VL_AJUS_REDUC) {
        this.VL_AJUS_REDUC = VL_AJUS_REDUC;
    }

    public String getVL_BC_CONT() {
        return VL_BC_CONT;
    }

    public void setVL_BC_CONT(String VL_BC_CONT) {
        this.VL_BC_CONT = VL_BC_CONT;
    }

    public String getVL_CONT_APUR() {
        return VL_CONT_APUR;
    }

    public void setVL_CONT_APUR(String VL_CONT_APUR) {
        this.VL_CONT_APUR = VL_CONT_APUR;
    }

    public String getVL_CONT_DIFER() {
        return VL_CONT_DIFER;
    }

    public void setVL_CONT_DIFER(String VL_CONT_DIFER) {
        this.VL_CONT_DIFER = VL_CONT_DIFER;
    }

    public String getVL_CONT_DIFER_ANT() {
        return VL_CONT_DIFER_ANT;
    }

    public void setVL_CONT_DIFER_ANT(String VL_CONT_DIFER_ANT) {
        this.VL_CONT_DIFER_ANT = VL_CONT_DIFER_ANT;
    }

    public String getVL_CONT_PER() {
        return VL_CONT_PER;
    }

    public void setVL_CONT_PER(String VL_CONT_PER) {
        this.VL_CONT_PER = VL_CONT_PER;
    }

    public String getVL_REC_BRT() {
        return VL_REC_BRT;
    }

    public void setVL_REC_BRT(String VL_REC_BRT) {
        this.VL_REC_BRT = VL_REC_BRT;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_CONT;
        linha += "|" + VL_REC_BRT;
        linha += "|" + VL_BC_CONT;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + QUANT_BC_COFINS;
        linha += "|" + ALIQ_COFINS_QUANT;
        linha += "|" + VL_CONT_APUR;
        linha += "|" + VL_AJUS_ACRES;
        linha += "|" + VL_AJUS_REDUC;
        linha += "|" + VL_CONT_DIFER;
        linha += "|" + VL_CONT_DIFER_ANT;
        linha += "|" + VL_CONT_PER;
        linha += "|";
        return linha;
    }

}
