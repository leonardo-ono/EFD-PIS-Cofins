package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D209. 
 * Processo referenciado.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 10:52)
 */
public class RegistroD209 extends Registro {
    
    private String NUM_PROC = "";
    private String IND_PROC = "";
    
    public RegistroD209() {
        REG = "D209";
        REG_PAI = "D200";
        nivel = 4;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
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
