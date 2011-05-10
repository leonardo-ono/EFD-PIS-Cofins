package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1300. 
 * Controle dos valores retidos na fonte - PIS/PASEP.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 10:50)
 */
public class Registro1300 extends Registro {

    private String IND_NAT_RET = "";
    private String PR_REC_RET = "";
    private String VL_RET_APU = "";
    private String VL_RET_DED = "";
    private String VL_RET_PER = "";
    private String VL_RET_DCOMP = "";
    private String SLD_RET = "";
    
    public Registro1300() {
        REG = "1300";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getIND_NAT_RET() {
        return IND_NAT_RET;
    }

    public void setIND_NAT_RET(String IND_NAT_RET) {
        this.IND_NAT_RET = IND_NAT_RET;
    }

    public String getPR_REC_RET() {
        return PR_REC_RET;
    }

    public void setPR_REC_RET(String PR_REC_RET) {
        this.PR_REC_RET = PR_REC_RET;
    }

    public String getSLD_RET() {
        return SLD_RET;
    }

    public void setSLD_RET(String SLD_RET) {
        this.SLD_RET = SLD_RET;
    }

    public String getVL_RET_APU() {
        return VL_RET_APU;
    }

    public void setVL_RET_APU(String VL_RET_APU) {
        this.VL_RET_APU = VL_RET_APU;
    }

    public String getVL_RET_DCOMP() {
        return VL_RET_DCOMP;
    }

    public void setVL_RET_DCOMP(String VL_RET_DCOMP) {
        this.VL_RET_DCOMP = VL_RET_DCOMP;
    }

    public String getVL_RET_DED() {
        return VL_RET_DED;
    }

    public void setVL_RET_DED(String VL_RET_DED) {
        this.VL_RET_DED = VL_RET_DED;
    }

    public String getVL_RET_PER() {
        return VL_RET_PER;
    }

    public void setVL_RET_PER(String VL_RET_PER) {
        this.VL_RET_PER = VL_RET_PER;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_NAT_RET;
        linha += "|" + PR_REC_RET;
        linha += "|" + VL_RET_APU;
        linha += "|" + VL_RET_DED;
        linha += "|" + VL_RET_PER;
        linha += "|" + VL_RET_DCOMP;
        linha += "|" + SLD_RET;
        linha += "|";
        return linha;
    }

}
