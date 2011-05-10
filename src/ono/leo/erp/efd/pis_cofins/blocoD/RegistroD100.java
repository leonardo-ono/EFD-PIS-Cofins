package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D100. 
 * Aquisiscao de servicos de transporte - Nota fiscal de servico de transporte
 * (codigo 07) e conhecimentos de transporte rodoviario de cargas (codigo 08),
 * Conhecimento de transporte de cargas avulso (codigo 8B), aquaviario de 
 * cargas (codigo 09), aereo (codigo 10), ferroviario de cargas (codigo 11),
 * multimodal de cargas (codigo 26), nota fiscal de transporte ferroviario de
 * carga (codigo 27) e conhecimento de transporte eletronico - CT-e (codigo 57).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 10:11)
 */
public class RegistroD100 extends Registro {
    
    private String IND_OPER = "";
    private String IND_EMIT = "";
    private String COD_PART = "";
    private String COD_MOD = "";
    private String COD_SIT = "";
    private String SER = "";
    private String SUB = "";
    private String NUM_DOC = "";
    private String CHV_CTE = "";
    private String DT_DOC = "";
    private String DT_A_P = "";
    private String TP_CTE = "";
    private String CHV_CTE_REF = "";
    private String VL_DOC = "";
    private String VL_DESC = "";
    private String IND_FRT = "";
    private String VL_SERV = "";
    private String VL_BC_ICMS = "";
    private String VL_ICMS = "";
    private String VL_NT = "";
    private String COD_INF = "";
    private String COD_CTA = "";
    
    public RegistroD100() {
        REG = "D100";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCHV_CTE() {
        return CHV_CTE;
    }

    public void setCHV_CTE(String CHV_CTE) {
        this.CHV_CTE = CHV_CTE;
    }

    public String getCHV_CTE_REF() {
        return CHV_CTE_REF;
    }

    public void setCHV_CTE_REF(String CHV_CTE_REF) {
        this.CHV_CTE_REF = CHV_CTE_REF;
    }

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
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

    public String getIND_FRT() {
        return IND_FRT;
    }

    public void setIND_FRT(String IND_FRT) {
        this.IND_FRT = IND_FRT;
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

    public String getTP_CTE() {
        return TP_CTE;
    }

    public void setTP_CTE(String TP_CTE) {
        this.TP_CTE = TP_CTE;
    }

    public String getVL_BC_ICMS() {
        return VL_BC_ICMS;
    }

    public void setVL_BC_ICMS(String VL_BC_ICMS) {
        this.VL_BC_ICMS = VL_BC_ICMS;
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

    public String getVL_NT() {
        return VL_NT;
    }

    public void setVL_NT(String VL_NT) {
        this.VL_NT = VL_NT;
    }

    public String getVL_SERV() {
        return VL_SERV;
    }

    public void setVL_SERV(String VL_SERV) {
        this.VL_SERV = VL_SERV;
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
        linha += "|" + CHV_CTE;
        linha += "|" + DT_DOC;
        linha += "|" + DT_A_P;
        linha += "|" + TP_CTE;
        linha += "|" + CHV_CTE_REF;
        linha += "|" + VL_DOC;
        linha += "|" + VL_DESC;
        linha += "|" + IND_FRT;
        linha += "|" + VL_SERV;
        linha += "|" + VL_BC_ICMS;
        linha += "|" + VL_ICMS;
        linha += "|" + VL_NT;
        linha += "|" + COD_INF;
        linha += "|" + COD_CTA;
        linha += "|";
        return linha;
    }

}
