package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;
import ono.leo.erp.efd.pis_cofins.RegistroX990;

/**
 * Registro F990.
 * Encerramento do bloco F.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 11:59)
 */
public class RegistroF990 extends RegistroX990 {
    
    public RegistroF990() {
        REG = "F990";
        REG_PAI = "0000";
        nivel = 1;
        ocorrencia = Ocorrencia.UM;
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
