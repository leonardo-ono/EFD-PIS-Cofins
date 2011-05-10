package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0000. 
 * Abertura do arquivo digital e identificacao da pessoa juridica.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/02/2011 14:56)
 */
public class Registro0000 extends Registro {
    
    private String COD_VER = "002";
    private String TIPO_ESCRIT = "0";
    private String IND_SIT_ESP = "";
    private String NUM_REC_ANTERIOR = "";
    private String DT_INI = "01012011";
    private String DT_FIN = "31012011";
    private String NOME = "EMPRESA";
    private String CNPJ = "22222222000191";
    private String UF = "SP";
    private String COD_MUN = "3513801";
    private String SUFRAMA = "";
    private String IND_NAT_PJ = "00";
    private String IND_ATIV = "0";

    public Registro0000() {
        REG = "0000";
        nivel = 0;
        obrigatoriedade = Obrigatoriedade.O;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCOD_MUN() {
        return COD_MUN;
    }

    public void setCOD_MUN(String COD_MUN) {
        this.COD_MUN = COD_MUN;
    }

    public String getCOD_VER() {
        return COD_VER;
    }

    public void setCOD_VER(String COD_VER) {
        this.COD_VER = COD_VER;
    }

    public String getDT_FIN() {
        return DT_FIN;
    }

    public void setDT_FIN(String DT_FIN) {
        this.DT_FIN = DT_FIN;
    }

    public String getDT_INI() {
        return DT_INI;
    }

    public void setDT_INI(String DT_INI) {
        this.DT_INI = DT_INI;
    }

    public String getIND_ATIV() {
        return IND_ATIV;
    }

    public void setIND_ATIV(String IND_ATIV) {
        this.IND_ATIV = IND_ATIV;
    }

    public String getIND_NAT_PJ() {
        return IND_NAT_PJ;
    }

    public void setIND_NAT_PJ(String IND_NAT_PJ) {
        this.IND_NAT_PJ = IND_NAT_PJ;
    }

    public String getIND_SIT_ESP() {
        return IND_SIT_ESP;
    }

    public void setIND_SIT_ESP(String IND_SIT_ESP) {
        this.IND_SIT_ESP = IND_SIT_ESP;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getNUM_REC_ANTERIOR() {
        return NUM_REC_ANTERIOR;
    }

    public void setNUM_REC_ANTERIOR(String NUM_REC_ANTERIOR) {
        this.NUM_REC_ANTERIOR = NUM_REC_ANTERIOR;
    }

    public String getSUFRAMA() {
        return SUFRAMA;
    }

    public void setSUFRAMA(String SUFRAMA) {
        this.SUFRAMA = SUFRAMA;
    }

    public String getTIPO_ESCRIT() {
        return TIPO_ESCRIT;
    }

    public void setTIPO_ESCRIT(String TIPO_ESCRIT) {
        this.TIPO_ESCRIT = TIPO_ESCRIT;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_VER;
        linha += "|" + TIPO_ESCRIT;
        linha += "|" + IND_SIT_ESP;
        linha += "|" + NUM_REC_ANTERIOR;
        linha += "|" + DT_INI;
        linha += "|" + DT_FIN;
        linha += "|" + NOME;
        linha += "|" + CNPJ;
        linha += "|" + UF;
        linha += "|" + COD_MUN;
        linha += "|" + SUFRAMA;
        linha += "|" + IND_NAT_PJ;
        linha += "|" + IND_ATIV ;
        linha += "|";
        return linha;
    }

}
