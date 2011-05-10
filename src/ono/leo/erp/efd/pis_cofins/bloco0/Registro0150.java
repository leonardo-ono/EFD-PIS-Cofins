package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0150. Tabela de cadastro do participante.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (09/03/2011 10:06)
 */
public class Registro0150 extends Registro {
    
    private String COD_PART = "122";
    private String NOME = "FORNECEDOR TESTE";
    private String COD_PAIS = "01058";
    private String CNPJ = "22222222000191";
    private String CPF = "";
    private String IE = "";
    private String COD_MUN = "3513801";
    private String SUFRAMA = "";
    private String END = "SP";
    private String NUM = "99";
    private String COMPL = "";
    private String BAIRRO = "BAIRRO";
    
    public Registro0150() {
        REG = "0150";
        REG_PAI = "0140";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
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

    public String getCOD_PAIS() {
        return COD_PAIS;
    }

    public void setCOD_PAIS(String COD_PAIS) {
        this.COD_PAIS = COD_PAIS;
    }

    public String getCOD_PART() {
        return COD_PART;
    }

    public void setCOD_PART(String COD_PART) {
        this.COD_PART = COD_PART;
    }

    public String getCOMPL() {
        return COMPL;
    }

    public void setCOMPL(String COMPL) {
        this.COMPL = COMPL;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEND() {
        return END;
    }

    public void setEND(String END) {
        this.END = END;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    public String getSUFRAMA() {
        return SUFRAMA;
    }

    public void setSUFRAMA(String SUFRAMA) {
        this.SUFRAMA = SUFRAMA;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_PART;
        linha += "|" + NOME;
        linha += "|" + COD_PAIS;
        linha += "|" + CNPJ;
        linha += "|" + CPF;
        linha += "|" + IE;
        linha += "|" + COD_MUN;
        linha += "|" + SUFRAMA;
        linha += "|" + END;
        linha += "|" + NUM;
        linha += "|" + COMPL;
        linha += "|" + BAIRRO;
        linha += "|";
        return linha;
    }

}
