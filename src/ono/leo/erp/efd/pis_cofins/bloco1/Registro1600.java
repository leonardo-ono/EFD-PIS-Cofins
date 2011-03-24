package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1600. 
 * Contribuicao social extemporanea - Cofins.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 11:17)
 */
public class Registro1600 extends Registro {

    private String PER_APUR_ANT = "";
    private String NAT_CONT_REC = "";
    private String VL_CONT_APUR = "";
    private String VL_CRED_COFINS_DESC = "";
    private String VL_CONT_DEV = "";
    private String VL_OUT_DED = "";
    private String VL_CONT_EXT = "";
    private String VL_MUL = "";
    private String VL_JUR = "";
    private String DT_RECOL = "";
    
    public Registro1600() {
        REG = "1600";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getDT_RECOL() {
        return DT_RECOL;
    }

    public void setDT_RECOL(String DT_RECOL) {
        this.DT_RECOL = DT_RECOL;
    }

    public String getNAT_CONT_REC() {
        return NAT_CONT_REC;
    }

    public void setNAT_CONT_REC(String NAT_CONT_REC) {
        this.NAT_CONT_REC = NAT_CONT_REC;
    }

    public String getPER_APUR_ANT() {
        return PER_APUR_ANT;
    }

    public void setPER_APUR_ANT(String PER_APUR_ANT) {
        this.PER_APUR_ANT = PER_APUR_ANT;
    }

    public String getVL_CONT_APUR() {
        return VL_CONT_APUR;
    }

    public void setVL_CONT_APUR(String VL_CONT_APUR) {
        this.VL_CONT_APUR = VL_CONT_APUR;
    }

    public String getVL_CONT_DEV() {
        return VL_CONT_DEV;
    }

    public void setVL_CONT_DEV(String VL_CONT_DEV) {
        this.VL_CONT_DEV = VL_CONT_DEV;
    }

    public String getVL_CONT_EXT() {
        return VL_CONT_EXT;
    }

    public void setVL_CONT_EXT(String VL_CONT_EXT) {
        this.VL_CONT_EXT = VL_CONT_EXT;
    }

    public String getVL_CRED_COFINS_DESC() {
        return VL_CRED_COFINS_DESC;
    }

    public void setVL_CRED_COFINS_DESC(String VL_CRED_COFINS_DESC) {
        this.VL_CRED_COFINS_DESC = VL_CRED_COFINS_DESC;
    }

    public String getVL_JUR() {
        return VL_JUR;
    }

    public void setVL_JUR(String VL_JUR) {
        this.VL_JUR = VL_JUR;
    }

    public String getVL_MUL() {
        return VL_MUL;
    }

    public void setVL_MUL(String VL_MUL) {
        this.VL_MUL = VL_MUL;
    }

    public String getVL_OUT_DED() {
        return VL_OUT_DED;
    }

    public void setVL_OUT_DED(String VL_OUT_DED) {
        this.VL_OUT_DED = VL_OUT_DED;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + PER_APUR_ANT;
        linha += "|" + NAT_CONT_REC;
        linha += "|" + VL_CONT_APUR;
        linha += "|" + VL_CRED_COFINS_DESC;
        linha += "|" + VL_CONT_DEV;
        linha += "|" + VL_OUT_DED;
        linha += "|" + VL_CONT_EXT;
        linha += "|" + VL_MUL;
        linha += "|" + VL_JUR;
        linha += "|" + DT_RECOL;
        linha += "|";
        return linha;
    }

}
