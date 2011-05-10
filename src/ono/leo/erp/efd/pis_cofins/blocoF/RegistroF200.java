package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F200. 
 * Operacoes da atividade imobiliaria - Unidade imobiliaria vendida.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 11:23)
 */
public class RegistroF200 extends Registro {
    
    private String IND_OPER = "";
    private String UNID_IMOB = "";
    private String IDENT_EMP = "";
    private String DESC_UNID_IMOB = "";
    private String NUM_CONT = "";
    private String CPF_CNPJ_ADQU = "";
    private String DT_OPER = "";
    private String VL_TOT_VEND = "";
    private String VL_REC_ACUM = "";
    private String VL_TOT_REC = "";
    private String CST_PIS = "";
    private String VL_BC_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_PIS = "";
    private String CST_COFINS = "";
    private String VL_BC_COFINS = "";
    private String ALIQ_COFINS = "";
    private String VL_COFINS = "";
    private String PERC_REC_RECEB = "";
    private String IND_NAT_EMP = "";
    private String INF_COMP = "";
    
    public RegistroF200() {
        REG = "F200";
        REG_PAI = "F010";
        nivel = 3;
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

    public String getCPF_CNPJ_ADQU() {
        return CPF_CNPJ_ADQU;
    }

    public void setCPF_CNPJ_ADQU(String CPF_CNPJ_ADQU) {
        this.CPF_CNPJ_ADQU = CPF_CNPJ_ADQU;
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

    public String getDESC_UNID_IMOB() {
        return DESC_UNID_IMOB;
    }

    public void setDESC_UNID_IMOB(String DESC_UNID_IMOB) {
        this.DESC_UNID_IMOB = DESC_UNID_IMOB;
    }

    public String getDT_OPER() {
        return DT_OPER;
    }

    public void setDT_OPER(String DT_OPER) {
        this.DT_OPER = DT_OPER;
    }

    public String getIDENT_EMP() {
        return IDENT_EMP;
    }

    public void setIDENT_EMP(String IDENT_EMP) {
        this.IDENT_EMP = IDENT_EMP;
    }

    public String getIND_NAT_EMP() {
        return IND_NAT_EMP;
    }

    public void setIND_NAT_EMP(String IND_NAT_EMP) {
        this.IND_NAT_EMP = IND_NAT_EMP;
    }

    public String getIND_OPER() {
        return IND_OPER;
    }

    public void setIND_OPER(String IND_OPER) {
        this.IND_OPER = IND_OPER;
    }

    public String getINF_COMP() {
        return INF_COMP;
    }

    public void setINF_COMP(String INF_COMP) {
        this.INF_COMP = INF_COMP;
    }

    public String getNUM_CONT() {
        return NUM_CONT;
    }

    public void setNUM_CONT(String NUM_CONT) {
        this.NUM_CONT = NUM_CONT;
    }

    public String getPERC_REC_RECEB() {
        return PERC_REC_RECEB;
    }

    public void setPERC_REC_RECEB(String PERC_REC_RECEB) {
        this.PERC_REC_RECEB = PERC_REC_RECEB;
    }

    public String getUNID_IMOB() {
        return UNID_IMOB;
    }

    public void setUNID_IMOB(String UNID_IMOB) {
        this.UNID_IMOB = UNID_IMOB;
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

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
    }

    public String getVL_REC_ACUM() {
        return VL_REC_ACUM;
    }

    public void setVL_REC_ACUM(String VL_REC_ACUM) {
        this.VL_REC_ACUM = VL_REC_ACUM;
    }

    public String getVL_TOT_REC() {
        return VL_TOT_REC;
    }

    public void setVL_TOT_REC(String VL_TOT_REC) {
        this.VL_TOT_REC = VL_TOT_REC;
    }

    public String getVL_TOT_VEND() {
        return VL_TOT_VEND;
    }

    public void setVL_TOT_VEND(String VL_TOT_VEND) {
        this.VL_TOT_VEND = VL_TOT_VEND;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_OPER;
        linha += "|" + UNID_IMOB;
        linha += "|" + IDENT_EMP;
        linha += "|" + DESC_UNID_IMOB;
        linha += "|" + NUM_CONT;
        linha += "|" + CPF_CNPJ_ADQU;
        linha += "|" + DT_OPER;
        linha += "|" + VL_TOT_VEND;
        linha += "|" + VL_REC_ACUM;
        linha += "|" + VL_TOT_REC;
        linha += "|" + CST_PIS;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_PIS;
        linha += "|" + CST_COFINS;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + VL_COFINS;
        linha += "|" + PERC_REC_RECEB;
        linha += "|" + IND_NAT_EMP;
        linha += "|" + INF_COMP;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
