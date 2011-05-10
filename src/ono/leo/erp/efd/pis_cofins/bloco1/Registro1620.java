package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1620. 
 * Demonstracao do credito a descontar da contribuicao extemporanea - Cofins.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 11:29)
 */
public class Registro1620 extends Registro {

    private String PER_APU_CRED = "";
    private String ORIG_CRED = "";
    private String COD_CRED = "";
    private String VL_CRED = "";
    
    public Registro1620() {
        REG = "1620";
        REG_PAI = "1600";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_CRED() {
        return COD_CRED;
    }

    public void setCOD_CRED(String COD_CRED) {
        this.COD_CRED = COD_CRED;
    }

    public String getORIG_CRED() {
        return ORIG_CRED;
    }

    public void setORIG_CRED(String ORIG_CRED) {
        this.ORIG_CRED = ORIG_CRED;
    }

    public String getPER_APU_CRED() {
        return PER_APU_CRED;
    }

    public void setPER_APU_CRED(String PER_APU_CRED) {
        this.PER_APU_CRED = PER_APU_CRED;
    }

    public String getVL_CRED() {
        return VL_CRED;
    }

    public void setVL_CRED(String VL_CRED) {
        this.VL_CRED = VL_CRED;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + PER_APU_CRED;
        linha += "|" + ORIG_CRED;
        linha += "|" + COD_CRED;
        linha += "|" + VL_CRED;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
