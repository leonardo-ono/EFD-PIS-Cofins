package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1100. 
 * Controle de creditos fiscais - PIS/PASEP
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 10:04)
 */
public class Registro1100 extends Registro {

    private String PER_APU_CRED = "";
    private String ORIG_CRED = "";
    private String CNPJ_SUC = "";
    private String COD_CRED = "";
    private String VL_CRED_APU = "";
    private String VL_CRED_EXT_APU = "";
    private String VL_TOT_CRED_APU = "";
    private String VL_CRED_DESC_PA_ANT = "";
    private String VL_CRED_PER_PA_ANT = "";
    private String VL_CRED_DCOMP_PA_ANT = "";
    private String SD_CRED_DISP_EFD = "";
    private String VL_CRED_DESC_EFD = "";
    private String VL_CRED_PER_EFD = "";
    private String VL_CRED_DCOMP_EFD = "";
    private String VL_CRED_TRANS = "";
    private String VL_CRED_OUT = "";
    private String SLD_CRED_FIM = "";
    
    public Registro1100() {
        REG = "1100";
        REG_PAI = "1001";
        nivel = 2;
        ocorrencia = Ocorrencia.VARIOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCNPJ_SUC() {
        return CNPJ_SUC;
    }

    public void setCNPJ_SUC(String CNPJ_SUC) {
        this.CNPJ_SUC = CNPJ_SUC;
    }

    public String getCOD_CRED() {
        return COD_CRED;
    }

    public void setCOD_CRED(String COD_CRED) {
        this.COD_CRED = COD_CRED;
    }

    public String getORIG_CRED() {
        return ORIG_CRED;
    }

    public void setORIG_CRED(String ORIG_CRED) {
        this.ORIG_CRED = ORIG_CRED;
    }

    public String getPER_APU_CRED() {
        return PER_APU_CRED;
    }

    public void setPER_APU_CRED(String PER_APU_CRED) {
        this.PER_APU_CRED = PER_APU_CRED;
    }

    public String getSD_CRED_DISP_EFD() {
        return SD_CRED_DISP_EFD;
    }

    public void setSD_CRED_DISP_EFD(String SD_CRED_DISP_EFD) {
        this.SD_CRED_DISP_EFD = SD_CRED_DISP_EFD;
    }

    public String getSLD_CRED_FIM() {
        return SLD_CRED_FIM;
    }

    public void setSLD_CRED_FIM(String SLD_CRED_FIM) {
        this.SLD_CRED_FIM = SLD_CRED_FIM;
    }

    public String getVL_CRED_APU() {
        return VL_CRED_APU;
    }

    public void setVL_CRED_APU(String VL_CRED_APU) {
        this.VL_CRED_APU = VL_CRED_APU;
    }

    public String getVL_CRED_DCOMP_EFD() {
        return VL_CRED_DCOMP_EFD;
    }

    public void setVL_CRED_DCOMP_EFD(String VL_CRED_DCOMP_EFD) {
        this.VL_CRED_DCOMP_EFD = VL_CRED_DCOMP_EFD;
    }

    public String getVL_CRED_DCOMP_PA_ANT() {
        return VL_CRED_DCOMP_PA_ANT;
    }

    public void setVL_CRED_DCOMP_PA_ANT(String VL_CRED_DCOMP_PA_ANT) {
        this.VL_CRED_DCOMP_PA_ANT = VL_CRED_DCOMP_PA_ANT;
    }

    public String getVL_CRED_DESC_EFD() {
        return VL_CRED_DESC_EFD;
    }

    public void setVL_CRED_DESC_EFD(String VL_CRED_DESC_EFD) {
        this.VL_CRED_DESC_EFD = VL_CRED_DESC_EFD;
    }

    public String getVL_CRED_DESC_PA_ANT() {
        return VL_CRED_DESC_PA_ANT;
    }

    public void setVL_CRED_DESC_PA_ANT(String VL_CRED_DESC_PA_ANT) {
        this.VL_CRED_DESC_PA_ANT = VL_CRED_DESC_PA_ANT;
    }

    public String getVL_CRED_EXT_APU() {
        return VL_CRED_EXT_APU;
    }

    public void setVL_CRED_EXT_APU(String VL_CRED_EXT_APU) {
        this.VL_CRED_EXT_APU = VL_CRED_EXT_APU;
    }

    public String getVL_CRED_OUT() {
        return VL_CRED_OUT;
    }

    public void setVL_CRED_OUT(String VL_CRED_OUT) {
        this.VL_CRED_OUT = VL_CRED_OUT;
    }

    public String getVL_CRED_PER_EFD() {
        return VL_CRED_PER_EFD;
    }

    public void setVL_CRED_PER_EFD(String VL_CRED_PER_EFD) {
        this.VL_CRED_PER_EFD = VL_CRED_PER_EFD;
    }

    public String getVL_CRED_PER_PA_ANT() {
        return VL_CRED_PER_PA_ANT;
    }

    public void setVL_CRED_PER_PA_ANT(String VL_CRED_PER_PA_ANT) {
        this.VL_CRED_PER_PA_ANT = VL_CRED_PER_PA_ANT;
    }

    public String getVL_CRED_TRANS() {
        return VL_CRED_TRANS;
    }

    public void setVL_CRED_TRANS(String VL_CRED_TRANS) {
        this.VL_CRED_TRANS = VL_CRED_TRANS;
    }

    public String getVL_TOT_CRED_APU() {
        return VL_TOT_CRED_APU;
    }

    public void setVL_TOT_CRED_APU(String VL_TOT_CRED_APU) {
        this.VL_TOT_CRED_APU = VL_TOT_CRED_APU;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + PER_APU_CRED;
        linha += "|" + ORIG_CRED;
        linha += "|" + CNPJ_SUC;
        linha += "|" + COD_CRED;
        linha += "|" + VL_CRED_APU;
        linha += "|" + VL_CRED_EXT_APU;
        linha += "|" + VL_TOT_CRED_APU;
        linha += "|" + VL_CRED_DESC_PA_ANT;
        linha += "|" + VL_CRED_PER_PA_ANT;
        linha += "|" + VL_CRED_DCOMP_PA_ANT;
        linha += "|" + SD_CRED_DISP_EFD;
        linha += "|" + VL_CRED_DESC_EFD;
        linha += "|" + VL_CRED_PER_EFD;
        linha += "|" + VL_CRED_DCOMP_EFD;
        linha += "|" + VL_CRED_TRANS;
        linha += "|" + VL_CRED_OUT;
        linha += "|" + SLD_CRED_FIM;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
