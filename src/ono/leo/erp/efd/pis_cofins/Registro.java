package ono.leo.erp.efd.pis_cofins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9001;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9900;

/**
 * Classe abstrata para um Registro do layout EFD PIS/COFINS.
 *
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 10:37)
 */
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
    
    /**
     * <p>Indica a <strong>ocorrencia</strong> do Registro.</p>
     * 
     * <p><strong>UM</strong> = um por arquivo.</p>
     * 
     * <p><strong>VARIOS</strong> = varios por arquivo.</p>
     * 
     * <p><strong>UM_PARA_UM</strong> = devera haver um unico registro filho
     *                                  para respectivo registro pai.</p>
     * 
     * <p><strong>UM_PARA_MUITOS</strong> = pode haver varios registros filhos
     *                                      para respectivo registro pai.</p>
     * 
     */
    public static enum Ocorrencia { UM, VARIOS, UM_PARA_UM, UM_PARA_MUITOS }
    
    protected Obrigatoriedade obrigatoriedade;
    
    protected int nivel = 0;
    
    protected Ocorrencia ocorrencia;
    
    protected String REG = "0000";
    
    /**
     * <p>Indica o nome do registro pai.</p>
     */
    protected String REG_PAI = null;
    
    private static Registro9001 registro9001 = new Registro9001();
    
    private static Map<String, Registro9900> registros9900
            = new HashMap<String, Registro9900>();    
    
    protected List<Registro> registrosFilhos = new ArrayList<Registro>();

    public Obrigatoriedade getObrigatoriedade() {
        return obrigatoriedade;
    }

    public int getNivel() {
        return nivel;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }
    
    public String getREG() {
        return REG;
    }
    
    public String getREG_PAI() {
        return REG_PAI;
    }

    public static Registro9001 getRegistro9001Static() {
        return registro9001;
    }

    public String getBloco() {
        String bloco = "";
        if (REG.length() > 0) {
            bloco = REG.substring(0, 1);
        }
        return bloco;
    }
    
    public String gerarLinha() {
        StringBuilder sb = new StringBuilder();
        for (Registro registro : registrosFilhos) {
            sb.append(registro.gerarLinha());
        }
        return sb.toString();
    }
    
    public void addRegistroFilho(Registro registro) {
        if (!REG.equals(registro.getREG_PAI())) 
            throw new RuntimeException("Registro filho invalido !");
        
        if (registro == null) return;
        if (registrosFilhos.contains(registro)) return;
        if (this instanceof RegistroX001 
                && !(registro instanceof RegistroX001)
                && !(registro instanceof RegistroX990)) {
            
            ((RegistroX001) this).setIND_MOV("0");
        }
        registrosFilhos.add(registro);
        criarOuObterRegistro9900eAtualizarQTD_REG_BLC(registro);
    }

    public int getQuantidadeTotalDeRegistros() {
        int quantidadeTotalDeRegistros = 1;
        for (Registro registro : registrosFilhos) {
            quantidadeTotalDeRegistros 
                    += registro.getQuantidadeTotalDeRegistros();
        }
        return quantidadeTotalDeRegistros;
    }
    
    private void criarOuObterRegistro9900eAtualizarQTD_REG_BLC(
            Registro registro) {
                
        Registro9900 reg9900 = registros9900.get(registro.getREG());
        if (reg9900 == null) {
            reg9900 = new Registro9900(registro.getREG());
            registros9900.put(registro.getREG(), reg9900);
            registro9001.addRegistroFilho(reg9900);
        }
        reg9900.incrementarQTD_REG_BLC();
    }
    
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
        return r;
    }
    
}
