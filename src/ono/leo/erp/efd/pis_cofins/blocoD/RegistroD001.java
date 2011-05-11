package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;
import ono.leo.erp.efd.pis_cofins.RegistroX001;

/**
 * Registro D001. 
 * Abertura do bloco D.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 11:58)
 */
public class RegistroD001 extends RegistroX001 {
    
    public RegistroD001() {
        REG = "D001";
        REG_PAI = "0000";
        nivel = 1;
        ocorrencia = Ocorrencia.UM;
        obrigatoriedade = Obrigatoriedade.O;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_MOV;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
