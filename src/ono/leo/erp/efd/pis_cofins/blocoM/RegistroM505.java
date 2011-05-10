package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M505. 
 * Detalhamento da base de calculo do credito apurado no periodo - Cofins.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (11/03/2011 10:54)
 */
public class RegistroM505 extends Registro {

    private String NAT_BC_CRED = "01";
    private String CST_COFINS = "50";
    private String VL_BC_COFINS_TOT = "158";
    private String VL_BC_COFINS_CUM = "";
    private String VL_BC_COFINS_NC = "158";
    private String VL_BC_COFINS = "158";
    private String QUANT_BC_COFINS_TOT = "";
    private String QUANT_BC_COFINS = "0";
    private String DESC_CRED = "";

    public RegistroM505() {
        super();
        REG = "M505";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCST_COFINS() {
        return CST_COFINS;
    }

    public void setCST_COFINS(String CST_COFINS) {
        this.CST_COFINS = CST_COFINS;
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

    public String getQUANT_BC_COFINS() {
        return QUANT_BC_COFINS;
    }

    public void setQUANT_BC_COFINS(String QUANT_BC_COFINS) {
        this.QUANT_BC_COFINS = QUANT_BC_COFINS;
    }

    public String getQUANT_BC_COFINS_TOT() {
        return QUANT_BC_COFINS_TOT;
    }

    public void setQUANT_BC_COFINS_TOT(String QUANT_BC_COFINS_TOT) {
        this.QUANT_BC_COFINS_TOT = QUANT_BC_COFINS_TOT;
    }

    public String getVL_BC_COFINS() {
        return VL_BC_COFINS;
    }

    public void setVL_BC_COFINS(String VL_BC_COFINS) {
        this.VL_BC_COFINS = VL_BC_COFINS;
    }

    public String getVL_BC_COFINS_CUM() {
        return VL_BC_COFINS_CUM;
    }

    public void setVL_BC_COFINS_CUM(String VL_BC_COFINS_CUM) {
        this.VL_BC_COFINS_CUM = VL_BC_COFINS_CUM;
    }

    public String getVL_BC_COFINS_NC() {
        return VL_BC_COFINS_NC;
    }

    public void setVL_BC_COFINS_NC(String VL_BC_COFINS_NC) {
        this.VL_BC_COFINS_NC = VL_BC_COFINS_NC;
    }

    public String getVL_BC_COFINS_TOT() {
        return VL_BC_COFINS_TOT;
    }

    public void setVL_BC_COFINS_TOT(String VL_BC_COFINS_TOT) {
        this.VL_BC_COFINS_TOT = VL_BC_COFINS_TOT;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NAT_BC_CRED;
        linha += "|" + CST_COFINS;
        linha += "|" + VL_BC_COFINS_TOT;
        linha += "|" + VL_BC_COFINS_CUM;
        linha += "|" + VL_BC_COFINS_NC;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + QUANT_BC_COFINS_TOT;
        linha += "|" + QUANT_BC_COFINS;
        linha += "|" + DESC_CRED;
        linha += "|";
        return linha;
    }
    
}
