package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C500.
 * Nota fiscal/conta de energia eletrica (codigo 06), 
 * nota fiscal/conta de fornecimento d'agua canalizada (codigo 29) e
 * nota fiscal consumo fornecimento de gas (codigo 28) - documentos de
 * entrada/aquisicao com credito.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 12:42)
 */
public class RegistroC500 extends Registro {
    
    private String COD_PART = "";
    private String COD_MOD = "";
    private String COD_SIT = "";
    private String SER = "";
    private String SUB = "";
    private String NUM_DOC = "";
    private String DT_DOC = "";
    private String DT_ENT = "";
    private String VL_DOC = "";
    private String VL_ICMS = "";
    private String COD_INF = "";
    private String VL_PIS = "";
    private String VL_COFINS = "";
 
    public RegistroC500() {
        REG = "C500";
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

    public String getDT_DOC() {
        return DT_DOC;
    }

    public void setDT_DOC(String DT_DOC) {
        this.DT_DOC = DT_DOC;
    }

    public String getDT_ENT() {
        return DT_ENT;
    }

    public void setDT_ENT(String DT_ENT) {
        this.DT_ENT = DT_ENT;
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

    public String getVL_COFINS() {
        return VL_COFINS;
    }

    public void setVL_COFINS(String VL_COFINS) {
        this.VL_COFINS = VL_COFINS;
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

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_PART;
        linha += "|" + COD_MOD;
        linha += "|" + COD_SIT;
        linha += "|" + SER;
        linha += "|" + SUB;
        linha += "|" + NUM_DOC;
        linha += "|" + DT_DOC;
        linha += "|" + DT_ENT;
        linha += "|" + VL_DOC;
        linha += "|" + VL_ICMS;
        linha += "|" + COD_INF;
        linha += "|" + VL_PIS;
        linha += "|" + VL_COFINS;
        linha += "|";
        return linha;
    }

}
