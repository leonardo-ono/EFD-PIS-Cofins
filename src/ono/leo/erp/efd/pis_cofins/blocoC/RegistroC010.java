package ono.leo.erp.efd.pis_cofins.blocoC;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;

/**
 * Registro C010. 
 * Identificacao do estabelecimento.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 11:24)
 */
public class RegistroC010 extends Registro {
    
    private String CNPJ = "22222222000191";
    private String IND_ESCRI = "2";

    public RegistroC010() {
        super();
        REG = "C010";
        nivel = 2;
        obrigatoriedade = Obrigatoriedade.O_SE;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIND_ESCRI() {
        return IND_ESCRI;
    }

    public void setIND_ESCRI(String IND_ESCRI) {
        this.IND_ESCRI = IND_ESCRI;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + CNPJ;
        linha += "|" + IND_ESCRI;
        linha += "|";
        return linha;
    }

}
