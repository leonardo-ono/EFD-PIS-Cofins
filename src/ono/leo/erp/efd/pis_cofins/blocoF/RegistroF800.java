package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F800. 
 * Identificacao do estabelecimento.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 10:40)
 */
public class RegistroF800 extends Registro {
    
    private String IND_NAT_EVEN = "";
    private String DT_EVEN = "";
    private String CNPJ_SUCED = "";
    private String PA_CONT_CRED = "";
    private String COD_CRED = "";
    private String VL_CRED = "";
    private String PER_CRED_CIS = "";
    
    public RegistroF800() {
        REG = "F800";
        REG_PAI = "F010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCNPJ_SUCED() {
        return CNPJ_SUCED;
    }

    public void setCNPJ_SUCED(String CNPJ_SUCED) {
        this.CNPJ_SUCED = CNPJ_SUCED;
    }

    public String getCOD_CRED() {
        return COD_CRED;
    }

    public void setCOD_CRED(String COD_CRED) {
        this.COD_CRED = COD_CRED;
    }

    public String getDT_EVEN() {
        return DT_EVEN;
    }

    public void setDT_EVEN(String DT_EVEN) {
        this.DT_EVEN = DT_EVEN;
    }

    public String getIND_NAT_EVEN() {
        return IND_NAT_EVEN;
    }

    public void setIND_NAT_EVEN(String IND_NAT_EVEN) {
        this.IND_NAT_EVEN = IND_NAT_EVEN;
    }

    public String getPA_CONT_CRED() {
        return PA_CONT_CRED;
    }

    public void setPA_CONT_CRED(String PA_CONT_CRED) {
        this.PA_CONT_CRED = PA_CONT_CRED;
    }

    public String getPER_CRED_CIS() {
        return PER_CRED_CIS;
    }

    public void setPER_CRED_CIS(String PER_CRED_CIS) {
        this.PER_CRED_CIS = PER_CRED_CIS;
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
        linha += "|" + IND_NAT_EVEN;
        linha += "|" + DT_EVEN;
        linha += "|" + CNPJ_SUCED;
        linha += "|" + PA_CONT_CRED;
        linha += "|" + COD_CRED;
        linha += "|" + VL_CRED;
        linha += "|" + PER_CRED_CIS;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
