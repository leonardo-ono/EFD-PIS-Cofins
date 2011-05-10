package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M350. 
 * PIS/PASEP - Folha de salarios.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 10:29)
 */
public class RegistroM350 extends Registro {

    private String VL_TOT_FOL = "";
    private String VL_EXC_BC = "";
    private String VL_TOT_BC = "";
    private String ALIQ_PIS_FOL = "";
    private String VL_TOT_CONT_FOL = "";
    
    public RegistroM350() {
        REG = "M350";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_PIS_FOL() {
        return ALIQ_PIS_FOL;
    }

    public void setALIQ_PIS_FOL(String ALIQ_PIS_FOL) {
        this.ALIQ_PIS_FOL = ALIQ_PIS_FOL;
    }

    public String getVL_EXC_BC() {
        return VL_EXC_BC;
    }

    public void setVL_EXC_BC(String VL_EXC_BC) {
        this.VL_EXC_BC = VL_EXC_BC;
    }

    public String getVL_TOT_BC() {
        return VL_TOT_BC;
    }

    public void setVL_TOT_BC(String VL_TOT_BC) {
        this.VL_TOT_BC = VL_TOT_BC;
    }

    public String getVL_TOT_CONT_FOL() {
        return VL_TOT_CONT_FOL;
    }

    public void setVL_TOT_CONT_FOL(String VL_TOT_CONT_FOL) {
        this.VL_TOT_CONT_FOL = VL_TOT_CONT_FOL;
    }

    public String getVL_TOT_FOL() {
        return VL_TOT_FOL;
    }

    public void setVL_TOT_FOL(String VL_TOT_FOL) {
        this.VL_TOT_FOL = VL_TOT_FOL;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + VL_TOT_FOL;
        linha += "|" + VL_EXC_BC;
        linha += "|" + VL_TOT_BC;
        linha += "|" + ALIQ_PIS_FOL;
        linha += "|" + VL_TOT_CONT_FOL;
        linha += "|";
        return linha;
    }

}
