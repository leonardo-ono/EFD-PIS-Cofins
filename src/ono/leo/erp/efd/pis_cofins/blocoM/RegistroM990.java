package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;
import ono.leo.erp.efd.pis_cofins.RegistroX990;

/**
 * Registro M990.
 * Encerramento do bloco M.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 12:00)
 */
public class RegistroM990 extends RegistroX990 {
    
    public RegistroM990() {
        REG = "M990";
        REG_PAI = "0000";
        nivel = 1;
        obrigatoriedade = Obrigatoriedade.O;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + QTD_LIN;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
