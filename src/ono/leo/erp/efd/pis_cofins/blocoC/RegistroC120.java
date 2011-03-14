package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C120. 
 * Complemento do documento - operacoes de importacao (codigo 01).
 * 
 * Layout para este registro encontra-se no 
 * ATO COTEPE/ICMS Nº 9, DE 18 DE ABRIL DE 2008
 * (http://www.fazenda.gov.br/confaz/confaz/atos/atos_cotepe/2008/ac009_08.htm).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 11:04)
 */
public class RegistroC120 extends Registro {
    
    private String COD_DOC_IMP = "";
    private String NUM_DOC_IMP = "";
    private String PIS_IMP = "";
    private String COFINS_IMP = "";
    private String NUM_ACDRAW = "";
 
    public RegistroC120() {
        super();
        REG = "C120";
        obrigatoriedade = Obrigatoriedade.O_SE;
    }

    public String getCOD_DOC_IMP() {
        return COD_DOC_IMP;
    }

    public void setCOD_DOC_IMP(String COD_DOC_IMP) {
        this.COD_DOC_IMP = COD_DOC_IMP;
    }

    public String getCOFINS_IMP() {
        return COFINS_IMP;
    }

    public void setCOFINS_IMP(String COFINS_IMP) {
        this.COFINS_IMP = COFINS_IMP;
    }

    public String getNUM_ACDRAW() {
        return NUM_ACDRAW;
    }

    public void setNUM_ACDRAW(String NUM_ACDRAW) {
        this.NUM_ACDRAW = NUM_ACDRAW;
    }

    public String getNUM_DOC_IMP() {
        return NUM_DOC_IMP;
    }

    public void setNUM_DOC_IMP(String NUM_DOC_IMP) {
        this.NUM_DOC_IMP = NUM_DOC_IMP;
    }

    public String getPIS_IMP() {
        return PIS_IMP;
    }

    public void setPIS_IMP(String PIS_IMP) {
        this.PIS_IMP = PIS_IMP;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_DOC_IMP;
        linha += "|" + NUM_DOC_IMP;
        linha += "|" + PIS_IMP;
        linha += "|" + COFINS_IMP;
        linha += "|" + NUM_ACDRAW;
        linha += "|";
        return linha;
    }

}
