package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M700. 
 * Cofins diferida em periodos anteriores - Valores a pagar no periodo.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 11:50)
 */
public class RegistroM700 extends Registro {

    private String COD_CONT = "";
    private String VL_CONT_REC = "";
    private String NAT_CRED_DESC = "";
    private String VL_CRED_DESC = "";
    private String PER_APUR = "";
    private String DT_RECEB = "";
    
    public RegistroM700() {
        REG = "M700";
        REG_PAI = "M001";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_CONT() {
        return COD_CONT;
    }

    public void setCOD_CONT(String COD_CONT) {
        this.COD_CONT = COD_CONT;
    }

    public String getDT_RECEB() {
        return DT_RECEB;
    }

    public void setDT_RECEB(String DT_RECEB) {
        this.DT_RECEB = DT_RECEB;
    }

    public String getNAT_CRED_DESC() {
        return NAT_CRED_DESC;
    }

    public void setNAT_CRED_DESC(String NAT_CRED_DESC) {
        this.NAT_CRED_DESC = NAT_CRED_DESC;
    }

    public String getPER_APUR() {
        return PER_APUR;
    }

    public void setPER_APUR(String PER_APUR) {
        this.PER_APUR = PER_APUR;
    }

    public String getVL_CONT_REC() {
        return VL_CONT_REC;
    }

    public void setVL_CONT_REC(String VL_CONT_REC) {
        this.VL_CONT_REC = VL_CONT_REC;
    }

    public String getVL_CRED_DESC() {
        return VL_CRED_DESC;
    }

    public void setVL_CRED_DESC(String VL_CRED_DESC) {
        this.VL_CRED_DESC = VL_CRED_DESC;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_CONT;
        linha += "|" + VL_CONT_REC;
        linha += "|" + NAT_CRED_DESC;
        linha += "|" + VL_CRED_DESC;
        linha += "|" + PER_APUR;
        linha += "|" + DT_RECEB;
        linha += "|";
        return linha;
    }

}
