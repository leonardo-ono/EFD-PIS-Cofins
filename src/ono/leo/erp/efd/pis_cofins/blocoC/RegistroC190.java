package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C190. 
 * Consolidacao de notas fiscais eletronicas (codigo 55) - operacoes de 
 * aquisicao com direito a credito, e operacoes de devolucao de compras
 * e vendas.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 11:31)
 */
public class RegistroC190 extends Registro {
    
    private String COD_MOD = "";
    private String DT_REF_INI = "";
    private String DT_REF_FIN = "";
    private String COD_ITEM = "";
    private String COD_NCM = "";
    private String EX_IPI = "";
    private String VL_TOT_ITEM = "";
 
    public RegistroC190() {
        REG = "C190";
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

    public String getDT_REF_FIN() {
        return DT_REF_FIN;
    }

    public void setDT_REF_FIN(String DT_REF_FIN) {
        this.DT_REF_FIN = DT_REF_FIN;
    }

    public String getDT_REF_INI() {
        return DT_REF_INI;
    }

    public void setDT_REF_INI(String DT_REF_INI) {
        this.DT_REF_INI = DT_REF_INI;
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
        linha += "|" + DT_REF_INI;
        linha += "|" + DT_REF_FIN;
        linha += "|" + COD_ITEM;
        linha += "|" + COD_NCM;
        linha += "|" + EX_IPI;
        linha += "|" + VL_TOT_ITEM;
        linha += "|";
        return linha;
    }

}
