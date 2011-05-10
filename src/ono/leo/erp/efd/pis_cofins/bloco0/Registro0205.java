package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0205. 
 * Alteracao do item.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 14:42)
 */
public class Registro0205 extends Registro {

    private String DESCR_ANT_ITEM = "";
    private String DT_INI = "";
    private String DT_FIM = "";
    private String COD_ANT_ITEM = "";

    public Registro0205() {
        REG = "0205";
        REG_PAI = "0200";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_ANT_ITEM() {
        return COD_ANT_ITEM;
    }

    public void setCOD_ANT_ITEM(String COD_ANT_ITEM) {
        this.COD_ANT_ITEM = COD_ANT_ITEM;
    }

    public String getDESCR_ANT_ITEM() {
        return DESCR_ANT_ITEM;
    }

    public void setDESCR_ANT_ITEM(String DESCR_ANT_ITEM) {
        this.DESCR_ANT_ITEM = DESCR_ANT_ITEM;
    }

    public String getDT_FIM() {
        return DT_FIM;
    }

    public void setDT_FIM(String DT_FIM) {
        this.DT_FIM = DT_FIM;
    }

    public String getDT_INI() {
        return DT_INI;
    }

    public void setDT_INI(String DT_INI) {
        this.DT_INI = DT_INI;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + DESCR_ANT_ITEM;
        linha += "|" + DT_INI;
        linha += "|" + DT_FIM;
        linha += "|" + COD_ANT_ITEM;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }
    
}
