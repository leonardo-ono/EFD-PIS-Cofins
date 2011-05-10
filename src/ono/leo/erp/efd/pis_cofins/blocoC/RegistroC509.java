package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C509.
 * Processo referenciado.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 13:02)
 */
public class RegistroC509 extends Registro {
    
    private String NUM_PROC = "";
    private String IND_PROC = "";
 
    public RegistroC509() {
        REG = "C509";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCST_COFINS() {
        return NUM_PROC;
    }

    public void setCST_COFINS(String CST_COFINS) {
        this.NUM_PROC = CST_COFINS;
    }

    public String getVL_ITEM() {
        return IND_PROC;
    }

    public void setVL_ITEM(String VL_ITEM) {
        this.IND_PROC = VL_ITEM;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NUM_PROC;
        linha += "|" + IND_PROC;
        linha += "|";
        return linha;
    }

}
