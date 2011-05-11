package ono.leo.erp.efd.pis_cofins.bloco9;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 9999.
 * Encerramento do arquivo digital.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 12:23)
 */
public class Registro9999 extends Registro {
    
    /**
     * <p>Quantidade total de linhas do arquivo digital.</p>
     */ 
    private String QTD_LIN = "49";

    public Registro9999() {
        REG = "9999";
        REG_PAI = "ROOT";
        nivel = 0;
        ocorrencia = Ocorrencia.UM;
        obrigatoriedade = Obrigatoriedade.O;
    }
    
    public String getQTD_LIN() {
        return QTD_LIN;
    }

    public void setQTD_LIN(String QTD_LIN) {
        this.QTD_LIN = QTD_LIN;
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
