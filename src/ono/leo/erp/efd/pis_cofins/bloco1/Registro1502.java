package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1502. 
 * Detalhamento do credito extemporaneo vinculado a mais de um tipo de 
 * receita - Cofins.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 09:40)
 */
public class Registro1502 extends Registro {

    private String VL_CRED_COFINS_TRIB_MI = "";
    private String VL_CRED_COFINS_NT_MI = "";
    private String VL_CRED_COFINS_EXP = "";
    
    public Registro1502() {
        REG = "1502";
        nivel = 4;
        obrigatoriedade = Obrigatoriedade.O_SE; // se CST_COFINS do 
                                                // registro 1501 for igual a 53,
                                                // 54, 55, 56, 63, 64, 65 ou 66)
    }

    public String getVL_CRED_COFINS_EXP() {
        return VL_CRED_COFINS_EXP;
    }

    public void setVL_CRED_COFINS_EXP(String VL_CRED_COFINS_EXP) {
        this.VL_CRED_COFINS_EXP = VL_CRED_COFINS_EXP;
    }

    public String getVL_CRED_COFINS_NT_MI() {
        return VL_CRED_COFINS_NT_MI;
    }

    public void setVL_CRED_COFINS_NT_MI(String VL_CRED_COFINS_NT_MI) {
        this.VL_CRED_COFINS_NT_MI = VL_CRED_COFINS_NT_MI;
    }

    public String getVL_CRED_COFINS_TRIB_MI() {
        return VL_CRED_COFINS_TRIB_MI;
    }

    public void setVL_CRED_COFINS_TRIB_MI(String VL_CRED_COFINS_TRIB_MI) {
        this.VL_CRED_COFINS_TRIB_MI = VL_CRED_COFINS_TRIB_MI;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + VL_CRED_COFINS_TRIB_MI;
        linha += "|" + VL_CRED_COFINS_NT_MI;
        linha += "|" + VL_CRED_COFINS_EXP;
        linha += "|";
        return linha;
    }

}
