package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C600.
 * Consolidacao diaria de notas fiscais/contas emitidas de energia eletrica
 * (codigo 06), nota fiscal/conta de fornecimento d'agua canalizada (codigo 29)
 * e nota fiscal/conta de fornecimento de gas (codigo 28) (empresas obrigadas
 * ou nao ao CONVENIO ICMS 115/03) - documentos de saida.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 13:02)
 */
public class RegistroC600 extends Registro {
    
    private String COD_MOD = "";
    private String COD_MUN = "";
    private String SER = "";
    private String SUB = "";
    private String COD_CONS = "";
    private String QTD_CONS = "";
    private String QTD_CANC = "";
    private String DT_DOC = "";
    private String VL_DOC = "";
    private String VL_DESC = "";
    private String CONS = "";
    private String VL_FORN = "";
    private String VL_SERV_NT = "";
    private String VL_TERC = "";
    private String VL_DA = "";
    private String VL_BC_ICMS = "";
    private String VL_ICMS = "";
    private String VL_BC_ICMS_ST = "";
    private String VL_ICMS_ST = "";
    private String VL_PIS = "";
    private String VL_COFINS = "";
 
    public RegistroC600() {
        REG = "C600";
        REG_PAI = "C010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_CONS() {
        return COD_CONS;
    }

    public void setCOD_CONS(String COD_CONS) {
        this.COD_CONS = COD_CONS;
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

    public String getCONS() {
        return CONS;
    }

    public void setCONS(String CONS) {
        this.CONS = CONS;
    }

    public String getDT_DOC() {
        return DT_DOC;
    }

    public void setDT_DOC(String DT_DOC) {
        this.DT_DOC = DT_DOC;
    }

    public String getQTD_CANC() {
        return QTD_CANC;
    }

    public void setQTD_CANC(String QTD_CANC) {
        this.QTD_CANC = QTD_CANC;
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

    public String getVL_BC_ICMS_ST() {
        return VL_BC_ICMS_ST;
    }

    public void setVL_BC_ICMS_ST(String VL_BC_ICMS_ST) {
        this.VL_BC_ICMS_ST = VL_BC_ICMS_ST;
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

    public String getVL_FORN() {
        return VL_FORN;
    }

    public void setVL_FORN(String VL_FORN) {
        this.VL_FORN = VL_FORN;
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

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
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
        linha += "|" + COD_CONS;
        linha += "|" + QTD_CONS;
        linha += "|" + QTD_CANC;
        linha += "|" + DT_DOC;
        linha += "|" + VL_DOC;
        linha += "|" + VL_DESC;
        linha += "|" + CONS;
        linha += "|" + VL_FORN;
        linha += "|" + VL_SERV_NT;
        linha += "|" + VL_TERC;
        linha += "|" + VL_DA;
        linha += "|" + VL_BC_ICMS;
        linha += "|" + VL_ICMS;
        linha += "|" + VL_BC_ICMS_ST;
        linha += "|" + VL_ICMS_ST;
        linha += "|" + VL_PIS;
        linha += "|" + VL_COFINS;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
