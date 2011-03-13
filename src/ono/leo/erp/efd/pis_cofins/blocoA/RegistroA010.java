package ono.leo.erp.efd.pis_cofins.blocoA;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro A010. 
 * Identificacao do estabelecimento.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 20:16)
 */
public class RegistroA010 extends Registro {
    
    private String CNPJ = "";
    
    public RegistroA010() {
        REG = "A010";
        obrigatoriedade = Obrigatoriedade.O_SE;
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
        linha += "|";
        return linha;
    }

}
