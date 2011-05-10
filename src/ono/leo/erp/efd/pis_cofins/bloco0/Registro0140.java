package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0140. Tabela de cadastro de estabelecimento.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/02/2011 15:37)
 */
public class Registro0140 extends Registro {
    
    private String COD_EST = "1";
    private String NOME = "EMPRESA";
    private String CNPJ = "22222222000191";
    private String UF = "SP";
    private String IE = "";
    private String COD_MUN = "3513801";
    private String IM = "";
    private String SUFRAMA = "";
    
    public Registro0140() {
        REG = "0140";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.O;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCOD_EST() {
        return COD_EST;
    }

    public void setCOD_EST(String COD_EST) {
        this.COD_EST = COD_EST;
    }

    public String getCOD_MUN() {
        return COD_MUN;
    }

    public void setCOD_MUN(String COD_MUN) {
        this.COD_MUN = COD_MUN;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getIM() {
        return IM;
    }

    public void setIM(String IM) {
        this.IM = IM;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getSUFRAMA() {
        return SUFRAMA;
    }

    public void setSUFRAMA(String SUFRAMA) {
        this.SUFRAMA = SUFRAMA;
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
        linha += "|" + COD_EST;
        linha += "|" + NOME;
        linha += "|" + CNPJ;
        linha += "|" + UF;
        linha += "|" + IE;
        linha += "|" + COD_MUN;
        linha += "|" + IM;
        linha += "|" + SUFRAMA;
        linha += "|";
        return linha;
    }

}
