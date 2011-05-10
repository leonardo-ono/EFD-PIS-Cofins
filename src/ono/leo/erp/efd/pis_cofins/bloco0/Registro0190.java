package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0190. Identificacao das unidades de medida.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (09/03/2011 10:52)
 */
public class Registro0190 extends Registro {
    
    private String UNID = "UN";
    private String DESC = "UNIDADE";
    
    public Registro0190() {
        REG = "0190";
        REG_PAI = "0140";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getUNID() {
        return UNID;
    }

    public void setUNID(String UNID) {
        this.UNID = UNID;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + UNID;
        linha += "|" + DESC;
        linha += "|";
        return linha;
    }

}
