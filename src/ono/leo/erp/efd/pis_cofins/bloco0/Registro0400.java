package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0400. Tabela de natureza da operacao/prestacao
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (09/03/2011 11:14)
 */
public class Registro0400 extends Registro {

    private String COD_NAT = "1403";
    private String DESCR_NAT = "VENDA";

    public Registro0400() {
        REG = "0400";
        REG_PAI = "0140";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_NAT() {
        return COD_NAT;
    }

    public void setCOD_NAT(String COD_NAT) {
        this.COD_NAT = COD_NAT;
    }

    public String getDESCR_NAT() {
        return DESCR_NAT;
    }

    public void setDESCR_NAT(String DESCR_NAT) {
        this.DESCR_NAT = DESCR_NAT;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_NAT;
        linha += "|" + DESCR_NAT;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }
    
}
