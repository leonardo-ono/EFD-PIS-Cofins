package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0500. 
 * Plano de contas contabeis.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 15:12)
 */
public class Registro0500 extends Registro {

    private String DT_ALT = "";
    private String COD_NAT_CC = "";
    private String IND_CTA = "";
    private String NIVEL = "";
    private String COD_CTA = "";
    private String NOME_CTA = "";
    private String COD_CTA_REF = "";
    private String CNPJ_EST = "";

    public Registro0500() {
        REG = "0500";
        REG_PAI = "0001";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCNPJ_EST() {
        return CNPJ_EST;
    }

    public void setCNPJ_EST(String CNPJ_EST) {
        this.CNPJ_EST = CNPJ_EST;
    }

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
    }

    public String getCOD_CTA_REF() {
        return COD_CTA_REF;
    }

    public void setCOD_CTA_REF(String COD_CTA_REF) {
        this.COD_CTA_REF = COD_CTA_REF;
    }

    public String getCOD_NAT_CC() {
        return COD_NAT_CC;
    }

    public void setCOD_NAT_CC(String COD_NAT_CC) {
        this.COD_NAT_CC = COD_NAT_CC;
    }

    public String getDT_ALT() {
        return DT_ALT;
    }

    public void setDT_ALT(String DT_ALT) {
        this.DT_ALT = DT_ALT;
    }

    public String getIND_CTA() {
        return IND_CTA;
    }

    public void setIND_CTA(String IND_CTA) {
        this.IND_CTA = IND_CTA;
    }

    public String getNIVEL() {
        return NIVEL;
    }

    public void setNIVEL(String NIVEL) {
        this.NIVEL = NIVEL;
    }

    public String getNOME_CTA() {
        return NOME_CTA;
    }

    public void setNOME_CTA(String NOME_CTA) {
        this.NOME_CTA = NOME_CTA;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + DT_ALT;
        linha += "|" + COD_NAT_CC;
        linha += "|" + IND_CTA;
        linha += "|" + NIVEL;
        linha += "|" + COD_CTA;
        linha += "|" + NOME_CTA;
        linha += "|" + COD_CTA_REF;
        linha += "|" + CNPJ_EST;
        linha += "|";
        return linha;
    }
    
}
