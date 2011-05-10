package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D600. 
 * Consolidacao da prestacao de servicos - Notas de servico de comunicacao
 * (codigo 21) e de servico de telecomunicacao (codigo 22).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 11:40)
 */
public class RegistroD600 extends Registro {
    
    private String COD_MOD = "";
    private String COD_MUN = "";
    private String SER = "";
    private String SUB = "";
    private String IND_REC = "";
    private String QTD_CONS = "";
    private String DT_DOC_INI = "";
    private String DT_DOC_FIN = "";
    private String VL_DOC = "";
    private String VL_DESC = "";
    private String VL_SERV = "";
    private String VL_SERV_NT = "";
    private String VL_TERC = "";
    private String VL_DA = "";
    private String VL_BC_ICMS = "";
    private String VL_ICMS = "";
    private String VL_PIS = "";
    private String VL_COFINS = "";
    
    public RegistroD600() {
        REG = "D600";
        REG_PAI = "D010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getCOD_MUN() {
        return COD_MUN;
    }

    public void setCOD_MUN(String COD_MUN) {
        this.COD_MUN = COD_MUN;
    }

    public String getDT_DOC_FIN() {
        return DT_DOC_FIN;
    }

    public void setDT_DOC_FIN(String DT_DOC_FIN) {
        this.DT_DOC_FIN = DT_DOC_FIN;
    }

    public String getDT_DOC_INI() {
        return DT_DOC_INI;
    }

    public void setDT_DOC_INI(String DT_DOC_INI) {
        this.DT_DOC_INI = DT_DOC_INI;
    }

    public String getIND_REC() {
        return IND_REC;
    }

    public void setIND_REC(String IND_REC) {
        this.IND_REC = IND_REC;
    }

    public String getQTD_CONS() {
        return QTD_CONS;
    }

    public void setQTD_CONS(String QTD_CONS) {
        this.QTD_CONS = QTD_CONS;
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
        linha += "|" + COD_MOD;
        linha += "|" + COD_MUN;
        linha += "|" + SER;
        linha += "|" + SUB;
        linha += "|" + IND_REC;
        linha += "|" + QTD_CONS;
        linha += "|" + DT_DOC_INI;
        linha += "|" + DT_DOC_FIN;
        linha += "|" + VL_DOC;
        linha += "|" + VL_DESC;
        linha += "|" + VL_SERV;
        linha += "|" + VL_SERV_NT;
        linha += "|" + VL_TERC;
        linha += "|" + VL_DA;
        linha += "|" + VL_BC_ICMS;
        linha += "|" + VL_ICMS;
        linha += "|" + VL_PIS;
        linha += "|" + VL_COFINS;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
