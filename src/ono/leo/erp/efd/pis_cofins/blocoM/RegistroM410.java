package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M410. 
 * Detalhamento das receitas isentas, nao alcancadas pela incidencia da 
 * contribuicao, sujeitas a aliquota zero ou de vendas com suspensao - 
 * PIS/PASEP.
 * 
 * Obs.: no layout, o campo 5 esta vazio.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 10:36)
 */
public class RegistroM410 extends Registro {

    private String NAT_REC = "";
    private String VL_REC = "";
    private String COD_CTA = "";
    // Campo 5 nao existe ?
    private String DESC_COMPL = "";
    
    public RegistroM410() {
        REG = "M410";
        obrigatoriedade = Obrigatoriedade.O_SE; // se existir M400
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
        linha += "|" + VL_REC;
        linha += "|" + COD_CTA;
        // Campo 5 nao existe ?
        linha += "|" + DESC_COMPL;
        linha += "|";
        return linha;
    }

}
