package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C380.
 * Nota fiscal de venda a consumidor (codigo 02) - consolidacao de 
 * documentos emitidos.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 11:49)
 */
public class RegistroC380 extends Registro {
    
    private String COD_MOD = "";
    private String DT_DOC_INI = "";
    private String DT_DOC_FIN = "";
    private String NUM_DOC_INI = "";
    private String NUM_DOC_FIN = "";
    private String VL_DOC = "";
    private String VL_DOC_CANC = "";
 
    public RegistroC380() {
        REG = "C380";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getDT_DOC_FIN() {
        return DT_DOC_FIN;
    }

    public void setDT_DOC_FIN(String DT_DOC_FIN) {
        this.DT_DOC_FIN = DT_DOC_FIN;
    }

    public String getDT_DOC_INI() {
        return DT_DOC_INI;
    }

    public void setDT_DOC_INI(String DT_DOC_INI) {
        this.DT_DOC_INI = DT_DOC_INI;
    }

    public String getNUM_DOC_FIN() {
        return NUM_DOC_FIN;
    }

    public void setNUM_DOC_FIN(String NUM_DOC_FIN) {
        this.NUM_DOC_FIN = NUM_DOC_FIN;
    }

    public String getNUM_DOC_INI() {
        return NUM_DOC_INI;
    }

    public void setNUM_DOC_INI(String NUM_DOC_INI) {
        this.NUM_DOC_INI = NUM_DOC_INI;
    }

    public String getVL_DOC() {
        return VL_DOC;
    }

    public void setVL_DOC(String VL_DOC) {
        this.VL_DOC = VL_DOC;
    }

    public String getVL_DOC_CANC() {
        return VL_DOC_CANC;
    }

    public void setVL_DOC_CANC(String VL_DOC_CANC) {
        this.VL_DOC_CANC = VL_DOC_CANC;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_MOD;
        linha += "|" + DT_DOC_INI;
        linha += "|" + DT_DOC_FIN;
        linha += "|" + NUM_DOC_INI;
        linha += "|" + NUM_DOC_FIN;
        linha += "|" + VL_DOC;
        linha += "|" + VL_DOC_CANC;
        linha += "|";
        return linha;
    }

}
