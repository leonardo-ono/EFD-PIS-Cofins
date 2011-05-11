package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M800. 
 * Receitas isentas, nao alcancadas pela incidencia da contribuicao,
 * sujeitas a aliquota zero ou de vendas com suspensao - Cofins.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 11:52)
 */
public class RegistroM800 extends Registro {

    private String CST_COFINS = "";
    private String VL_TOT_REC = "";
    private String COD_CTA = "";
    private String DESC_COMPL = "";
    
    public RegistroM800() {
        REG = "M800";
        REG_PAI = "M001";
        nivel = 2;
        ocorrencia = Ocorrencia.VARIOS;
        obrigatoriedade = Obrigatoriedade.OC;
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

    public String getDESC_COMPL() {
        return DESC_COMPL;
    }

    public void setDESC_COMPL(String DESC_COMPL) {
        this.DESC_COMPL = DESC_COMPL;
    }

    public String getVL_TOT_REC() {
        return VL_TOT_REC;
    }

    public void setVL_TOT_REC(String VL_TOT_REC) {
        this.VL_TOT_REC = VL_TOT_REC;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + CST_COFINS;
        linha += "|" + VL_TOT_REC;
        linha += "|" + COD_CTA;
        linha += "|" + DESC_COMPL;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
