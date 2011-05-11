package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C110. 
 * Complemento do documento - informacao complementar da nota fiscal 
 * (codigos 01, 1B, 04 e 55).
 * 
 * Layout para este registro encontra-se no 
 * ATO COTEPE/ICMS Nº 9, DE 18 DE ABRIL DE 2008
 * (http://www.fazenda.gov.br/confaz/confaz/atos/atos_cotepe/2008/ac009_08.htm).
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (14/03/2011 10:56)
 */
public class RegistroC110 extends Registro {
    
    private String COD_INF = "";
    private String TXT_COMPL = "";
 
    public RegistroC110() {
        super();
        REG = "C110";
        REG_PAI = "C100";
        nivel = 4;
        ocorrencia = Ocorrencia.UM_PARA_MUITOS;
        obrigatoriedade = Obrigatoriedade.OC;
    }

    public String getCOD_INF() {
        return COD_INF;
    }

    public void setCOD_INF(String COD_INF) {
        this.COD_INF = COD_INF;
    }

    public String getTXT_COMPL() {
        return TXT_COMPL;
    }

    public void setTXT_COMPL(String TXT_COMPL) {
        this.TXT_COMPL = TXT_COMPL;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_INF;
        linha += "|" + TXT_COMPL;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
