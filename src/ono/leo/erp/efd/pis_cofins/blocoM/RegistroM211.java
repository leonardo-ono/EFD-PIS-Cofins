package ono.leo.erp.efd.pis_cofins.blocoM;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro M211. 
 * Sociedades cooperativas - composicao da base de calculo - PIS/PASEP.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (23/03/2011 10:14)
 */
public class RegistroM211 extends Registro {

    private String IND_TIP_COOP = "";
    private String VL_BC_CONT_ANT_EXC_COOP = "";
    private String VL_EXC_COOP_GER = "";
    private String VL_EXC_ESP_COOP = "";
    private String VL_BC_CONT = "";
    
    public RegistroM211() {
        REG = "M211";
        REG_PAI = "M210";
        nivel = 4;
        ocorrencia = Ocorrencia.UM_PARA_UM;
        obrigatoriedade = Obrigatoriedade.O_SE;
    }

    public String getIND_TIP_COOP() {
        return IND_TIP_COOP;
    }

    public void setIND_TIP_COOP(String IND_TIP_COOP) {
        this.IND_TIP_COOP = IND_TIP_COOP;
    }

    public String getVL_BC_CONT() {
        return VL_BC_CONT;
    }

    public void setVL_BC_CONT(String VL_BC_CONT) {
        this.VL_BC_CONT = VL_BC_CONT;
    }

    public String getVL_BC_CONT_ANT_EXC_COOP() {
        return VL_BC_CONT_ANT_EXC_COOP;
    }

    public void setVL_BC_CONT_ANT_EXC_COOP(String VL_BC_CONT_ANT_EXC_COOP) {
        this.VL_BC_CONT_ANT_EXC_COOP = VL_BC_CONT_ANT_EXC_COOP;
    }

    public String getVL_EXC_COOP_GER() {
        return VL_EXC_COOP_GER;
    }

    public void setVL_EXC_COOP_GER(String VL_EXC_COOP_GER) {
        this.VL_EXC_COOP_GER = VL_EXC_COOP_GER;
    }

    public String getVL_EXC_ESP_COOP() {
        return VL_EXC_ESP_COOP;
    }

    public void setVL_EXC_ESP_COOP(String VL_EXC_ESP_COOP) {
        this.VL_EXC_ESP_COOP = VL_EXC_ESP_COOP;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + IND_TIP_COOP;
        linha += "|" + VL_BC_CONT_ANT_EXC_COOP;
        linha += "|" + VL_EXC_COOP_GER;
        linha += "|" + VL_EXC_ESP_COOP;
        linha += "|" + VL_BC_CONT;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
