package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1210. 
 * Detalhamento da contribuicao social extemporanea - PIS/PASEP.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 09:40)
 */
public class Registro1210 extends Registro {

    private String CNPJ = "";
    private String CST_PIS = "";
    private String COD_PART = "";
    private String DT_OPER = "";
    private String VL_OPER = "";
    private String VL_BC_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_PIS = "";
    private String COD_CTA = "";
    private String DESC_COMPL = "";
    
    public Registro1210() {
        REG = "1210";
        REG_PAI = "1200";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.O_SE; // se existir registro 1200
    }

    public String getALIQ_PIS() {
        return ALIQ_PIS;
    }

    public void setALIQ_PIS(String ALIQ_PIS) {
        this.ALIQ_PIS = ALIQ_PIS;
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

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
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

    public String getVL_BC_PIS() {
        return VL_BC_PIS;
    }

    public void setVL_BC_PIS(String VL_BC_PIS) {
        this.VL_BC_PIS = VL_BC_PIS;
    }

    public String getVL_OPER() {
        return VL_OPER;
    }

    public void setVL_OPER(String VL_OPER) {
        this.VL_OPER = VL_OPER;
    }

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + CNPJ;
        linha += "|" + CST_PIS;
        linha += "|" + COD_PART;
        linha += "|" + DT_OPER;
        linha += "|" + VL_OPER;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_PIS;
        linha += "|" + COD_CTA;
        linha += "|" + DESC_COMPL;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
