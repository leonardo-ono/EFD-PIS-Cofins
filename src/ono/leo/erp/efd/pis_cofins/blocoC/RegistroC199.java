package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C199. 
 * Complemento do documento - operacoes de importacao (codigos 55).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 11:44)
 */
public class RegistroC199 extends Registro {
    
    private String COD_DOC_IMP = "";
    private String NUM_DOC_IMP = "";
    private String VL_PIS_IMP = "";
    private String VL_COFINS_IMP = "";
    private String NUM_ACDRAW = "";
 
    public RegistroC199() {
        REG = "C199";
        REG_PAI = "C190";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.O_SE;
    }

    public String getCOD_DOC_IMP() {
        return COD_DOC_IMP;
    }

    public void setCOD_DOC_IMP(String COD_DOC_IMP) {
        this.COD_DOC_IMP = COD_DOC_IMP;
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

    public String getVL_COFINS_IMP() {
        return VL_COFINS_IMP;
    }

    public void setVL_COFINS_IMP(String VL_COFINS_IMP) {
        this.VL_COFINS_IMP = VL_COFINS_IMP;
    }

    public String getVL_PIS_IMP() {
        return VL_PIS_IMP;
    }

    public void setVL_PIS_IMP(String VL_PIS_IMP) {
        this.VL_PIS_IMP = VL_PIS_IMP;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_DOC_IMP;
        linha += "|" + NUM_DOC_IMP;
        linha += "|" + VL_PIS_IMP;
        linha += "|" + VL_COFINS_IMP;
        linha += "|" + NUM_ACDRAW;
        linha += "|";
        return linha;
    }

}
