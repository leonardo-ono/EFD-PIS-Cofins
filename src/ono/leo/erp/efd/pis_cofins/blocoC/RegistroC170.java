package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C170. 
 * Complemento do documento - Itens do documento (codigos 01, 1B, 04 e 55).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 11:45)
 */
public class RegistroC170 extends Registro {
    
    private String NUM_ITEM = "001";
    private String COD_ITEM = "1";
    private String DESCR_COMPL = "";
    private String QTD = "2,00000";
    private String UNID = "UN";
    private String VL_ITEM = "158,00";
    private String VL_DESC = "0,00";
    private String IND_MOV = "0";
    private String CST_ICMS = "060";
    private String CFOP = "1403";
    private String COD_NAT = "1403";
    private String VL_BC_ICMS = "158,00";
    private String ALIQ_ICMS = "18,00";
    private String VL_ICMS = "31,54";
    private String VL_BC_ICMS_ST = "0,00";
    private String ALIQ_ST = "0,00";
    private String VL_ICMS_ST = "0,00";
    private String IND_APUR = "0";
    private String CST_IPI = "02";
    private String COD_ENQ = "";
    private String VL_BC_IPI = "0,00";
    private String ALIQ_IPI = "0,00";
    private String VL_IPI = "0,00";
    private String CST_PIS = "50";
    private String VL_BC_PIS = "158,00";
    private String ALIQ_PIS_PERC = "1,65";
    private String QUANT_BC_PIS = "";
    private String ALIQ_PIS_REAIS = "";
    private String VL_PIS = "2,61";
    private String CST_COFINS = "50";
    private String VL_BC_COFINS = "158,00";
    private String ALIQ_COFINS_PERC = "7,60";
    private String QUANT_BC_COFINS = "";
    private String ALIQ_COFINS_REAIS = "";
    private String VL_COFINS = "12,01";
    private String COD_CTA = "";
     
    public RegistroC170() {
        super();
        REG = "C170";
        obrigatoriedade = Obrigatoriedade.O_SE;
    }

    public String getALIQ_COFINS_PERC() {
        return ALIQ_COFINS_PERC;
    }

    public void setALIQ_COFINS_PERC(String ALIQ_COFINS_PERC) {
        this.ALIQ_COFINS_PERC = ALIQ_COFINS_PERC;
    }

    public String getALIQ_COFINS_REAIS() {
        return ALIQ_COFINS_REAIS;
    }

    public void setALIQ_COFINS_REAIS(String ALIQ_COFINS_REAIS) {
        this.ALIQ_COFINS_REAIS = ALIQ_COFINS_REAIS;
    }

    public String getALIQ_ICMS() {
        return ALIQ_ICMS;
    }

    public void setALIQ_ICMS(String ALIQ_ICMS) {
        this.ALIQ_ICMS = ALIQ_ICMS;
    }

    public String getALIQ_IPI() {
        return ALIQ_IPI;
    }

    public void setALIQ_IPI(String ALIQ_IPI) {
        this.ALIQ_IPI = ALIQ_IPI;
    }

    public String getALIQ_PIS_PERC() {
        return ALIQ_PIS_PERC;
    }

    public void setALIQ_PIS_PERC(String ALIQ_PIS_PERC) {
        this.ALIQ_PIS_PERC = ALIQ_PIS_PERC;
    }

    public String getALIQ_PIS_REAIS() {
        return ALIQ_PIS_REAIS;
    }

    public void setALIQ_PIS_REAIS(String ALIQ_PIS_REAIS) {
        this.ALIQ_PIS_REAIS = ALIQ_PIS_REAIS;
    }

    public String getALIQ_ST() {
        return ALIQ_ST;
    }

    public void setALIQ_ST(String ALIQ_ST) {
        this.ALIQ_ST = ALIQ_ST;
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

    public String getCOD_ENQ() {
        return COD_ENQ;
    }

    public void setCOD_ENQ(String COD_ENQ) {
        this.COD_ENQ = COD_ENQ;
    }

    public String getCOD_ITEM() {
        return COD_ITEM;
    }

    public void setCOD_ITEM(String COD_ITEM) {
        this.COD_ITEM = COD_ITEM;
    }

    public String getCOD_NAT() {
        return COD_NAT;
    }

    public void setCOD_NAT(String COD_NAT) {
        this.COD_NAT = COD_NAT;
    }

    public String getCST_COFINS() {
        return CST_COFINS;
    }

    public void setCST_COFINS(String CST_COFINS) {
        this.CST_COFINS = CST_COFINS;
    }

    public String getCST_ICMS() {
        return CST_ICMS;
    }

    public void setCST_ICMS(String CST_ICMS) {
        this.CST_ICMS = CST_ICMS;
    }

    public String getCST_IPI() {
        return CST_IPI;
    }

    public void setCST_IPI(String CST_IPI) {
        this.CST_IPI = CST_IPI;
    }

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
    }

    public String getDESCR_COMPL() {
        return DESCR_COMPL;
    }

    public void setDESCR_COMPL(String DESCR_COMPL) {
        this.DESCR_COMPL = DESCR_COMPL;
    }

    public String getIND_APUR() {
        return IND_APUR;
    }

    public void setIND_APUR(String IND_APUR) {
        this.IND_APUR = IND_APUR;
    }

    public String getIND_MOV() {
        return IND_MOV;
    }

    public void setIND_MOV(String IND_MOV) {
        this.IND_MOV = IND_MOV;
    }

    public String getNUM_ITEM() {
        return NUM_ITEM;
    }

    public void setNUM_ITEM(String NUM_ITEM) {
        this.NUM_ITEM = NUM_ITEM;
    }

    public String getQTD() {
        return QTD;
    }

    public void setQTD(String QTD) {
        this.QTD = QTD;
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

    public String getUNID() {
        return UNID;
    }

    public void setUNID(String UNID) {
        this.UNID = UNID;
    }

    public String getVL_BC_COFINS() {
        return VL_BC_COFINS;
    }

    public void setVL_BC_COFINS(String VL_BC_COFINS) {
        this.VL_BC_COFINS = VL_BC_COFINS;
    }

    public String getVL_BC_ICMS() {
        return VL_BC_ICMS;
    }

    public void setVL_BC_ICMS(String VL_BC_ICMS) {
        this.VL_BC_ICMS = VL_BC_ICMS;
    }

    public String getVL_BC_ICMS_ST() {
        return VL_BC_ICMS_ST;
    }

    public void setVL_BC_ICMS_ST(String VL_BC_ICMS_ST) {
        this.VL_BC_ICMS_ST = VL_BC_ICMS_ST;
    }

    public String getVL_BC_IPI() {
        return VL_BC_IPI;
    }

    public void setVL_BC_IPI(String VL_BC_IPI) {
        this.VL_BC_IPI = VL_BC_IPI;
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

    public String getVL_ICMS() {
        return VL_ICMS;
    }

    public void setVL_ICMS(String VL_ICMS) {
        this.VL_ICMS = VL_ICMS;
    }

    public String getVL_ICMS_ST() {
        return VL_ICMS_ST;
    }

    public void setVL_ICMS_ST(String VL_ICMS_ST) {
        this.VL_ICMS_ST = VL_ICMS_ST;
    }

    public String getVL_IPI() {
        return VL_IPI;
    }

    public void setVL_IPI(String VL_IPI) {
        this.VL_IPI = VL_IPI;
    }

    public String getVL_ITEM() {
        return VL_ITEM;
    }

    public void setVL_ITEM(String VL_ITEM) {
        this.VL_ITEM = VL_ITEM;
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
        linha += "|" + NUM_ITEM;
        linha += "|" + COD_ITEM;
        linha += "|" + DESCR_COMPL;
        linha += "|" + QTD;
        linha += "|" + UNID;
        linha += "|" + VL_ITEM;
        linha += "|" + VL_DESC;
        linha += "|" + IND_MOV;
        linha += "|" + CST_ICMS;
        linha += "|" + CFOP;
        linha += "|" + COD_NAT;
        linha += "|" + VL_BC_ICMS;
        linha += "|" + ALIQ_ICMS;
        linha += "|" + VL_ICMS;
        linha += "|" + VL_BC_ICMS_ST;
        linha += "|" + ALIQ_ST;
        linha += "|" + VL_ICMS_ST;
        linha += "|" + IND_APUR;
        linha += "|" + CST_IPI;
        linha += "|" + COD_ENQ;
        linha += "|" + VL_BC_IPI;
        linha += "|" + ALIQ_IPI;
        linha += "|" + VL_IPI;
        linha += "|" + CST_PIS;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS_PERC;
        linha += "|" + QUANT_BC_PIS;
        linha += "|" + ALIQ_PIS_REAIS;
        linha += "|" + VL_PIS;
        linha += "|" + CST_COFINS;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + ALIQ_COFINS_PERC;
        linha += "|" + QUANT_BC_COFINS;
        linha += "|" + ALIQ_COFINS_REAIS;
        linha += "|" + VL_COFINS;
        linha += "|" + COD_CTA;
        linha += "|";
        return linha;
    }

}
