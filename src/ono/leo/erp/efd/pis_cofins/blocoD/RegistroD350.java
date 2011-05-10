package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D350. 
 * Resumo diario de cupom fiscal emitido por ECF - 
 * (codigos 2E, 13, 14, 15, e 16).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 11:06)
 */
public class RegistroD350 extends Registro {
    
    private String COD_MOD = "";
    private String ECF_MOD = "";
    private String ECF_FAB = "";
    private String DT_DOC = "";
    private String CRO = "";
    private String CRZ = "";
    private String NUM_COO_FIN = "";
    private String GT_FIN = "";
    private String VL_BRT = "";
    private String CST_PIS = "";
    private String VL_BC_PIS = "";
    private String ALIQ_PIS = "";
    private String QUANT_BC_PIS = "";
    private String ALIQ_PIS_QUANT = "";
    private String VL_PIS = "";
    private String CST_COFINS = "";
    private String VL_BC_COFINS = "";
    private String ALIQ_COFINS = "";
    private String QUANT_BC_COFINS = "";
    private String ALIQ_COFINS_QUANT = "";
    private String VL_COFINS = "";
    private String COD_CTA = "";
    
    public RegistroD350() {
        REG = "D350";
        REG_PAI = "D010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
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

    public String getALIQ_PIS() {
        return ALIQ_PIS;
    }

    public void setALIQ_PIS(String ALIQ_PIS) {
        this.ALIQ_PIS = ALIQ_PIS;
    }

    public String getALIQ_PIS_QUANT() {
        return ALIQ_PIS_QUANT;
    }

    public void setALIQ_PIS_QUANT(String ALIQ_PIS_QUANT) {
        this.ALIQ_PIS_QUANT = ALIQ_PIS_QUANT;
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

    public String getCRO() {
        return CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }

    public String getCRZ() {
        return CRZ;
    }

    public void setCRZ(String CRZ) {
        this.CRZ = CRZ;
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

    public String getDT_DOC() {
        return DT_DOC;
    }

    public void setDT_DOC(String DT_DOC) {
        this.DT_DOC = DT_DOC;
    }

    public String getECF_FAB() {
        return ECF_FAB;
    }

    public void setECF_FAB(String ECF_FAB) {
        this.ECF_FAB = ECF_FAB;
    }

    public String getECF_MOD() {
        return ECF_MOD;
    }

    public void setECF_MOD(String ECF_MOD) {
        this.ECF_MOD = ECF_MOD;
    }

    public String getGT_FIN() {
        return GT_FIN;
    }

    public void setGT_FIN(String GT_FIN) {
        this.GT_FIN = GT_FIN;
    }

    public String getNUM_COO_FIN() {
        return NUM_COO_FIN;
    }

    public void setNUM_COO_FIN(String NUM_COO_FIN) {
        this.NUM_COO_FIN = NUM_COO_FIN;
    }

    public String getQUANT_BC_COFINS() {
        return QUANT_BC_COFINS;
    }

    public void setQUANT_BC_COFINS(String QUANT_BC_COFINS) {
        this.QUANT_BC_COFINS = QUANT_BC_COFINS;
    }

    public String getQUANT_BC_PIS() {
        return QUANT_BC_PIS;
    }

    public void setQUANT_BC_PIS(String QUANT_BC_PIS) {
        this.QUANT_BC_PIS = QUANT_BC_PIS;
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

    public String getVL_BRT() {
        return VL_BRT;
    }

    public void setVL_BRT(String VL_BRT) {
        this.VL_BRT = VL_BRT;
    }

    public String getVL_COFINS() {
        return VL_COFINS;
    }

    public void setVL_COFINS(String VL_COFINS) {
        this.VL_COFINS = VL_COFINS;
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
        linha += "|" + ECF_MOD;
        linha += "|" + ECF_FAB;
        linha += "|" + DT_DOC;
        linha += "|" + CRO;
        linha += "|" + CRZ;
        linha += "|" + NUM_COO_FIN;
        linha += "|" + GT_FIN;
        linha += "|" + VL_BRT;
        linha += "|" + CST_PIS;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + QUANT_BC_PIS;
        linha += "|" + ALIQ_PIS_QUANT;
        linha += "|" + VL_PIS;
        linha += "|" + CST_COFINS;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + QUANT_BC_COFINS;
        linha += "|" + ALIQ_COFINS_QUANT;
        linha += "|" + VL_COFINS;
        linha += "|" + COD_CTA;
        linha += "|";
        return linha;
    }

}
