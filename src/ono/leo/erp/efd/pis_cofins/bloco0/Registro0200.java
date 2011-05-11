package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0200. Tabela de identificacao do item (Produtos e Servicos).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (09/03/2011 10:57)
 */
public class Registro0200 extends Registro {

    private String COD_ITEM = "1";
    private String DESCR_ITEM = "PRODUTO TESTE";
    private String COD_BARRA = "";
    private String COD_ANT_ITEM = "";
    private String UNID_INV = "UN";
    private String TIPO_ITEM = "00";
    private String COD_NCM = "61000000"; // Pelo visto, e obrigatorio conforme o TIPO_ITEM
    private String EX_IPI = "";
    private String COD_GEN = "61";
    private String COD_LST = "";
    private String ALIQ_ICMS = "18,00";

    public Registro0200() {
        REG = "0200";
        REG_PAI = "0140";
        nivel = 3;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_ICMS() {
        return ALIQ_ICMS;
    }

    public void setALIQ_ICMS(String ALIQ_ICMS) {
        this.ALIQ_ICMS = ALIQ_ICMS;
    }

    public String getCOD_ANT_ITEM() {
        return COD_ANT_ITEM;
    }

    public void setCOD_ANT_ITEM(String COD_ANT_ITEM) {
        this.COD_ANT_ITEM = COD_ANT_ITEM;
    }

    public String getCOD_BARRA() {
        return COD_BARRA;
    }

    public void setCOD_BARRA(String COD_BARRA) {
        this.COD_BARRA = COD_BARRA;
    }

    public String getCOD_GEN() {
        return COD_GEN;
    }

    public void setCOD_GEN(String COD_GEN) {
        this.COD_GEN = COD_GEN;
    }

    public String getCOD_ITEM() {
        return COD_ITEM;
    }

    public void setCOD_ITEM(String COD_ITEM) {
        this.COD_ITEM = COD_ITEM;
    }

    public String getCOD_LST() {
        return COD_LST;
    }

    public void setCOD_LST(String COD_LST) {
        this.COD_LST = COD_LST;
    }

    public String getCOD_NCM() {
        return COD_NCM;
    }

    public void setCOD_NCM(String COD_NCM) {
        this.COD_NCM = COD_NCM;
    }

    public String getDESCR_ITEM() {
        return DESCR_ITEM;
    }

    public void setDESCR_ITEM(String DESCR_ITEM) {
        this.DESCR_ITEM = DESCR_ITEM;
    }

    public String getEX_IPI() {
        return EX_IPI;
    }

    public void setEX_IPI(String EX_IPI) {
        this.EX_IPI = EX_IPI;
    }

    public String getTIPO_ITEM() {
        return TIPO_ITEM;
    }

    public void setTIPO_ITEM(String TIPO_ITEM) {
        this.TIPO_ITEM = TIPO_ITEM;
    }

    public String getUNID_INV() {
        return UNID_INV;
    }

    public void setUNID_INV(String UNID_INV) {
        this.UNID_INV = UNID_INV;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_ITEM;
        linha += "|" + DESCR_ITEM;
        linha += "|" + COD_BARRA;
        linha += "|" + COD_ANT_ITEM;
        linha += "|" + UNID_INV;
        linha += "|" + TIPO_ITEM;
        linha += "|" + COD_NCM;
        linha += "|" + EX_IPI;
        linha += "|" + COD_GEN;
        linha += "|" + COD_LST;
        linha += "|" + ALIQ_ICMS;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }
    
}
