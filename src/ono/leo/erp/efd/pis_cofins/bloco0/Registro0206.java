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
        REG_PAI = "0200";
        nivel = 4;
        ocorrencia = Ocorrencia.UM_PARA_UM;
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
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }
    
}
