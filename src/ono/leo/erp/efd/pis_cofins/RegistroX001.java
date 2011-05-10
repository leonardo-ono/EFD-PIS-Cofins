package ono.leo.erp.efd.pis_cofins;

/**
 * Classe abstrata para Registros X001 do layout EFD-PIS/COFINS.
 * 
 * Representa a abertura do bloco X, sendo X igual 
 * a 0, A, C, D, F, M, 1 ou 9.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (11/03/2011 14:54)
 */
public abstract class RegistroX001 extends Registro {

    /**
     * <p>Indicador de movimento:</p> 
     * <p><strong>0</strong> - Bloco com dados informados.</p>
     * <p><strong>1</strong> - Bloco sem dados informados.</p>
     */ 
    protected String IND_MOV = "1";

    public RegistroX001() {
        nivel = 1;
    }

    public String getIND_MOV() {
        return IND_MOV;
    }

    public void setIND_MOV(String IND_MOV) {
        this.IND_MOV = IND_MOV;
    }
    
}
