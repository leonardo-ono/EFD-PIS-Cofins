package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M500. 
 * Credito de COFINS relativo ao periodo.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (09/03/2011 13:11)
 */
public class RegistroM500 extends Registro {

    private String COD_CRED = "101";
    private String IND_CRED_ORI = "0";
    private String VL_BC_COFINS = "158";
    private String ALIQ_COFINS = "7,6";
    private String QUANT_BC_COFINS = "0";
    private String ALIQ_COFINS_QTDE = "";
    private String VL_CRED = "12,01";
    private String VL_AJUS_ACRES = "0";
    private String VL_AJUS_REDUC = "0";
    private String VL_CRED_DIF = "0";
    private String VL_CRED_DISP = "12,01";
    private String IND_DESC_CRED = "1";
    private String VL_CRED_DESC = "0";
    private String SLD_CRED = "12,01";

    public RegistroM500() {
        super();
        REG = "M500";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_COFINS() {
        return ALIQ_COFINS;
    }

    public void setALIQ_COFINS(String ALIQ_COFINS) {
        this.ALIQ_COFINS = ALIQ_COFINS;
    }

    public String getALIQ_COFINS_QTDE() {
        return ALIQ_COFINS_QTDE;
    }

    public void setALIQ_COFINS_QTDE(String ALIQ_COFINS_QTDE) {
        this.ALIQ_COFINS_QTDE = ALIQ_COFINS_QTDE;
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

    public String getQUANT_BC_COFINS() {
        return QUANT_BC_COFINS;
    }

    public void setQUANT_BC_COFINS(String QUANT_BC_COFINS) {
        this.QUANT_BC_COFINS = QUANT_BC_COFINS;
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

    public String getVL_BC_COFINS() {
        return VL_BC_COFINS;
    }

    public void setVL_BC_COFINS(String VL_BC_COFINS) {
        this.VL_BC_COFINS = VL_BC_COFINS;
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
        linha += "|" + VL_BC_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + QUANT_BC_COFINS;
        linha += "|" + ALIQ_COFINS_QTDE;
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
