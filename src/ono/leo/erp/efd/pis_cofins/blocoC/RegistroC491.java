package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C491.
 * Detalhamento da consolidacao de documentos emitidos por ECF 
 * (codigos 02, 2D e 59) - PIS/PASEP.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 12:26)
 */
public class RegistroC491 extends Registro {
    
    private String COD_ITEM = "";
    private String CST_PIS = "";
    private String CFOP = "";
    private String VL_ITEM = "";
    private String VL_BC_PIS = "";
    private String ALIQ_PIS = "";
    private String QUANT_BC_PIS = "";
    private String ALIQ_PIS_QUANT = "";
    private String VL_PIS = "";
    private String COD_CTA = "";
 
    public RegistroC491() {
        REG = "C491";
        REG_PAI = "C490";
        nivel = 4;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_PIS() {
        return ALIQ_PIS;
    }

    public void setALIQ_PIS(String ALIQ_PIS) {
        this.ALIQ_PIS = ALIQ_PIS;
    }

    public String getALIQ_PIS_QUANT() {
        return ALIQ_PIS_QUANT;
    }

    public void setALIQ_PIS_QUANT(String ALIQ_PIS_QUANT) {
        this.ALIQ_PIS_QUANT = ALIQ_PIS_QUANT;
    }

    public String getCFOP() {
        return CFOP;
    }

    public void setCFOP(String CFOP) {
        this.CFOP = CFOP;
    }

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
    }

    public String getCOD_ITEM() {
        return COD_ITEM;
    }

    public void setCOD_ITEM(String COD_ITEM) {
        this.COD_ITEM = COD_ITEM;
    }

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
    }

    public String getQUANT_BC_PIS() {
        return QUANT_BC_PIS;
    }

    public void setQUANT_BC_PIS(String QUANT_BC_PIS) {
        this.QUANT_BC_PIS = QUANT_BC_PIS;
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
        linha += "|" + COD_ITEM;
        linha += "|" + CST_PIS;
        linha += "|" + CFOP;
        linha += "|" + VL_ITEM;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + QUANT_BC_PIS;
        linha += "|" + ALIQ_PIS_QUANT;
        linha += "|" + VL_PIS;
        linha += "|" + COD_CTA;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
