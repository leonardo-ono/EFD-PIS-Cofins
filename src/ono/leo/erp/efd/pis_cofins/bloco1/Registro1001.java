package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1001. 
 * Abertura do bloco 1.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 12:01)
 */
public class Registro1001 extends Registro {
    
    /**
     * <p>Indicador de movimento:</p> 
     * <p><strong>0</strong> - Bloco com dados informados.</p>
     * <p><strong>1</strong> - Bloco sem dados informados.</p>
     */ 
    private String IND_MOV = "1";

    public Registro1001() {
        REG = "1001";
        obrigatoriedade = Obrigatoriedade.O;
    }
    
    public String getIND_MOV() {
        return IND_MOV;
    }

    public void setIND_MOV(String IND_MOV) {
        this.IND_MOV = IND_MOV;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_MOV;
        linha += "|";
        return linha;
    }

}
