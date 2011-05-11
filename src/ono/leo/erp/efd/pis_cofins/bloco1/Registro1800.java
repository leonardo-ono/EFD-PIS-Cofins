package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1800. 
 * Incorporacao imobiliaria - RET.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 11:35)
 */
public class Registro1800 extends Registro {

    private String INC_IMOB = "";
    private String REC_RECEB_RET = "";
    private String REC_FIN_RET = "";
    private String BC_RET = "";
    private String ALIQ_RET = "";
    private String VL_REC_UNI = "";
    private String DT_REC_UNI = "";
    private String COD_REC = "";
    
    public Registro1800() {
        REG = "1800";
        REG_PAI = "1001";
        nivel = 2;
        ocorrencia = Ocorrencia.VARIOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_RET() {
        return ALIQ_RET;
    }

    public void setALIQ_RET(String ALIQ_RET) {
        this.ALIQ_RET = ALIQ_RET;
    }

    public String getBC_RET() {
        return BC_RET;
    }

    public void setBC_RET(String BC_RET) {
        this.BC_RET = BC_RET;
    }

    public String getCOD_REC() {
        return COD_REC;
    }

    public void setCOD_REC(String COD_REC) {
        this.COD_REC = COD_REC;
    }

    public String getDT_REC_UNI() {
        return DT_REC_UNI;
    }

    public void setDT_REC_UNI(String DT_REC_UNI) {
        this.DT_REC_UNI = DT_REC_UNI;
    }

    public String getINC_IMOB() {
        return INC_IMOB;
    }

    public void setINC_IMOB(String INC_IMOB) {
        this.INC_IMOB = INC_IMOB;
    }

    public String getREC_FIN_RET() {
        return REC_FIN_RET;
    }

    public void setREC_FIN_RET(String REC_FIN_RET) {
        this.REC_FIN_RET = REC_FIN_RET;
    }

    public String getREC_RECEB_RET() {
        return REC_RECEB_RET;
    }

    public void setREC_RECEB_RET(String REC_RECEB_RET) {
        this.REC_RECEB_RET = REC_RECEB_RET;
    }

    public String getVL_REC_UNI() {
        return VL_REC_UNI;
    }

    public void setVL_REC_UNI(String VL_REC_UNI) {
        this.VL_REC_UNI = VL_REC_UNI;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + INC_IMOB;
        linha += "|" + REC_RECEB_RET;
        linha += "|" + REC_FIN_RET;
        linha += "|" + BC_RET;
        linha += "|" + ALIQ_RET;
        linha += "|" + VL_REC_UNI;
        linha += "|" + DT_REC_UNI;
        linha += "|" + COD_REC;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
