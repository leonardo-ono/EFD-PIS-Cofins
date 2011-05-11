package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F150. 
 * Credito presumido sobre estoque de abertura.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 11:13)
 */
public class RegistroF150 extends Registro {
    
    private String NAT_BC_CRED = "";
    private String VL_TOT_EST = "";
    private String EST_IMP = "";
    private String VL_BC_EST = "";
    private String VL_BC_MEN_EST = "";
    private String CST_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_CRED_PIS = "";
    private String CST_COFINS = "";
    private String ALIQ_COFINS = "";
    private String VL_CRED_COFINS = "";
    private String DESC_EST = "";
    private String COD_CTA = "";
    
    public RegistroF150() {
        REG = "F150";
        REG_PAI = "F010";
        nivel = 3;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
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

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
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

    public String getDESC_EST() {
        return DESC_EST;
    }

    public void setDESC_EST(String DESC_EST) {
        this.DESC_EST = DESC_EST;
    }

    public String getEST_IMP() {
        return EST_IMP;
    }

    public void setEST_IMP(String EST_IMP) {
        this.EST_IMP = EST_IMP;
    }

    public String getNAT_BC_CRED() {
        return NAT_BC_CRED;
    }

    public void setNAT_BC_CRED(String NAT_BC_CRED) {
        this.NAT_BC_CRED = NAT_BC_CRED;
    }

    public String getVL_BC_EST() {
        return VL_BC_EST;
    }

    public void setVL_BC_EST(String VL_BC_EST) {
        this.VL_BC_EST = VL_BC_EST;
    }

    public String getVL_BC_MEN_EST() {
        return VL_BC_MEN_EST;
    }

    public void setVL_BC_MEN_EST(String VL_BC_MEN_EST) {
        this.VL_BC_MEN_EST = VL_BC_MEN_EST;
    }

    public String getVL_CRED_COFINS() {
        return VL_CRED_COFINS;
    }

    public void setVL_CRED_COFINS(String VL_CRED_COFINS) {
        this.VL_CRED_COFINS = VL_CRED_COFINS;
    }

    public String getVL_CRED_PIS() {
        return VL_CRED_PIS;
    }

    public void setVL_CRED_PIS(String VL_CRED_PIS) {
        this.VL_CRED_PIS = VL_CRED_PIS;
    }

    public String getVL_TOT_EST() {
        return VL_TOT_EST;
    }

    public void setVL_TOT_EST(String VL_TOT_EST) {
        this.VL_TOT_EST = VL_TOT_EST;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NAT_BC_CRED;
        linha += "|" + VL_TOT_EST;
        linha += "|" + EST_IMP;
        linha += "|" + VL_BC_EST;
        linha += "|" + VL_BC_MEN_EST;
        linha += "|" + CST_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_CRED_PIS;
        linha += "|" + CST_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + VL_CRED_COFINS;
        linha += "|" + DESC_EST;
        linha += "|" + COD_CTA;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
