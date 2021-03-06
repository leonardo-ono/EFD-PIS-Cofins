package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro 0110. Regimes de apuracao da contribuicao social e de 
 * apropriacao de credito.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/02/2011 15:23)
 */
public class Registro0110 extends Registro {
    
    private String COD_INC_TRIB = "1";
    private String IND_APRO_CRED = "1";
    private String COD_TIPO_CONT = "1";
    private String IND_REG_CUM = "";
    
    public Registro0110() {
        REG = "0110";
        REG_PAI = "0001";
        nivel = 2;
        ocorrencia = Ocorrencia.UM;
        obrigatoriedade = Obrigatoriedade.O;
    }

    public String getCOD_INC_TRIB() {
        return COD_INC_TRIB;
    }

    public void setCOD_INC_TRIB(String COD_INC_TRIB) {
        this.COD_INC_TRIB = COD_INC_TRIB;
    }

    public String getCOD_TIPO_CONT() {
        return COD_TIPO_CONT;
    }

    public void setCOD_TIPO_CONT(String COD_TIPO_CONT) {
        this.COD_TIPO_CONT = COD_TIPO_CONT;
    }

    public String getIND_APRO_CRED() {
        return IND_APRO_CRED;
    }

    public void setIND_APRO_CRED(String IND_APRO_CRED) {
        this.IND_APRO_CRED = IND_APRO_CRED;
    }

    public String getIND_REG_CUM() {
        return IND_REG_CUM;
    }

    public void setIND_REG_CUM(String IND_REG_CUM) {
        this.IND_REG_CUM = IND_REG_CUM;
    }

    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_INC_TRIB;
        linha += "|" + IND_APRO_CRED;
        linha += "|" + COD_TIPO_CONT;
        linha += "|" + IND_REG_CUM;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

}
