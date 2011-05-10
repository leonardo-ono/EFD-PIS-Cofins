package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M105. 
 * Detalhamento da base de calculo do credito apurado no periodo PIS/PASEP.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (09/03/2011 16:00)
 */
public class RegistroM105 extends Registro {

    private String NAT_BC_CRED = "01";
    private String CST_PIS = "50";
    private String VL_BC_PIS_TOT = "158";
    private String VL_BC_PIS_CUM = "";
    private String VL_BC_PIS_NC = "158";
    private String VL_BC_PIS = "158";
    private String QUANT_BC_PIS_TOT = "";
    private String QUANT_BC_PIS = "0";
    private String DESC_CRED = "";

    public RegistroM105() {
        REG = "M105";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
    }

    public String getDESC_CRED() {
        return DESC_CRED;
    }

    public void setDESC_CRED(String DESC_CRED) {
        this.DESC_CRED = DESC_CRED;
    }

    public String getNAT_BC_CRED() {
        return NAT_BC_CRED;
    }

    public void setNAT_BC_CRED(String NAT_BC_CRED) {
        this.NAT_BC_CRED = NAT_BC_CRED;
    }

    public String getQUANT_BC_PIS() {
        return QUANT_BC_PIS;
    }

    public void setQUANT_BC_PIS(String QUANT_BC_PIS) {
        this.QUANT_BC_PIS = QUANT_BC_PIS;
    }

    public String getQUANT_BC_PIS_TOT() {
        return QUANT_BC_PIS_TOT;
    }

    public void setQUANT_BC_PIS_TOT(String QUANT_BC_PIS_TOT) {
        this.QUANT_BC_PIS_TOT = QUANT_BC_PIS_TOT;
    }

    public String getVL_BC_PIS() {
        return VL_BC_PIS;
    }

    public void setVL_BC_PIS(String VL_BC_PIS) {
        this.VL_BC_PIS = VL_BC_PIS;
    }

    public String getVL_BC_PIS_CUM() {
        return VL_BC_PIS_CUM;
    }

    public void setVL_BC_PIS_CUM(String VL_BC_PIS_CUM) {
        this.VL_BC_PIS_CUM = VL_BC_PIS_CUM;
    }

    public String getVL_BC_PIS_NC() {
        return VL_BC_PIS_NC;
    }

    public void setVL_BC_PIS_NC(String VL_BC_PIS_NC) {
        this.VL_BC_PIS_NC = VL_BC_PIS_NC;
    }

    public String getVL_BC_PIS_TOT() {
        return VL_BC_PIS_TOT;
    }

    public void setVL_BC_PIS_TOT(String VL_BC_PIS_TOT) {
        this.VL_BC_PIS_TOT = VL_BC_PIS_TOT;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NAT_BC_CRED;
        linha += "|" + CST_PIS;
        linha += "|" + VL_BC_PIS_TOT;
        linha += "|" + VL_BC_PIS_CUM;
        linha += "|" + VL_BC_PIS_NC;
        linha += "|" + VL_BC_PIS;
        linha += "|" + QUANT_BC_PIS_TOT;
        linha += "|" + QUANT_BC_PIS;
        linha += "|" + DESC_CRED;
        linha += "|";
        return linha;
    }
    
}
