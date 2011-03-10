package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F001. 
 * Abertura do bloco F.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 11:59)
 */
public class RegistroF001 extends Registro {
    
    /**
     * <p>Indicador de movimento:</p> 
     * <p><strong>0</strong> - Bloco com dados informados.</p>
     * <p><strong>1</strong> - Bloco sem dados informados.</p>
     */ 
    private String IND_MOV = "1";

    public RegistroF001() {
        super();
        REG = "F001";
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
