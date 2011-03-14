package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C405.
 * Reducao Z (codigos 02 e 2D).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 12:12)
 */
public class RegistroC405 extends Registro {
    
    private String DT_DOC = "";
    private String CRO = "";
    private String CRZ = "";
    private String NUM_COO_FIN = "";
    private String GT_FIN = "";
    private String VL_BRT = "";
 
    public RegistroC405() {
        REG = "C405";
        obrigatoriedade = Obrigatoriedade.O_SE;
    }

    public String getCRO() {
        return CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }

    public String getCRZ() {
        return CRZ;
    }

    public void setCRZ(String CRZ) {
        this.CRZ = CRZ;
    }

    public String getDT_DOC() {
        return DT_DOC;
    }

    public void setDT_DOC(String DT_DOC) {
        this.DT_DOC = DT_DOC;
    }

    public String getGT_FIN() {
        return GT_FIN;
    }

    public void setGT_FIN(String GT_FIN) {
        this.GT_FIN = GT_FIN;
    }

    public String getNUM_COO_FIN() {
        return NUM_COO_FIN;
    }

    public void setNUM_COO_FIN(String NUM_COO_FIN) {
        this.NUM_COO_FIN = NUM_COO_FIN;
    }

    public String getVL_BRT() {
        return VL_BRT;
    }

    public void setVL_BRT(String VL_BRT) {
        this.VL_BRT = VL_BRT;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + DT_DOC;
        linha += "|" + CRO;
        linha += "|" + CRZ;
        linha += "|" + NUM_COO_FIN;
        linha += "|" + GT_FIN;
        linha += "|" + VL_BRT;
        linha += "|";
        return linha;
    }

}
