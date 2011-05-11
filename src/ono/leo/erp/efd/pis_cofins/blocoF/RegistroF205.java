package ono.leo.erp.efd.pis_cofins.blocoF;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro F205. 
 * Operacoes da atividade imobiliaria - Custo incorrido da unidade imobiliaria.
 * 
 * Obs.: no layout, faltam os campos de no. 14 e 15. Como deve ficar
 *       o formato correto do arquivo ?
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/03/2011 11:24)
 */
public class RegistroF205 extends Registro {
    
    private String VL_CUS_INC_ACUM_ANT = "";
    private String VL_CUS_INC_PER_ESC = "";
    private String VL_CUS_INC_ACUM = "";
    private String VL_EXC_BC_CUS_INC_ACUM = "";
    private String VL_BC_CUS_INC = "";
    private String CST_PIS = "";
    private String ALIQ_PIS = "";
    private String VL_CRED_PIS_ACUM = "";
    private String VL_CRED_PIS_DESC_ANT = "";
    private String VL_CRED_PIS_DESC = "";
    private String VL_CRED_PIS_DESC_FUT = "";
    private String CST_COFINS = "";
    // Falta o campo 14 ?
    // Falta o campo 15 ?
    private String ALIQ_COFINS = "";
    private String VL_CRED_COFINS_ACUM = "";
    private String VL_CRED_COFINS_DESC_ANT = "";
    private String VL_CRED_COFINS_DESC = "";
    private String VL_CRED_COFINS_DESC_FUT = "";
    
    public RegistroF205() {
        REG = "F205";
        REG_PAI = "F200";
        nivel = 4;
        ocorrencia = Ocorrencia.UM_PARA_UM;
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

    public String getVL_BC_CUS_INC() {
        return VL_BC_CUS_INC;
    }

    public void setVL_BC_CUS_INC(String VL_BC_CUS_INC) {
        this.VL_BC_CUS_INC = VL_BC_CUS_INC;
    }

    public String getVL_CRED_COFINS_ACUM() {
        return VL_CRED_COFINS_ACUM;
    }

    public void setVL_CRED_COFINS_ACUM(String VL_CRED_COFINS_ACUM) {
        this.VL_CRED_COFINS_ACUM = VL_CRED_COFINS_ACUM;
    }

    public String getVL_CRED_COFINS_DESC() {
        return VL_CRED_COFINS_DESC;
    }

    public void setVL_CRED_COFINS_DESC(String VL_CRED_COFINS_DESC) {
        this.VL_CRED_COFINS_DESC = VL_CRED_COFINS_DESC;
    }

    public String getVL_CRED_COFINS_DESC_ANT() {
        return VL_CRED_COFINS_DESC_ANT;
    }

    public void setVL_CRED_COFINS_DESC_ANT(String VL_CRED_COFINS_DESC_ANT) {
        this.VL_CRED_COFINS_DESC_ANT = VL_CRED_COFINS_DESC_ANT;
    }

    public String getVL_CRED_COFINS_DESC_FUT() {
        return VL_CRED_COFINS_DESC_FUT;
    }

    public void setVL_CRED_COFINS_DESC_FUT(String VL_CRED_COFINS_DESC_FUT) {
        this.VL_CRED_COFINS_DESC_FUT = VL_CRED_COFINS_DESC_FUT;
    }

    public String getVL_CRED_PIS_ACUM() {
        return VL_CRED_PIS_ACUM;
    }

    public void setVL_CRED_PIS_ACUM(String VL_CRED_PIS_ACUM) {
        this.VL_CRED_PIS_ACUM = VL_CRED_PIS_ACUM;
    }

    public String getVL_CRED_PIS_DESC() {
        return VL_CRED_PIS_DESC;
    }

    public void setVL_CRED_PIS_DESC(String VL_CRED_PIS_DESC) {
        this.VL_CRED_PIS_DESC = VL_CRED_PIS_DESC;
    }

    public String getVL_CRED_PIS_DESC_ANT() {
        return VL_CRED_PIS_DESC_ANT;
    }

    public void setVL_CRED_PIS_DESC_ANT(String VL_CRED_PIS_DESC_ANT) {
        this.VL_CRED_PIS_DESC_ANT = VL_CRED_PIS_DESC_ANT;
    }

    public String getVL_CRED_PIS_DESC_FUT() {
        return VL_CRED_PIS_DESC_FUT;
    }

    public void setVL_CRED_PIS_DESC_FUT(String VL_CRED_PIS_DESC_FUT) {
        this.VL_CRED_PIS_DESC_FUT = VL_CRED_PIS_DESC_FUT;
    }

    public String getVL_CUS_INC_ACUM() {
        return VL_CUS_INC_ACUM;
    }

    public void setVL_CUS_INC_ACUM(String VL_CUS_INC_ACUM) {
        this.VL_CUS_INC_ACUM = VL_CUS_INC_ACUM;
    }

    public String getVL_CUS_INC_ACUM_ANT() {
        return VL_CUS_INC_ACUM_ANT;
    }

    public void setVL_CUS_INC_ACUM_ANT(String VL_CUS_INC_ACUM_ANT) {
        this.VL_CUS_INC_ACUM_ANT = VL_CUS_INC_ACUM_ANT;
    }

    public String getVL_CUS_INC_PER_ESC() {
        return VL_CUS_INC_PER_ESC;
    }

    public void setVL_CUS_INC_PER_ESC(String VL_CUS_INC_PER_ESC) {
        this.VL_CUS_INC_PER_ESC = VL_CUS_INC_PER_ESC;
    }

    public String getVL_EXC_BC_CUS_INC_ACUM() {
        return VL_EXC_BC_CUS_INC_ACUM;
    }

    public void setVL_EXC_BC_CUS_INC_ACUM(String VL_EXC_BC_CUS_INC_ACUM) {
        this.VL_EXC_BC_CUS_INC_ACUM = VL_EXC_BC_CUS_INC_ACUM;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + VL_CUS_INC_ACUM_ANT;
        linha += "|" + VL_CUS_INC_PER_ESC;
        linha += "|" + VL_CUS_INC_ACUM;
        linha += "|" + VL_EXC_BC_CUS_INC_ACUM;
        linha += "|" + VL_BC_CUS_INC;
        linha += "|" + CST_PIS;
        linha += "|" + ALIQ_PIS;
        linha += "|" + VL_CRED_PIS_ACUM;
        linha += "|" + VL_CRED_PIS_DESC_ANT;
        linha += "|" + VL_CRED_PIS_DESC;
        linha += "|" + VL_CRED_PIS_DESC_FUT;
        linha += "|" + CST_COFINS;
        // Falta o campo 14 ?
        // Falta o campo 15 ?
        linha += "|" + ALIQ_COFINS;
        linha += "|" + VL_CRED_COFINS_ACUM;
        linha += "|" + VL_CRED_COFINS_DESC_ANT;
        linha += "|" + VL_CRED_COFINS_DESC;
        linha += "|" + VL_CRED_COFINS_DESC_FUT;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
