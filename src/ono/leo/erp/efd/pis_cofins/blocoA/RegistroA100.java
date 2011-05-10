package ono.leo.erp.efd.pis_cofins.blocoA;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro A100. 
 * Documento - nota fiscal de servico.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 20:23)
 */
public class RegistroA100 extends Registro {
    
    private String IND_OPER = "";
    private String IND_EMIT = "";
    private String COD_PART = "";
    private String COD_SIT = "";
    private String SER = "";
    private String SUB = "";
    private String NUM_DOC = "";
    private String CHV_NFSE = "";
    private String DT_DOC = "";
    private String DT_EXE_SERV = "";
    private String VL_DOC = "";
    private String IND_PGTO = "";
    private String VL_DESC = "";
    private String VL_BC_PIS = "";
    private String VL_PIS = "";
    private String VL_BC_COFINS = "";
    private String VL_COFINS = "";
    private String VL_PIS_RET = "";
    private String VL_COFINS_RET = "";
    private String VL_ISS = "";
    
    public RegistroA100() {
        REG = "A100";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCHV_NFSE() {
        return CHV_NFSE;
    }

    public void setCHV_NFSE(String CHV_NFSE) {
        this.CHV_NFSE = CHV_NFSE;
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

    public String getDT_EXE_SERV() {
        return DT_EXE_SERV;
    }

    public void setDT_EXE_SERV(String DT_EXE_SERV) {
        this.DT_EXE_SERV = DT_EXE_SERV;
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

    public String getVL_COFINS_RET() {
        return VL_COFINS_RET;
    }

    public void setVL_COFINS_RET(String VL_COFINS_RET) {
        this.VL_COFINS_RET = VL_COFINS_RET;
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

    public String getVL_ISS() {
        return VL_ISS;
    }

    public void setVL_ISS(String VL_ISS) {
        this.VL_ISS = VL_ISS;
    }

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
    }

    public String getVL_PIS_RET() {
        return VL_PIS_RET;
    }

    public void setVL_PIS_RET(String VL_PIS_RET) {
        this.VL_PIS_RET = VL_PIS_RET;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_OPER;
        linha += "|" + IND_EMIT;
        linha += "|" + COD_PART;
        linha += "|" + COD_SIT;
        linha += "|" + SER;
        linha += "|" + SUB;
        linha += "|" + NUM_DOC;
        linha += "|" + CHV_NFSE;
        linha += "|" + DT_DOC;
        linha += "|" + DT_EXE_SERV;
        linha += "|" + VL_DOC;
        linha += "|" + IND_PGTO;
        linha += "|" + VL_DESC;
        linha += "|" + VL_BC_PIS;
        linha += "|" + VL_PIS;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + VL_COFINS;
        linha += "|" + VL_PIS_RET;
        linha += "|" + VL_COFINS_RET;
        linha += "|" + VL_ISS;
        linha += "|";
        return linha;
    }

}
