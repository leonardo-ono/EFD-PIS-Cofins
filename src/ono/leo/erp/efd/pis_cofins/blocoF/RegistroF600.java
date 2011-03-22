package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F600. 
 * Contribuicao retida na fonte.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 11:41)
 */
public class RegistroF600 extends Registro {
    
    private String IND_NAT_RET = "";
    private String DT_REC_RET = "";
    private String VL_REC = "";
    private String VL_RET_FONT = "";
    private String COD_REC = "";
    private String IND_NAT_REC = "";
    private String CNPJ = "";
    private String VL_RET_PIS = "";
    private String VL_RET_COFINS = "";
    
    public RegistroF600() {
        REG = "F600";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCOD_REC() {
        return COD_REC;
    }

    public void setCOD_REC(String COD_REC) {
        this.COD_REC = COD_REC;
    }

    public String getDT_REC_RET() {
        return DT_REC_RET;
    }

    public void setDT_REC_RET(String DT_REC_RET) {
        this.DT_REC_RET = DT_REC_RET;
    }

    public String getIND_NAT_REC() {
        return IND_NAT_REC;
    }

    public void setIND_NAT_REC(String IND_NAT_REC) {
        this.IND_NAT_REC = IND_NAT_REC;
    }

    public String getIND_NAT_RET() {
        return IND_NAT_RET;
    }

    public void setIND_NAT_RET(String IND_NAT_RET) {
        this.IND_NAT_RET = IND_NAT_RET;
    }

    public String getVL_REC() {
        return VL_REC;
    }

    public void setVL_REC(String VL_REC) {
        this.VL_REC = VL_REC;
    }

    public String getVL_RET_COFINS() {
        return VL_RET_COFINS;
    }

    public void setVL_RET_COFINS(String VL_RET_COFINS) {
        this.VL_RET_COFINS = VL_RET_COFINS;
    }

    public String getVL_RET_FONT() {
        return VL_RET_FONT;
    }

    public void setVL_RET_FONT(String VL_RET_FONT) {
        this.VL_RET_FONT = VL_RET_FONT;
    }

    public String getVL_RET_PIS() {
        return VL_RET_PIS;
    }

    public void setVL_RET_PIS(String VL_RET_PIS) {
        this.VL_RET_PIS = VL_RET_PIS;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_NAT_RET;
        linha += "|" + DT_REC_RET;
        linha += "|" + VL_REC;
        linha += "|" + VL_RET_FONT;
        linha += "|" + COD_REC;
        linha += "|" + IND_NAT_REC;
        linha += "|" + CNPJ;
        linha += "|" + VL_RET_PIS;
        linha += "|" + VL_RET_COFINS;
        linha += "|";
        return linha;
    }

}
