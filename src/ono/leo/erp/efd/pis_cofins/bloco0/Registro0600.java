package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0600. 
 * Centro de custos
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 15:30)
 */
public class Registro0600 extends Registro {

    private String DT_ALT = "";
    private String COD_CCUS = "";
    private String CCUS = "";

    public Registro0600() {
        REG = "0600";
        REG_PAI = "0001";
        nivel = 2;
        ocorrencia = Ocorrencia.VARIOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCCUS() {
        return CCUS;
    }

    public void setCCUS(String CCUS) {
        this.CCUS = CCUS;
    }

    public String getCOD_CCUS() {
        return COD_CCUS;
    }

    public void setCOD_CCUS(String COD_CCUS) {
        this.COD_CCUS = COD_CCUS;
    }

    public String getDT_ALT() {
        return DT_ALT;
    }

    public void setDT_ALT(String DT_ALT) {
        this.DT_ALT = DT_ALT;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + DT_ALT;
        linha += "|" + COD_CCUS;
        linha += "|" + CCUS;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }
    
}
