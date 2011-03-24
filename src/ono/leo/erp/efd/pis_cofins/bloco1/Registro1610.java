package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1610. 
 * Detalhamento da contribuicao social extemporanea - Cofins.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 11:26)
 */
public class Registro1610 extends Registro {

    private String CNPJ = "";
    private String CST_COFINS = "";
    private String COD_PART = "";
    private String DT_OPER = "";
    private String VL_OPER = "";
    private String VL_BC_COFINS = "";
    private String ALIQ_COFINS = "";
    private String VL_COFINS = "";
    private String COD_CTA = "";
    private String DESC_COMPL = "";
    
    public Registro1610() {
        REG = "1610";
        obrigatoriedade = Obrigatoriedade.O_SE; // se existir 1600
    }

    public String getALIQ_COFINS() {
        return ALIQ_COFINS;
    }

    public void setALIQ_COFINS(String ALIQ_COFINS) {
        this.ALIQ_COFINS = ALIQ_COFINS;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
    }

    public String getCOD_PART() {
        return COD_PART;
    }

    public void setCOD_PART(String COD_PART) {
        this.COD_PART = COD_PART;
    }

    public String getCST_COFINS() {
        return CST_COFINS;
    }

    public void setCST_COFINS(String CST_COFINS) {
        this.CST_COFINS = CST_COFINS;
    }

    public String getDESC_COMPL() {
        return DESC_COMPL;
    }

    public void setDESC_COMPL(String DESC_COMPL) {
        this.DESC_COMPL = DESC_COMPL;
    }

    public String getDT_OPER() {
        return DT_OPER;
    }

    public void setDT_OPER(String DT_OPER) {
        this.DT_OPER = DT_OPER;
    }

    public String getVL_BC_COFINS() {
        return VL_BC_COFINS;
    }

    public void setVL_BC_COFINS(String VL_BC_COFINS) {
        this.VL_BC_COFINS = VL_BC_COFINS;
    }

    public String getVL_COFINS() {
        return VL_COFINS;
    }

    public void setVL_COFINS(String VL_COFINS) {
        this.VL_COFINS = VL_COFINS;
    }

    public String getVL_OPER() {
        return VL_OPER;
    }

    public void setVL_OPER(String VL_OPER) {
        this.VL_OPER = VL_OPER;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + CNPJ;
        linha += "|" + CST_COFINS;
        linha += "|" + COD_PART;
        linha += "|" + DT_OPER;
        linha += "|" + VL_OPER;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + VL_COFINS;
        linha += "|" + COD_CTA;
        linha += "|" + DESC_COMPL;
        linha += "|";
        return linha;
    }

}
