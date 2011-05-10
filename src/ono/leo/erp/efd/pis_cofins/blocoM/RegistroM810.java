package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M810. 
 * Detalhamento das receitas isentas, nao alcancadas pela incidencia da
 * contribuicao, sujeitas a aliquota zero ou de vendas com suspensao - Cofins.
 * 
 * Obs.: no layout, esta faltando o campo 3 ?
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 12:08)
 */
public class RegistroM810 extends Registro {

    private String NAT_REC = "";
    // campo 3 ?
    private String VL_REC = "";
    private String COD_CTA = "";
    private String DESC_COMPL = "";
    
    public RegistroM810() {
        REG = "M810";
        REG_PAI = "M800";
        nivel = 3;
        obrigatoriedade = Obrigatoriedade.O_SE; // se existir M800
    }

    public String getCOD_CTA() {
        return COD_CTA;
    }

    public void setCOD_CTA(String COD_CTA) {
        this.COD_CTA = COD_CTA;
    }

    public String getDESC_COMPL() {
        return DESC_COMPL;
    }

    public void setDESC_COMPL(String DESC_COMPL) {
        this.DESC_COMPL = DESC_COMPL;
    }

    public String getNAT_REC() {
        return NAT_REC;
    }

    public void setNAT_REC(String NAT_REC) {
        this.NAT_REC = NAT_REC;
    }

    public String getVL_REC() {
        return VL_REC;
    }

    public void setVL_REC(String VL_REC) {
        this.VL_REC = VL_REC;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NAT_REC;
        // campo 3 ?
        linha += "|" + VL_REC;
        linha += "|" + COD_CTA;
        linha += "|" + DESC_COMPL;
        linha += "|";
        return linha;
    }

}
