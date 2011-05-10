package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C395.
 * Notas fiscais de venda a consumidor (codigos 02, 2D, 2E e 59) - 
 * aquisicoes/entradas com credito.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 12:02)
 */
public class RegistroC395 extends Registro {
    
    private String COD_MOD = "";
    private String COD_PART = "";
    private String SER = "";
    private String SUB_SER = "";
    private String NUM_DOC = "";
    private String DT_DOC = "";
    private String VL_DOC = "";
 
    public RegistroC395() {
        REG = "C395";
        REG_PAI = "C010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getCOD_PART() {
        return COD_PART;
    }

    public void setCOD_PART(String COD_PART) {
        this.COD_PART = COD_PART;
    }

    public String getDT_DOC() {
        return DT_DOC;
    }

    public void setDT_DOC(String DT_DOC) {
        this.DT_DOC = DT_DOC;
    }

    public String getNUM_DOC() {
        return NUM_DOC;
    }

    public void setNUM_DOC(String NUM_DOC) {
        this.NUM_DOC = NUM_DOC;
    }

    public String getSER() {
        return SER;
    }

    public void setSER(String SER) {
        this.SER = SER;
    }

    public String getSUB_SER() {
        return SUB_SER;
    }

    public void setSUB_SER(String SUB_SER) {
        this.SUB_SER = SUB_SER;
    }

    public String getVL_DOC() {
        return VL_DOC;
    }

    public void setVL_DOC(String VL_DOC) {
        this.VL_DOC = VL_DOC;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_MOD;
        linha += "|" + COD_PART;
        linha += "|" + SER;
        linha += "|" + SUB_SER;
        linha += "|" + NUM_DOC;
        linha += "|" + DT_DOC;
        linha += "|" + VL_DOC;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
