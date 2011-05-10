package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F211. 
 * Processo referenciado.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 11:40)
 */
public class RegistroF211 extends Registro {
    
    private String NUM_PROC = "";
    private String IND_PROC = "";
    
    public RegistroF211() {
        REG = "F211";
        REG_PAI = "F200";
        nivel = 4;
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
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
