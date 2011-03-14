package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C400.
 * Equipamento ECF (codigos 02 e 2D).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 12:09)
 */
public class RegistroC400 extends Registro {
    
    private String COD_MOD = "";
    private String ECF_MOD = "";
    private String ECF_FAB = "";
    private String ECF_CX = "";
 
    public RegistroC400() {
        REG = "C400";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getECF_CX() {
        return ECF_CX;
    }

    public void setECF_CX(String ECF_CX) {
        this.ECF_CX = ECF_CX;
    }

    public String getECF_FAB() {
        return ECF_FAB;
    }

    public void setECF_FAB(String ECF_FAB) {
        this.ECF_FAB = ECF_FAB;
    }

    public String getECF_MOD() {
        return ECF_MOD;
    }

    public void setECF_MOD(String ECF_MOD) {
        this.ECF_MOD = ECF_MOD;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_MOD;
        linha += "|" + ECF_MOD;
        linha += "|" + ECF_FAB;
        linha += "|" + ECF_CX;
        linha += "|";
        return linha;
    }

}
