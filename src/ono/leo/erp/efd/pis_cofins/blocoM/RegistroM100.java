package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M100. 
 * Credito de PIS/PASEP relativo ao periodo.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (09/03/2011 12:52)
 */
public class RegistroM100 extends Registro {

    private String COD_CRED = "101";
    private String IND_CRED_ORI = "0";
    private String VL_BC_PIS = "158";
    private String ALIQ_PIS = "1,65";
    private String QUANT_BC_PIS = "0";
    private String ALIQ_PIS_QTDE = "";
    private String VL_CRED = "2,61";
    private String VL_AJUS_ACRES = "0";
    private String VL_AJUS_REDUC = "0";
    private String VL_CRED_DIF = "0";
    private String VL_CRED_DISP = "2,61";
    private String IND_DESC_CRED = "1";
    private String VL_CRED_DESC = "0";
    private String SLD_CRED = "2,61";

    public RegistroM100() {
        REG = "M100";
        REG_PAI = "M001";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_PIS() {
        return ALIQ_PIS;
    }

    public void setALIQ_PIS(String ALIQ_PIS) {
        this.ALIQ_PIS = ALIQ_PIS;
    }

    public String getALIQ_PIS_QTDE() {
        return ALIQ_PIS_QTDE;
    }

    public void setALIQ_PIS_QTDE(String ALIQ_PIS_QTDE) {
        this.ALIQ_PIS_QTDE = ALIQ_PIS_QTDE;
    }

    public String getCOD_CRED() {
        return COD_CRED;
    }

    public void setCOD_CRED(String COD_CRED) {
        this.COD_CRED = COD_CRED;
    }

    public String getIND_CRED_ORI() {
        return IND_CRED_ORI;
    }

    public void setIND_CRED_ORI(String IND_CRED_ORI) {
        this.IND_CRED_ORI = IND_CRED_ORI;
    }

    public String getIND_DESC_CRED() {
        return IND_DESC_CRED;
    }

    public void setIND_DESC_CRED(String IND_DESC_CRED) {
        this.IND_DESC_CRED = IND_DESC_CRED;
    }

    public String getQUANT_BC_PIS() {
        return QUANT_BC_PIS;
    }

    public void setQUANT_BC_PIS(String QUANT_BC_PIS) {
        this.QUANT_BC_PIS = QUANT_BC_PIS;
    }

    public String getSLD_CRED() {
        return SLD_CRED;
    }

    public void setSLD_CRED(String SLD_CRED) {
        this.SLD_CRED = SLD_CRED;
    }

    public String getVL_AJUS_ACRES() {
        return VL_AJUS_ACRES;
    }

    public void setVL_AJUS_ACRES(String VL_AJUS_ACRES) {
        this.VL_AJUS_ACRES = VL_AJUS_ACRES;
    }

    public String getVL_AJUS_REDUC() {
        return VL_AJUS_REDUC;
    }

    public void setVL_AJUS_REDUC(String VL_AJUS_REDUC) {
        this.VL_AJUS_REDUC = VL_AJUS_REDUC;
    }

    public String getVL_BC_PIS() {
        return VL_BC_PIS;
    }

    public void setVL_BC_PIS(String VL_BC_PIS) {
        this.VL_BC_PIS = VL_BC_PIS;
    }

    public String getVL_CRED() {
        return VL_CRED;
    }

    public void setVL_CRED(String VL_CRED) {
        this.VL_CRED = VL_CRED;
    }

    public String getVL_CRED_DESC() {
        return VL_CRED_DESC;
    }

    public void setVL_CRED_DESC(String VL_CRED_DESC) {
        this.VL_CRED_DESC = VL_CRED_DESC;
    }

    public String getVL_CRED_DIF() {
        return VL_CRED_DIF;
    }

    public void setVL_CRED_DIF(String VL_CRED_DIF) {
        this.VL_CRED_DIF = VL_CRED_DIF;
    }

    public String getVL_CRED_DISP() {
        return VL_CRED_DISP;
    }

    public void setVL_CRED_DISP(String VL_CRED_DISP) {
        this.VL_CRED_DISP = VL_CRED_DISP;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_CRED;
        linha += "|" + IND_CRED_ORI;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + QUANT_BC_PIS;
        linha += "|" + ALIQ_PIS_QTDE;
        linha += "|" + VL_CRED;
        linha += "|" + VL_AJUS_ACRES;
        linha += "|" + VL_AJUS_REDUC;
        linha += "|" + VL_CRED_DIF;
        linha += "|" + VL_CRED_DISP;
        linha += "|" + IND_DESC_CRED;
        linha += "|" + VL_CRED_DESC;
        linha += "|" + SLD_CRED;
        linha += "|";
        return linha;
    }
    
}
