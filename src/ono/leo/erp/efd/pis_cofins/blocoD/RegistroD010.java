package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;
import ono.leo.erp.efd.pis_cofins.RegistroX001;

/**
 * Registro D010. 
 * Identificacao do estabelecimento.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (15/03/2011 14:18)
 */
public class RegistroD010 extends RegistroX001 {
    
    private String CNPJ = "";
    
    public RegistroD010() {
        REG = "D010";
        obrigatoriedade = Obrigatoriedade.OC;
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