package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F700. 
 * Deducoes diversas.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 11:43)
 */
public class RegistroF700 extends Registro {
    
    private String IND_ORI_DED = "";
    private String IND_NAT_DED = "";
    private String VL_DED_PIS = "";
    private String VL_DED_COFINS = "";
    
    public RegistroF700() {
        REG = "F700";
        REG_PAI = "F010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getIND_NAT_DED() {
        return IND_NAT_DED;
    }

    public void setIND_NAT_DED(String IND_NAT_DED) {
        this.IND_NAT_DED = IND_NAT_DED;
    }

    public String getIND_ORI_DED() {
        return IND_ORI_DED;
    }

    public void setIND_ORI_DED(String IND_ORI_DED) {
        this.IND_ORI_DED = IND_ORI_DED;
    }

    public String getVL_DED_COFINS() {
        return VL_DED_COFINS;
    }

    public void setVL_DED_COFINS(String VL_DED_COFINS) {
        this.VL_DED_COFINS = VL_DED_COFINS;
    }

    public String getVL_DED_PIS() {
        return VL_DED_PIS;
    }

    public void setVL_DED_PIS(String VL_DED_PIS) {
        this.VL_DED_PIS = VL_DED_PIS;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_ORI_DED;
        linha += "|" + IND_NAT_DED;
        linha += "|" + VL_DED_PIS;
        linha += "|" + VL_DED_COFINS;
        linha += "|";
        return linha;
    }

}
