package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M630. 
 * Informacoes adicionais de diferimento.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 11:47)
 */
public class RegistroM630 extends Registro {

    private String CNPJ = "";
    private String VL_VEND = "";
    private String VL_NAO_RECEB = "";
    private String VL_CONT_DIF = "";
    private String VL_CRED_DIF = "";
    private String COD_CRED = "";
    
    public RegistroM630() {
        REG = "M630";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCOD_CRED() {
        return COD_CRED;
    }

    public void setCOD_CRED(String COD_CRED) {
        this.COD_CRED = COD_CRED;
    }

    public String getVL_CONT_DIF() {
        return VL_CONT_DIF;
    }

    public void setVL_CONT_DIF(String VL_CONT_DIF) {
        this.VL_CONT_DIF = VL_CONT_DIF;
    }

    public String getVL_CRED_DIF() {
        return VL_CRED_DIF;
    }

    public void setVL_CRED_DIF(String VL_CRED_DIF) {
        this.VL_CRED_DIF = VL_CRED_DIF;
    }

    public String getVL_NAO_RECEB() {
        return VL_NAO_RECEB;
    }

    public void setVL_NAO_RECEB(String VL_NAO_RECEB) {
        this.VL_NAO_RECEB = VL_NAO_RECEB;
    }

    public String getVL_VEND() {
        return VL_VEND;
    }

    public void setVL_VEND(String VL_VEND) {
        this.VL_VEND = VL_VEND;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + CNPJ;
        linha += "|" + VL_VEND;
        linha += "|" + VL_NAO_RECEB;
        linha += "|" + VL_CONT_DIF;
        linha += "|" + VL_CRED_DIF;
        linha += "|" + COD_CRED;
        linha += "|";
        return linha;
    }

}
