package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0208. 
 * Codigo de grupos por marca comercial - refri (bebidas frias).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 15:08)
 */
public class Registro0208 extends Registro {

    private String COD_TAB = "";
    private String COD_GRU = "";
    private String MARCA_COM = "";

    public Registro0208() {
        REG = "0208";
        REG_PAI = "0200";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_GRU() {
        return COD_GRU;
    }

    public void setCOD_GRU(String COD_GRU) {
        this.COD_GRU = COD_GRU;
    }

    public String getCOD_TAB() {
        return COD_TAB;
    }

    public void setCOD_TAB(String COD_TAB) {
        this.COD_TAB = COD_TAB;
    }

    public String getMARCA_COM() {
        return MARCA_COM;
    }

    public void setMARCA_COM(String MARCA_COM) {
        this.MARCA_COM = MARCA_COM;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_TAB;
        linha += "|" + COD_GRU;
        linha += "|" + MARCA_COM;
        linha += "|";
        return linha;
    }
    
}
