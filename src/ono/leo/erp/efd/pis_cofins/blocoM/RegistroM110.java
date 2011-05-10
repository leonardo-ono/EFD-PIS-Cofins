package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M110. 
 * Ajuste do credito de PIS/PASEP apurado.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 10:00)
 */
public class RegistroM110 extends Registro {

    private String IND_AJ = "";
    private String VL_AJ = "";
    private String COD_AJ = "";
    private String NUM_DOC = "";
    private String DESCR_AJ = "";
    private String DT_REF = "";
    
    public RegistroM110() {
        REG = "M110";
        REG_PAI = "M100";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_AJ() {
        return COD_AJ;
    }

    public void setCOD_AJ(String COD_AJ) {
        this.COD_AJ = COD_AJ;
    }

    public String getDESCR_AJ() {
        return DESCR_AJ;
    }

    public void setDESCR_AJ(String DESCR_AJ) {
        this.DESCR_AJ = DESCR_AJ;
    }

    public String getDT_REF() {
        return DT_REF;
    }

    public void setDT_REF(String DT_REF) {
        this.DT_REF = DT_REF;
    }

    public String getIND_AJ() {
        return IND_AJ;
    }

    public void setIND_AJ(String IND_AJ) {
        this.IND_AJ = IND_AJ;
    }

    public String getNUM_DOC() {
        return NUM_DOC;
    }

    public void setNUM_DOC(String NUM_DOC) {
        this.NUM_DOC = NUM_DOC;
    }

    public String getVL_AJ() {
        return VL_AJ;
    }

    public void setVL_AJ(String VL_AJ) {
        this.VL_AJ = VL_AJ;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_AJ;
        linha += "|" + VL_AJ;
        linha += "|" + COD_AJ;
        linha += "|" + NUM_DOC;
        linha += "|" + DESCR_AJ;
        linha += "|" + DT_REF;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
