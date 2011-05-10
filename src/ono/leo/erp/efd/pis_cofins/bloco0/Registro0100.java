package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0100. 
 * Dados do contabilista.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 11:46)
 */
public class Registro0100 extends Registro {
    
    private String NOME = "NOME DO CONTADOR";
    private String CPF = "84898524729"; // Gerado pelo http://www.geradorcpf.com/
    private String CRC = "1SP123456/0-7";
    private String CNPJ = "";
    private String CEP = "00000000";
    private String END = "RUA XXX";
    private String NUM = "99";
    private String COMPL = "SALA 99";
    private String BAIRRO = "BAIRRO";
    private String FONE = "9912345678";
    private String FAX = "9912346789";
    private String EMAIL = "contador@empresa.com.br";
    private String COD_MUN = "3550308";
    
    public Registro0100() {
        REG = "0100";
        REG_PAI = "0001";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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

    public String getCRC() {
        return CRC;
    }

    public void setCRC(String CRC) {
        this.CRC = CRC;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getEND() {
        return END;
    }

    public void setEND(String END) {
        this.END = END;
    }

    public String getFAX() {
        return FAX;
    }

    public void setFAX(String FAX) {
        this.FAX = FAX;
    }

    public String getFONE() {
        return FONE;
    }

    public void setFONE(String FONE) {
        this.FONE = FONE;
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

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NOME;
        linha += "|" + CPF;
        linha += "|" + CRC;
        linha += "|" + CNPJ;
        linha += "|" + CEP;
        linha += "|" + END;
        linha += "|" + NUM;
        linha += "|" + COMPL;
        linha += "|" + BAIRRO;
        linha += "|" + FONE;
        linha += "|" + FAX;
        linha += "|" + EMAIL;
        linha += "|" + COD_MUN;
        linha += "|";
        return linha;
    }

}
