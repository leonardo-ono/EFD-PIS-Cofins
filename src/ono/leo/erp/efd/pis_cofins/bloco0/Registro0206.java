package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0206. 
 * Codigo de produto conforme tabela ANP (combustiveis).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 14:47)
 */
public class Registro0206 extends Registro {

    private String COD_COMB = "";

    public Registro0206() {
        REG = "0206";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_COMB() {
        return COD_COMB;
    }

    public void setCOD_COMB(String COD_COMB) {
        this.COD_COMB = COD_COMB;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_COMB;
        linha += "|";
        return linha;
    }
    
}
