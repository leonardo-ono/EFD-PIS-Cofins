package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M600. 
 * Consolidacao da contribuicao para a seguridade social.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 13:27)
 */
public class RegistroM600 extends Registro {

    private String VL_TOT_CONT_NC_PER = "0";
    private String VL_TOT_CRED_DESC = "0";
    private String VL_TOT_CRED_DESC_ANT = "0";
    private String VL_TOT_CONT_NC_DEV = "0";
    private String VL_RET_NC = "0";
    private String VL_OUT_DED_NC = "0";
    private String VL_CONT_NC_REC = "0";
    private String VL_TOT_CONT_CUM_PER = "0";
    private String VL_RET_CUM = "0";
    private String VL_OUT_DED_CUM = "0";
    private String VL_CONT_CUM_REC = "0";
    private String VL_TOT_CONT_REC = "0";

    public RegistroM600() {
        super();
        REG = "M600";
        REG_PAI = "M001";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.O;
    }

    public String getVL_CONT_CUM_REC() {
        return VL_CONT_CUM_REC;
    }

    public void setVL_CONT_CUM_REC(String VL_CONT_CUM_REC) {
        this.VL_CONT_CUM_REC = VL_CONT_CUM_REC;
    }

    public String getVL_CONT_NC_REC() {
        return VL_CONT_NC_REC;
    }

    public void setVL_CONT_NC_REC(String VL_CONT_NC_REC) {
        this.VL_CONT_NC_REC = VL_CONT_NC_REC;
    }

    public String getVL_OUT_DED_CUM() {
        return VL_OUT_DED_CUM;
    }

    public void setVL_OUT_DED_CUM(String VL_OUT_DED_CUM) {
        this.VL_OUT_DED_CUM = VL_OUT_DED_CUM;
    }

    public String getVL_OUT_DED_NC() {
        return VL_OUT_DED_NC;
    }

    public void setVL_OUT_DED_NC(String VL_OUT_DED_NC) {
        this.VL_OUT_DED_NC = VL_OUT_DED_NC;
    }

    public String getVL_RET_CUM() {
        return VL_RET_CUM;
    }

    public void setVL_RET_CUM(String VL_RET_CUM) {
        this.VL_RET_CUM = VL_RET_CUM;
    }

    public String getVL_RET_NC() {
        return VL_RET_NC;
    }

    public void setVL_RET_NC(String VL_RET_NC) {
        this.VL_RET_NC = VL_RET_NC;
    }

    public String getVL_TOT_CONT_CUM_PER() {
        return VL_TOT_CONT_CUM_PER;
    }

    public void setVL_TOT_CONT_CUM_PER(String VL_TOT_CONT_CUM_PER) {
        this.VL_TOT_CONT_CUM_PER = VL_TOT_CONT_CUM_PER;
    }

    public String getVL_TOT_CONT_NC_DEV() {
        return VL_TOT_CONT_NC_DEV;
    }

    public void setVL_TOT_CONT_NC_DEV(String VL_TOT_CONT_NC_DEV) {
        this.VL_TOT_CONT_NC_DEV = VL_TOT_CONT_NC_DEV;
    }

    public String getVL_TOT_CONT_NC_PER() {
        return VL_TOT_CONT_NC_PER;
    }

    public void setVL_TOT_CONT_NC_PER(String VL_TOT_CONT_NC_PER) {
        this.VL_TOT_CONT_NC_PER = VL_TOT_CONT_NC_PER;
    }

    public String getVL_TOT_CONT_REC() {
        return VL_TOT_CONT_REC;
    }

    public void setVL_TOT_CONT_REC(String VL_TOT_CONT_REC) {
        this.VL_TOT_CONT_REC = VL_TOT_CONT_REC;
    }

    public String getVL_TOT_CRED_DESC() {
        return VL_TOT_CRED_DESC;
    }

    public void setVL_TOT_CRED_DESC(String VL_TOT_CRED_DESC) {
        this.VL_TOT_CRED_DESC = VL_TOT_CRED_DESC;
    }

    public String getVL_TOT_CRED_DESC_ANT() {
        return VL_TOT_CRED_DESC_ANT;
    }

    public void setVL_TOT_CRED_DESC_ANT(String VL_TOT_CRED_DESC_ANT) {
        this.VL_TOT_CRED_DESC_ANT = VL_TOT_CRED_DESC_ANT;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + VL_TOT_CONT_NC_PER;
        linha += "|" + VL_TOT_CRED_DESC;
        linha += "|" + VL_TOT_CRED_DESC_ANT;
        linha += "|" + VL_TOT_CONT_NC_DEV;
        linha += "|" + VL_RET_NC;
        linha += "|" + VL_OUT_DED_NC;
        linha += "|" + VL_CONT_NC_REC;
        linha += "|" + VL_TOT_CONT_CUM_PER;
        linha += "|" + VL_RET_CUM;
        linha += "|" + VL_OUT_DED_CUM;
        linha += "|" + VL_CONT_CUM_REC;
        linha += "|" + VL_TOT_CONT_REC;
        linha += "|";
        return linha;
    }
    
}
