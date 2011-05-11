package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C100. 
 * Documento - Nota Fiscal (Codigo 01), Nota Fiscal Avulsa (Codigo 1B), 
 *             Nota Fiscal de Produtor (Codigo 04) e NFe (Codigo 55).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 11:39)
 */
public class RegistroC100 extends Registro {
    
    private String IND_OPER = "0";
    private String IND_EMIT = "1";
    private String COD_PART = "122";
    private String COD_MOD = "55";
    private String COD_SIT = "00";
    private String SER = "2";
    private String NUM_DOC = "8038";
    private String CHV_NFE = "";
    private String DT_DOC = "03012011";
    private String DT_E_S = "03012011";
    private String VL_DOC = "316,00";
    private String IND_PGTO = "1";
    private String VL_DESC = "0,00";
    private String VL_ABAT_NT = "0,00";
    private String VL_MERC = "316,00";
    private String IND_FRT = "1";
    private String VL_FRT = "0,00";
    private String VL_SEG = "0,00";
    private String VL_OUT_DA = "0,00";
    private String VL_BC_ICMS = "0,00";
    private String VL_ICMS = "0,00";
    private String VL_BC_ICMS_ST = "316,00";
    private String VL_ICMS_ST = "316,00";
    private String VL_IPI = "0,00";
    private String VL_PIS = "2,61";
    private String VL_COFINS = "12,01";
    private String VL_PIS_ST = "0,00";
    private String VL_COFINS_ST = "0,00";
 
    public RegistroC100() {
        super();
        REG = "C100";
        REG_PAI = "C010";
        nivel = 3;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
        obrigatoriedade = Obrigatoriedade.O_SE;
    }

    public String getCHV_NFE() {
        return CHV_NFE;
    }

    public void setCHV_NFE(String CHV_NFE) {
        this.CHV_NFE = CHV_NFE;
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

    public String getDT_E_S() {
        return DT_E_S;
    }

    public void setDT_E_S(String DT_E_S) {
        this.DT_E_S = DT_E_S;
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

    public String getIND_PGTO() {
        return IND_PGTO;
    }

    public void setIND_PGTO(String IND_PGTO) {
        this.IND_PGTO = IND_PGTO;
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

    public String getVL_ABAT_NT() {
        return VL_ABAT_NT;
    }

    public void setVL_ABAT_NT(String VL_ABAT_NT) {
        this.VL_ABAT_NT = VL_ABAT_NT;
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

    public String getVL_COFINS_ST() {
        return VL_COFINS_ST;
    }

    public void setVL_COFINS_ST(String VL_COFINS_ST) {
        this.VL_COFINS_ST = VL_COFINS_ST;
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

    public String getVL_FRT() {
        return VL_FRT;
    }

    public void setVL_FRT(String VL_FRT) {
        this.VL_FRT = VL_FRT;
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

    public String getVL_MERC() {
        return VL_MERC;
    }

    public void setVL_MERC(String VL_MERC) {
        this.VL_MERC = VL_MERC;
    }

    public String getVL_OUT_DA() {
        return VL_OUT_DA;
    }

    public void setVL_OUT_DA(String VL_OUT_DA) {
        this.VL_OUT_DA = VL_OUT_DA;
    }

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
    }

    public String getVL_PIS_ST() {
        return VL_PIS_ST;
    }

    public void setVL_PIS_ST(String VL_PIS_ST) {
        this.VL_PIS_ST = VL_PIS_ST;
    }

    public String getVL_SEG() {
        return VL_SEG;
    }

    public void setVL_SEG(String VL_SEG) {
        this.VL_SEG = VL_SEG;
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
        linha += "|" + NUM_DOC;
        linha += "|" + CHV_NFE;
        linha += "|" + DT_DOC;
        linha += "|" + DT_E_S;
        linha += "|" + VL_DOC;
        linha += "|" + IND_PGTO;
        linha += "|" + VL_DESC;
        linha += "|" + VL_ABAT_NT;
        linha += "|" + VL_MERC;
        linha += "|" + IND_FRT;
        linha += "|" + VL_FRT;
        linha += "|" + VL_SEG;
        linha += "|" + VL_OUT_DA;
        linha += "|" + VL_BC_ICMS;
        linha += "|" + VL_ICMS;
        linha += "|" + VL_BC_ICMS_ST;
        linha += "|" + VL_ICMS_ST;
        linha += "|" + VL_IPI;
        linha += "|" + VL_PIS;
        linha += "|" + VL_COFINS;
        linha += "|" + VL_PIS_ST;
        linha += "|" + VL_COFINS_ST;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
