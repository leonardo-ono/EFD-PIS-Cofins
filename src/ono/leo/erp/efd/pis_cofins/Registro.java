package ono.leo.erp.efd.pis_cofins;


public abstract class Registro implements Comparable<Registro> {

    /**
     * <p>Indica a <strong>obrigatoriedade</strong> do Registro.</p>
     * 
     * <p><strong>O</strong> = O registro sempre e obrigatorio.</p>
     * 
     * <p><strong>OC</strong> = O registro e obrigatorio, se houver informacao 
     *                          a ser prestada.
     * 
     *         Ex.: Registro C100 so devera ser apresentado se houver 
     *              movimentacao ou operacoes utilizando os documentos de 
     *              codigos 01, 1B, 04 ou 55.</p>
     * 
     * <p><strong>O_SE</strong> = O(...) = O registro e obrigatorio se atentida 
     *                                     a condicao.
     * 
     *                    Ex.: Registro C191 O(Se existir C190) O registro e
     *                         obrigatorio sempre que houver o registro C190.
     * 
     * <p><strong>N</strong>= O registro nao deve ser informado. 
     * 
     *        Ex.: Registro C490 se for informado o Registro C400.</p>
     */
    public static enum Obrigatoriedade { O, OC, O_SE, N }
    
    protected Obrigatoriedade obrigatoriedade;
    
    protected int nivel = 0;
    
    protected String REG = "0000";

    public Obrigatoriedade getObrigatoriedade() {
        return obrigatoriedade;
    }

    protected void setObrigatoriedade(Obrigatoriedade obrigatoriedade) {
        this.obrigatoriedade = obrigatoriedade;
    }

    public int getNivel() {
        return nivel;
    }

    public String getREG() {
        return REG;
    }

    public String getBloco() {
        String bloco = "";
        if (REG.length() > 0) {
            bloco = REG.substring(0, 1);
        }
        return bloco;
    }
    
    public abstract String gerarLinha();

    @Override
    public int compareTo(Registro o) {
        String linha1 = gerarLinha();
        if (linha1.startsWith("|0")) linha1 = "0" + linha1;
        if (linha1.startsWith("|A")) linha1 = "1" + linha1;
        if (linha1.startsWith("|C")) linha1 = "2" + linha1;
        if (linha1.startsWith("|D")) linha1 = "3" + linha1;
        if (linha1.startsWith("|F")) linha1 = "4" + linha1;
        if (linha1.startsWith("|M")) linha1 = "5" + linha1;
        if (linha1.startsWith("|1")) linha1 = "6" + linha1;
        if (linha1.startsWith("|9")) linha1 = "7" + linha1;

        String linha2 = o.gerarLinha();
        if (linha2.startsWith("|0")) linha2 = "0" + linha2;
        if (linha2.startsWith("|A")) linha2 = "1" + linha2;
        if (linha2.startsWith("|C")) linha2 = "2" + linha2;
        if (linha2.startsWith("|D")) linha2 = "3" + linha2;
        if (linha2.startsWith("|F")) linha2 = "4" + linha2;
        if (linha2.startsWith("|M")) linha2 = "5" + linha2;
        if (linha2.startsWith("|1")) linha2 = "6" + linha2;
        if (linha2.startsWith("|9")) linha2 = "7" + linha2;
        
        int r = linha1.compareTo(linha2);
        
        //System.out.println("-----------------------------------");
        //System.out.println("LINHA1=" + linha1);
        //System.out.println("LINHA2=" + linha2);
        //System.out.println("R=" + r);
        
        return r;
    }
    
}
