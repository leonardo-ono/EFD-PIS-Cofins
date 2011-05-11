package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F120. 
 * Bens incorporados ao ativo imobilizado - operacoes geradoras de creditos
 * com base nos encargos de depreciacao e amortizacao.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 10:54)
 */
public class RegistroF120 extends Registro {
    
    private String NAT_BC_CRED = "";
    private String IDENT_BEM_IMOB = "";
    private String IND_ORIG_CRED = "";
    private String IND_UTIL_BEM_IMOB = "";
    private String VL_OPER_DEP = "";
    private String PARC_OPER_NAO_BC_C_RED = "";
    private String CST_PIS = "";
    private String VL_BC_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_PIS = "";
    private String CST_COFINS = "";
    private String VL_BC_COFINS = "";
    private String ALIQ_COFINS = "";
    private String VL_COFINS = "";
    private String COD_CTA = "";
    private String COD_CCUS = "";
    private String DESC_BEM_IMOB = "";
    
    public RegistroF120() {
        REG = "F120";
        REG_PAI = "F010";
        nivel = 3;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_COFINS() {
        return ALIQ_COFINS;
    }

    public void setALIQ_COFINS(String ALIQ_COFINS) {
        this.ALIQ_COFINS = ALIQ_COFINS;
    }

    public String getALIQ_PIS() {
        return ALIQ_PIS;
    }

    public void setALIQ_PIS(String ALIQ_PIS) {
        this.ALIQ_PIS = ALIQ_PIS;
    }

    public String getCOD_CCUS() {
        return COD_CCUS;
    }

    public void setCOD_CCUS(String COD_CCUS) {
        this.COD_CCUS = COD_CCUS;
    }

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
    }

    public String getCST_COFINS() {
        return CST_COFINS;
    }

    public void setCST_COFINS(String CST_COFINS) {
        this.CST_COFINS = CST_COFINS;
    }

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
    }

    public String getDESC_BEM_IMOB() {
        return DESC_BEM_IMOB;
    }

    public void setDESC_BEM_IMOB(String DESC_BEM_IMOB) {
        this.DESC_BEM_IMOB = DESC_BEM_IMOB;
    }

    public String getIDENT_BEM_IMOB() {
        return IDENT_BEM_IMOB;
    }

    public void setIDENT_BEM_IMOB(String IDENT_BEM_IMOB) {
        this.IDENT_BEM_IMOB = IDENT_BEM_IMOB;
    }

    public String getIND_ORIG_CRED() {
        return IND_ORIG_CRED;
    }

    public void setIND_ORIG_CRED(String IND_ORIG_CRED) {
        this.IND_ORIG_CRED = IND_ORIG_CRED;
    }

    public String getIND_UTIL_BEM_IMOB() {
        return IND_UTIL_BEM_IMOB;
    }

    public void setIND_UTIL_BEM_IMOB(String IND_UTIL_BEM_IMOB) {
        this.IND_UTIL_BEM_IMOB = IND_UTIL_BEM_IMOB;
    }

    public String getNAT_BC_CRED() {
        return NAT_BC_CRED;
    }

    public void setNAT_BC_CRED(String NAT_BC_CRED) {
        this.NAT_BC_CRED = NAT_BC_CRED;
    }

    public String getPARC_OPER_NAO_BC_C_RED() {
        return PARC_OPER_NAO_BC_C_RED;
    }

    public void setPARC_OPER_NAO_BC_C_RED(String PARC_OPER_NAO_BC_C_RED) {
        this.PARC_OPER_NAO_BC_C_RED = PARC_OPER_NAO_BC_C_RED;
    }

    public String getVL_BC_COFINS() {
        return VL_BC_COFINS;
    }

    public void setVL_BC_COFINS(String VL_BC_COFINS) {
        this.VL_BC_COFINS = VL_BC_COFINS;
    }

    public String getVL_BC_PIS() {
        return VL_BC_PIS;
    }

    public void setVL_BC_PIS(String VL_BC_PIS) {
        this.VL_BC_PIS = VL_BC_PIS;
    }

    public String getVL_COFINS() {
        return VL_COFINS;
    }

    public void setVL_COFINS(String VL_COFINS) {
        this.VL_COFINS = VL_COFINS;
    }

    public String getVL_OPER_DEP() {
        return VL_OPER_DEP;
    }

    public void setVL_OPER_DEP(String VL_OPER_DEP) {
        this.VL_OPER_DEP = VL_OPER_DEP;
    }

    public String getVL_PIS() {
        return VL_PIS;
    }

    public void setVL_PIS(String VL_PIS) {
        this.VL_PIS = VL_PIS;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NAT_BC_CRED;
        linha += "|" + IDENT_BEM_IMOB;
        linha += "|" + IND_ORIG_CRED;
        linha += "|" + IND_UTIL_BEM_IMOB;
        linha += "|" + VL_OPER_DEP;
        linha += "|" + PARC_OPER_NAO_BC_C_RED;
        linha += "|" + CST_PIS;
        linha += "|" + VL_BC_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_PIS;
        linha += "|" + CST_COFINS;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + VL_COFINS;
        linha += "|" + COD_CTA;
        linha += "|" + COD_CCUS;
        linha += "|" + DESC_BEM_IMOB;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
