package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F010. 
 * Identificacao do estabelecimento.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 10:45)
 */
public class RegistroF010 extends Registro {
    
    private String CNPJ = "";
    
    public RegistroF010() {
        REG = "F010";
        REG_PAI = "F001";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + CNPJ;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
