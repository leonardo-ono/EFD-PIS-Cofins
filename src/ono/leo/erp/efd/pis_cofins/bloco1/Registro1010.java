package ono.leo.erp.efd.pis_cofins.bloco1;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 1010. 
 * Processo referenciado - Acao judicial.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (24/03/2011 09:46)
 */
public class Registro1010 extends Registro {

    private String NUM_PROC = "";
    private String ID_SEC_JUD = "";
    private String ID_VARA = "";
    private String IND_NAT_ACAO = "";
    private String DESC_DEC_JUD = "";
    private String DT_SENT_JUD = "";
    
    public Registro1010() {
        REG = "1010";
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getDESC_DEC_JUD() {
        return DESC_DEC_JUD;
    }

    public void setDESC_DEC_JUD(String DESC_DEC_JUD) {
        this.DESC_DEC_JUD = DESC_DEC_JUD;
    }

    public String getDT_SENT_JUD() {
        return DT_SENT_JUD;
    }

    public void setDT_SENT_JUD(String DT_SENT_JUD) {
        this.DT_SENT_JUD = DT_SENT_JUD;
    }

    public String getID_SEC_JUD() {
        return ID_SEC_JUD;
    }

    public void setID_SEC_JUD(String ID_SEC_JUD) {
        this.ID_SEC_JUD = ID_SEC_JUD;
    }

    public String getID_VARA() {
        return ID_VARA;
    }

    public void setID_VARA(String ID_VARA) {
        this.ID_VARA = ID_VARA;
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
        linha += "|" + ID_SEC_JUD;
        linha += "|" + ID_VARA;
        linha += "|" + IND_NAT_ACAO;
        linha += "|" + DESC_DEC_JUD;
        linha += "|" + DT_SENT_JUD;
        linha += "|";
        return linha;
    }

}
