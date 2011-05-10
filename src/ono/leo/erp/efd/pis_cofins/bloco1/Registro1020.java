package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1020. 
 * Processo referenciado - Processo administrativo.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 09:54)
 */
public class Registro1020 extends Registro {

    private String NUM_PROC = "";
    private String IND_NAT_ACAO = "";
    private String DT_DEC_ADM = "";
    
    public Registro1020() {
        REG = "1020";
        REG_PAI = "1001";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getDT_DEC_ADM() {
        return DT_DEC_ADM;
    }

    public void setDT_DEC_ADM(String DT_DEC_ADM) {
        this.DT_DEC_ADM = DT_DEC_ADM;
    }

    public String getIND_NAT_ACAO() {
        return IND_NAT_ACAO;
    }

    public void setIND_NAT_ACAO(String IND_NAT_ACAO) {
        this.IND_NAT_ACAO = IND_NAT_ACAO;
    }

    public String getNUM_PROC() {
        return NUM_PROC;
    }

    public void setNUM_PROC(String NUM_PROC) {
        this.NUM_PROC = NUM_PROC;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + NUM_PROC;
        linha += "|" + IND_NAT_ACAO;
        linha += "|" + DT_DEC_ADM;
        linha += "|";
        return linha;
    }

}
