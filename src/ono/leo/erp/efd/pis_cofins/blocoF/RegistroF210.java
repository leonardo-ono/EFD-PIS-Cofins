package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F210. 
 * Operacoes da atividade imobiliaria - Custo orcado da unidade imobiliaria
 * vendida.
 * 
 * Obs.: no layout, faltam os campos de no. 1 a 3. Como deve ficar
 *       o formato correto do arquivo ?
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 10:40)
 */
public class RegistroF210 extends Registro {
    
    // campo no. 1 deve ser o REG
    // campo no. 2 ???
    // campo no. 3 ???
    private String VL_CUS_ORC = "";
    private String VL_EXC = "";
    private String VL_CUS_ORC_AJU = "";
    private String VL_BC_CRED = "";
    private String CST_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_CRED_PIS_UTIL = "";
    private String CST_COFINS = "";
    private String ALIQ_COFINS = "";
    private String VL_CRED_COFINS_UTIL = "";
    
    public RegistroF210() {
        REG = "F210";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getALIQ_COFINS() {
        return ALIQ_COFINS;
    }

    public void setALIQ_COFINS(String ALIQ_COFINS) {
        this.ALIQ_COFINS = ALIQ_COFINS;
    }

    public String getALIQ_PIS() {
        return ALIQ_PIS;
    }

    public void setALIQ_PIS(String ALIQ_PIS) {
        this.ALIQ_PIS = ALIQ_PIS;
    }

    public String getCST_COFINS() {
        return CST_COFINS;
    }

    public void setCST_COFINS(String CST_COFINS) {
        this.CST_COFINS = CST_COFINS;
    }

    public String getCST_PIS() {
        return CST_PIS;
    }

    public void setCST_PIS(String CST_PIS) {
        this.CST_PIS = CST_PIS;
    }

    public String getVL_BC_CRED() {
        return VL_BC_CRED;
    }

    public void setVL_BC_CRED(String VL_BC_CRED) {
        this.VL_BC_CRED = VL_BC_CRED;
    }

    public String getVL_CRED_COFINS_UTIL() {
        return VL_CRED_COFINS_UTIL;
    }

    public void setVL_CRED_COFINS_UTIL(String VL_CRED_COFINS_UTIL) {
        this.VL_CRED_COFINS_UTIL = VL_CRED_COFINS_UTIL;
    }

    public String getVL_CRED_PIS_UTIL() {
        return VL_CRED_PIS_UTIL;
    }

    public void setVL_CRED_PIS_UTIL(String VL_CRED_PIS_UTIL) {
        this.VL_CRED_PIS_UTIL = VL_CRED_PIS_UTIL;
    }

    public String getVL_CUS_ORC() {
        return VL_CUS_ORC;
    }

    public void setVL_CUS_ORC(String VL_CUS_ORC) {
        this.VL_CUS_ORC = VL_CUS_ORC;
    }

    public String getVL_CUS_ORC_AJU() {
        return VL_CUS_ORC_AJU;
    }

    public void setVL_CUS_ORC_AJU(String VL_CUS_ORC_AJU) {
        this.VL_CUS_ORC_AJU = VL_CUS_ORC_AJU;
    }

    public String getVL_EXC() {
        return VL_EXC;
    }

    public void setVL_EXC(String VL_EXC) {
        this.VL_EXC = VL_EXC;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG; // campo no. 1 deve ser o REG
        // campo no. 2 ???
        // campo no. 3 ???
        linha += "|" + VL_CUS_ORC;
        linha += "|" + VL_EXC;
        linha += "|" + VL_CUS_ORC_AJU;
        linha += "|" + VL_BC_CRED;
        linha += "|" + CST_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_CRED_PIS_UTIL;
        linha += "|" + CST_COFINS;
        linha += "|" + ALIQ_COFINS;
        linha += "|" + VL_CRED_COFINS_UTIL;
        linha += "|";
        return linha;
    }

}
