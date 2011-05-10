package ono.leo.erp.efd.pis_cofins.blocoA;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro A110. 
 * Complemento do documento - informacao complementar da NF.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 20:31)
 */
public class RegistroA110 extends Registro {
    
    private String COD_INF = "";
    private String TXT_COMPL = "";
    
    public RegistroA110() {
        REG = "A110";
        REG_PAI = "A100";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_INF() {
        return COD_INF;
    }

    public void setCOD_INF(String COD_INF) {
        this.COD_INF = COD_INF;
    }

    public String getTXT_COMPL() {
        return TXT_COMPL;
    }

    public void setTXT_COMPL(String TXT_COMPL) {
        this.TXT_COMPL = TXT_COMPL;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_INF;
        linha += "|" + TXT_COMPL;
        linha += "|";
        return linha;
    }

}
