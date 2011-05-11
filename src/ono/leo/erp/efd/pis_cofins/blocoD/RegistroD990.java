package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;
import ono.leo.erp.efd.pis_cofins.RegistroX990;

/**
 * Registro D990.
 * Encerramento do bloco D.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 11:58)
 */
public class RegistroD990 extends RegistroX990 {
    
    public RegistroD990() {
        REG = "D990";
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
