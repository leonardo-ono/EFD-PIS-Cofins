package ono.leo.erp.efd.pis_cofins.blocoA;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro A120. 
 * Informacao complementar - operacoes de importacao.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (13/03/2011 20:38)
 */
public class RegistroA120 extends Registro {
    
    private String VL_TOT_SERV = "";
    private String VL_BC_PIS = "";
    private String VL_PIS_IMP = "";
    private String DT_PAG_PIS = "";
    private String VL_BC_COFINS = "";
    private String VL_COFINS_IMP = "";
    private String DT_PAG_COFINS = "";
    private String LOC_EXE_SERV = "";
    
    public RegistroA120() {
        REG = "A120";
        REG_PAI = "A100";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getDT_PAG_COFINS() {
        return DT_PAG_COFINS;
    }

    public void setDT_PAG_COFINS(String DT_PAG_COFINS) {
        this.DT_PAG_COFINS = DT_PAG_COFINS;
    }

    public String getDT_PAG_PIS() {
        return DT_PAG_PIS;
    }

    public void setDT_PAG_PIS(String DT_PAG_PIS) {
        this.DT_PAG_PIS = DT_PAG_PIS;
    }

    public String getLOC_EXE_SERV() {
        return LOC_EXE_SERV;
    }

    public void setLOC_EXE_SERV(String LOC_EXE_SERV) {
        this.LOC_EXE_SERV = LOC_EXE_SERV;
    }

    public String getVL_BC_COFINS() {
        return VL_BC_COFINS;
    }

    public void setVL_BC_COFINS(String VL_BC_COFINS) {
        this.VL_BC_COFINS = VL_BC_COFINS;
    }

    public String getVL_BC_PIS() {
        return VL_BC_PIS;
    }

    public void setVL_BC_PIS(String VL_BC_PIS) {
        this.VL_BC_PIS = VL_BC_PIS;
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

    public String getVL_TOT_SERV() {
        return VL_TOT_SERV;
    }

    public void setVL_TOT_SERV(String VL_TOT_SERV) {
        this.VL_TOT_SERV = VL_TOT_SERV;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + VL_TOT_SERV;
        linha += "|" + VL_BC_PIS;
        linha += "|" + VL_PIS_IMP;
        linha += "|" + DT_PAG_PIS;
        linha += "|" + VL_BC_COFINS;
        linha += "|" + VL_COFINS_IMP;
        linha += "|" + DT_PAG_COFINS;
        linha += "|" + LOC_EXE_SERV;
        linha += "|";
        return linha;
    }

}
