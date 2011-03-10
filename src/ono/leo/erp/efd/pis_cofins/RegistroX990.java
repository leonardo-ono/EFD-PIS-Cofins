package ono.leo.erp.efd.pis_cofins;

/**
 * Classe abstrata para Registros X990 do layout EFD-PIS/COFINS.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 14:27)
 */
public abstract class RegistroX990 extends Registro {

    protected String QTD_LIN = "0";

    public String getQTD_LIN() {
        return QTD_LIN;
    }

    public void setQTD_LIN(String QTD_LIN) {
        this.QTD_LIN = QTD_LIN;
    }
    
}
