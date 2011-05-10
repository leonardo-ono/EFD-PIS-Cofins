package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0450. 
 * Tabela de informacao complementar do documento fiscal.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (10/05/2011 09:06)
 */public class Registro0450 extends Registro {

    private String COD_INF = "";
    private String TXT = "";

    public Registro0450() {
        REG = "0450";
        REG_PAI = "0140";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_INF() {
        return COD_INF;
    }

    public void setCOD_INF(String COD_INF) {
        this.COD_INF = COD_INF;
    }

    public String getTXT() {
        return TXT;
    }

    public void setTXT(String TXT) {
        this.TXT = TXT;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_INF;
        linha += "|" + TXT;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }
    
}
