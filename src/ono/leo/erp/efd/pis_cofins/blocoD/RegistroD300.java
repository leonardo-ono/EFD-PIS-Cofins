package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D300. 
 * Resumo da escrituracao diaria - Bilhetes consolidados de passagem 
 * rodoviario (codigo 13), de passagem aquaviario (codigo 14), de passagem e 
 * nota de bagagem (codigo 15) e de passagem ferroviario (codigo 16).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 10:54)
 */
public class RegistroD300 extends Registro {
    
    private String COD_MOD = "";
    private String SER = "";
    private String SUB = "";
    private String NUM_DOC_INI = "";
    private String NUM_DOC_FIN = "";
    private String CFOP = "";
    private String DT_REF = "";
    private String VL_DOC = "";
    private String VL_DESC = "";
    private String CST_PIS = "";
    private String VL_BC_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_PIS = "";
    private String CST_COFINS = "";
    private String VL_BC_COFINS = "";
    private String ALIQ_COFINS = "";
    private String VL_COFINS = "";
    private String COD_CTA = "";
    
    public RegistroD300() {
        REG = "D300";
        REG_PAI = "D010";
        nivel = 3;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_COFINS() {
        return ALIQ_COFINS;
    }

    public void setALIQ_COFINS(String ALIQ_COFINS) {
        this.ALIQ_COFINS = ALIQ_COFINS;
    }

    public String getALIQ_PIS() {
        return ALIQ_PIS;
    }

    public void setALIQ_PIS(String ALIQ_PIS) {
        this.ALIQ_PIS = ALIQ_PIS;
    }

    public String getCFOP() {
        return CFOP;
    }

    public void setCFOP(String CFOP) {
        this.CFOP = CFOP;
    }

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getCST_COFINS() {
        return CST_COFINS;
    }

    public void setCST_COFINS(String CST_COFINS) {
        this.CST_COFINS = CST_COFINS;
    }

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
    }

    public String getDT_REF() {
        return DT_REF;
    }

    public void setDT_REF(String DT_REF) {
        this.DT_REF = DT_REF;
    }

    public String getNUM_DOC_FIN() {
        return NUM_DOC_FIN;
    }

    public void setNUM_DOC_FIN(String NUM_DOC_FIN) {
        this.NUM_DOC_FIN = NUM_DOC_FIN;
    }

    public String getNUM_DOC_INI() {
        return NUM_DOC_INI;
    }

    public void setNUM_DOC_INI(String NUM_DOC_INI) {
        this.NUM_DOC_INI = NUM_DOC_INI;
    }

    public String getSER() {
        return SER;
    }

    public void setSER(String SER) {
        this.SER = SER;
    }

    public String getSUB() {
        return SUB;
    }

    public void setSUB(String SUB) {
        this.SUB = SUB;
    }

    public String getVL_BC_COFINS() {
        return VL_BC_COFINS;
    }

    public void setVL_BC_COFINS(String VL_BC_COFINS) {
        this.VL_BC_COFINS = VL_BC_COFINS;
    }

    public String getVL_BC_PIS() {
        return VL_BC_PIS;
    }

    public void setVL_BC_PIS(String VL_BC_PIS) {
        this.VL_BC_PIS = VL_BC_PIS;
    }

    public String getVL_COFINS() {
        return VL_COFINS;
    }

    public void setVL_COFINS(String VL_COFINS) {
        this.VL_COFINS = VL_COFINS;
    }

    public String getVL_DESC() {
        return VL_DESC;
    }

    public void setVL_DESC(String VL_DESC) {
        this.VL_DESC = VL_DESC;
    }

    public String getVL_DOC() {
        return VL_DOC;
    }

    public void setVL_DOC(String VL_DOC) {
        this.VL_DOC = VL_DOC;
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
        linha += "|" + COD_MOD;
        linha += "|" + SER;
        linha += "|" + SUB;
        linha += "|" + NUM_DOC_INI;
        linha += "|" + NUM_DOC_FIN;
        linha += "|" + CFOP;
        linha += "|" + DT_REF;
        linha += "|" + VL_DOC;
        linha += "|" + VL_DESC;
        linha += "|" + CST_PIS;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_PIS;
        linha += "|" + CST_COFINS;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + VL_COFINS;
        linha += "|" + COD_CTA;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
