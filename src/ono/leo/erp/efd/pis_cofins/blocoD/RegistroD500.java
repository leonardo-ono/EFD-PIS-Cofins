package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D500
 * Nota fiscal de servico de comunicacao (codigo 21) e nota fiscal de servico
 * de telecomunicacao (codigo 22) - documentos de aquisicao com direito a 
 * credito.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 11:19)
 */
public class RegistroD500 extends Registro {
    
    private String IND_OPER = "";
    private String IND_EMIT = "";
    private String COD_PART = "";
    private String COD_MOD = "";
    private String COD_SIT = "";
    private String SER = "";
    private String SUB = "";
    private String NUM_DOC = "";
    private String DT_DOC = "";
    private String DT_A_P = "";
    private String VL_DOC = "";
    private String VL_DESC = "";
    private String VL_SERV = "";
    private String VL_SERV_NT = "";
    private String VL_TERC = "";
    private String VL_DA = "";
    private String VL_BC_ICMS = "";
    private String VL_ICMS = "";
    private String COD_INF = "";
    private String VL_PIS = "";
    private String VL_COFINS = "";
    
    public RegistroD500() {
        REG = "D500";
        REG_PAI = "D010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_INF() {
        return COD_INF;
    }

    public void setCOD_INF(String COD_INF) {
        this.COD_INF = COD_INF;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getCOD_PART() {
        return COD_PART;
    }

    public void setCOD_PART(String COD_PART) {
        this.COD_PART = COD_PART;
    }

    public String getCOD_SIT() {
        return COD_SIT;
    }

    public void setCOD_SIT(String COD_SIT) {
        this.COD_SIT = COD_SIT;
    }

    public String getDT_A_P() {
        return DT_A_P;
    }

    public void setDT_A_P(String DT_A_P) {
        this.DT_A_P = DT_A_P;
    }

    public String getDT_DOC() {
        return DT_DOC;
    }

    public void setDT_DOC(String DT_DOC) {
        this.DT_DOC = DT_DOC;
    }

    public String getIND_EMIT() {
        return IND_EMIT;
    }

    public void setIND_EMIT(String IND_EMIT) {
        this.IND_EMIT = IND_EMIT;
    }

    public String getIND_OPER() {
        return IND_OPER;
    }

    public void setIND_OPER(String IND_OPER) {
        this.IND_OPER = IND_OPER;
    }

    public String getNUM_DOC() {
        return NUM_DOC;
    }

    public void setNUM_DOC(String NUM_DOC) {
        this.NUM_DOC = NUM_DOC;
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

    public String getVL_BC_ICMS() {
        return VL_BC_ICMS;
    }

    public void setVL_BC_ICMS(String VL_BC_ICMS) {
        this.VL_BC_ICMS = VL_BC_ICMS;
    }

    public String getVL_COFINS() {
        return VL_COFINS;
    }

    public void setVL_COFINS(String VL_COFINS) {
        this.VL_COFINS = VL_COFINS;
    }

    public String getVL_DA() {
        return VL_DA;
    }

    public void setVL_DA(String VL_DA) {
        this.VL_DA = VL_DA;
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

    public String getVL_ICMS() {
        return VL_ICMS;
    }

    public void setVL_ICMS(String VL_ICMS) {
        this.VL_ICMS = VL_ICMS;
    }

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
    }

    public String getVL_SERV() {
        return VL_SERV;
    }

    public void setVL_SERV(String VL_SERV) {
        this.VL_SERV = VL_SERV;
    }

    public String getVL_SERV_NT() {
        return VL_SERV_NT;
    }

    public void setVL_SERV_NT(String VL_SERV_NT) {
        this.VL_SERV_NT = VL_SERV_NT;
    }

    public String getVL_TERC() {
        return VL_TERC;
    }

    public void setVL_TERC(String VL_TERC) {
        this.VL_TERC = VL_TERC;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_OPER;
        linha += "|" + IND_EMIT;
        linha += "|" + COD_PART;
        linha += "|" + COD_MOD;
        linha += "|" + COD_SIT;
        linha += "|" + SER;
        linha += "|" + SUB;
        linha += "|" + NUM_DOC;
        linha += "|" + DT_DOC;
        linha += "|" + DT_A_P;
        linha += "|" + VL_DOC;
        linha += "|" + VL_DESC;
        linha += "|" + VL_SERV;
        linha += "|" + VL_SERV_NT;
        linha += "|" + VL_TERC;
        linha += "|" + VL_DA;
        linha += "|" + VL_BC_ICMS;
        linha += "|" + VL_ICMS;
        linha += "|" + COD_INF;
        linha += "|" + VL_PIS;
        linha += "|" + VL_COFINS;
        linha += "|";
        return linha;
    }

}
