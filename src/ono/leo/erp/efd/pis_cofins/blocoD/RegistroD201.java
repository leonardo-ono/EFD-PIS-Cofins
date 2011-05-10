package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D201. 
 * Totalizacao do resumo diario - PIS/PASEP.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 10:47)
 */
public class RegistroD201 extends Registro {
    
    private String CST_PIS = "";
    private String VL_ITEM = "";
    private String VL_BC_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_PIS = "";
    private String COD_CTA = "";
    
    public RegistroD201() {
        REG = "D201";
        REG_PAI = "D200";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
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

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
    }

    public String getVL_BC_PIS() {
        return VL_BC_PIS;
    }

    public void setVL_BC_PIS(String VL_BC_PIS) {
        this.VL_BC_PIS = VL_BC_PIS;
    }

    public String getVL_ITEM() {
        return VL_ITEM;
    }

    public void setVL_ITEM(String VL_ITEM) {
        this.VL_ITEM = VL_ITEM;
    }

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + CST_PIS;
        linha += "|" + VL_ITEM;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_PIS;
        linha += "|" + COD_CTA;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
