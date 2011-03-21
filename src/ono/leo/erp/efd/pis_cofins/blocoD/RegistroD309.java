package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D309. 
 * Processo referenciado.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 11:04)
 */
public class RegistroD309 extends Registro {
    
    private String NUM_PROC = "";
    private String IND_PROC = "";
    
    public RegistroD309() {
        REG = "D309";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getIND_PROC() {
        return IND_PROC;
    }

    public void setIND_PROC(String IND_PROC) {
        this.IND_PROC = IND_PROC;
    }

    public String getNUM_PROC() {
        return NUM_PROC;
    }

    public void setNUM_PROC(String NUM_PROC) {
        this.NUM_PROC = NUM_PROC;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NUM_PROC;
        linha += "|" + IND_PROC;
        linha += "|";
        return linha;
    }

}
