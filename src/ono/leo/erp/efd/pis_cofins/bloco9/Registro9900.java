package ono.leo.erp.efd.pis_cofins.bloco9;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 9900. 
 * Registros do arquivo.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 12:13)
 */
public class Registro9900 extends Registro {
    
    private String REG_BLC = "XXXX";
    private String QTD_REG_BLC = "0";

    public Registro9900(String REG_BLC) {
        super();
        REG = "9900";
        obrigatoriedade = Obrigatoriedade.O;
        this.REG_BLC = REG_BLC;
    }
    
    public String getQTD_REG_BLC() {
        return QTD_REG_BLC;
    }

    public void setQTD_REG_BLC(String QTD_REG_BLC) {
        this.QTD_REG_BLC = QTD_REG_BLC;
    }
    
    public void incrementarQTD_REG_BLC() {
        int quantidade = Integer.parseInt(QTD_REG_BLC);
        quantidade++;
        QTD_REG_BLC = "" + quantidade;
    }

    public String getREG_BLC() {
        return REG_BLC;
    }

    public void setREG_BLC(String REG_BLC) {
        this.REG_BLC = REG_BLC;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + REG_BLC;
        linha += "|" + QTD_REG_BLC;
        linha += "|";
        return linha;
    }

}
