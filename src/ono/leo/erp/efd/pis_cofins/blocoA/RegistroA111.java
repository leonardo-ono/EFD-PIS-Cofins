package ono.leo.erp.efd.pis_cofins.blocoA;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro A111. 
 * Processo referenciado.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 20:34)
 */
public class RegistroA111 extends Registro {
    
    private String NUM_PROC = "";
    private String IND_PROC = "";
    
    public RegistroA111() {
        REG = "A111";
        REG_PAI = "A100";
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
