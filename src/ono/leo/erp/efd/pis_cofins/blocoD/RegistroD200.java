package ono.leo.erp.efd.pis_cofins.blocoD;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro D200. 
 * Resumo da escritura diaria - prestacao de servicos de transporte - Nota
 * fiscal de servico de transporte (codigo 07) e conhecimentos de transporte 
 * rodoviario de cargas (codigo 08), Conhecimento de transporte de cargas 
 * avulso (codigo 8B), aquaviario de cargas (codigo 09), aereo (codigo 10), 
 * ferroviario de carga (codigo 27) e conhecimento de tranporte 
 * eletronico - CT-e (codigo 57).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (21/03/2011 10:42)
 */
public class RegistroD200 extends Registro {
    
    private String COD_MOD = "";
    private String COD_SIT = "";
    private String SER = "";
    private String NUM_DOC_INI = "";
    private String NUM_DOC_FIN = "";
    private String CFOP = "";
    private String DT_REF = "";
    private String VL_DOC = "";
    private String VL_DESC = "";
    
    public RegistroD200() {
        REG = "D200";
        REG_PAI = "D010";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCFOP() {
        return CFOP;
    }

    public void setCFOP(String CFOP) {
        this.CFOP = CFOP;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getCOD_SIT() {
        return COD_SIT;
    }

    public void setCOD_SIT(String COD_SIT) {
        this.COD_SIT = COD_SIT;
    }

    public String getDT_REF() {
        return DT_REF;
    }

    public void setDT_REF(String DT_REF) {
        this.DT_REF = DT_REF;
    }

    public String getNUM_DOC_FIN() {
        return NUM_DOC_FIN;
    }

    public void setNUM_DOC_FIN(String NUM_DOC_FIN) {
        this.NUM_DOC_FIN = NUM_DOC_FIN;
    }

    public String getNUM_DOC_INI() {
        return NUM_DOC_INI;
    }

    public void setNUM_DOC_INI(String NUM_DOC_INI) {
        this.NUM_DOC_INI = NUM_DOC_INI;
    }

    public String getSER() {
        return SER;
    }

    public void setSER(String SER) {
        this.SER = SER;
    }

    public String getVL_DESC() {
        return VL_DESC;
    }

    public void setVL_DESC(String VL_DESC) {
        this.VL_DESC = VL_DESC;
    }

    public String getVL_DOC() {
        return VL_DOC;
    }

    public void setVL_DOC(String VL_DOC) {
        this.VL_DOC = VL_DOC;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_MOD;
        linha += "|" + COD_SIT;
        linha += "|" + SER;
        linha += "|" + NUM_DOC_INI;
        linha += "|" + NUM_DOC_FIN;
        linha += "|" + CFOP;
        linha += "|" + DT_REF;
        linha += "|" + VL_DOC;
        linha += "|" + VL_DESC;
        linha += "|";
        return linha;
    }

}
