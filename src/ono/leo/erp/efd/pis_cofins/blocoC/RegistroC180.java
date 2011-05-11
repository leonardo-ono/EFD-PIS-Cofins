package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C180. 
 * Consolidacao de notas fiscais eletronicas emitidas pela pessoa juridica 
 * (codigo 55) - operacoes de vendas.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 11:08)
 */
public class RegistroC180 extends Registro {
    
    private String COD_MOD = "";
    private String DT_DOC_INI = "";
    private String DT_DOC_FIN = "";
    private String COD_ITEM = "";
    private String COD_NCM = "";
    private String EX_IPI = "";
    private String VL_TOT_ITEM = "";
 
    public RegistroC180() {
        super();
        REG = "C180";
        REG_PAI = "C010";
        nivel = 3;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_ITEM() {
        return COD_ITEM;
    }

    public void setCOD_ITEM(String COD_ITEM) {
        this.COD_ITEM = COD_ITEM;
    }

    public String getCOD_MOD() {
        return COD_MOD;
    }

    public void setCOD_MOD(String COD_MOD) {
        this.COD_MOD = COD_MOD;
    }

    public String getCOD_NCM() {
        return COD_NCM;
    }

    public void setCOD_NCM(String COD_NCM) {
        this.COD_NCM = COD_NCM;
    }

    public String getDT_DOC_FIN() {
        return DT_DOC_FIN;
    }

    public void setDT_DOC_FIN(String DT_DOC_FIN) {
        this.DT_DOC_FIN = DT_DOC_FIN;
    }

    public String getDT_DOC_INI() {
        return DT_DOC_INI;
    }

    public void setDT_DOC_INI(String DT_DOC_INI) {
        this.DT_DOC_INI = DT_DOC_INI;
    }

    public String getEX_IPI() {
        return EX_IPI;
    }

    public void setEX_IPI(String EX_IPI) {
        this.EX_IPI = EX_IPI;
    }

    public String getVL_TOT_ITEM() {
        return VL_TOT_ITEM;
    }

    public void setVL_TOT_ITEM(String VL_TOT_ITEM) {
        this.VL_TOT_ITEM = VL_TOT_ITEM;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_MOD;
        linha += "|" + DT_DOC_INI;
        linha += "|" + DT_DOC_FIN;
        linha += "|" + COD_ITEM;
        linha += "|" + COD_NCM;
        linha += "|" + EX_IPI;
        linha += "|" + VL_TOT_ITEM;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
