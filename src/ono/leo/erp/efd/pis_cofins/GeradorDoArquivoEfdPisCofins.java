package ono.leo.erp.efd.pis_cofins;

import ono.leo.erp.efd.pis_cofins.bloco9.Registro9900;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9999;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Gerador de arquivo EFD-PIS/COFINS.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (03/03/2011 13:52)
 */
public class GeradorDoArquivoEfdPisCofins {

    private Map<String, Integer> quantidadePorBloco 
            = new HashMap<String, Integer>();
    
    private Map<String, Registro9900> registros9900 
            = new HashMap<String, Registro9900>();
    
    private List<Registro> registros = new ArrayList<Registro>();
    private Set<RegistroX990> registrosX990 = new HashSet<RegistroX990>();
    private Registro9999 registro9999 = new Registro9999();
    private Integer quantidadeTotalDeRegistros = 0;
    
    public GeradorDoArquivoEfdPisCofins() {
        addRegistroInterno(registro9999);
    }
    
    public void addRegistro(Registro registro) {
        if (registro instanceof Registro9900 
         || registro instanceof Registro9999) {
             
            throw new RuntimeException("Nao e permitido adicionar "
                + "Registro9900 e Registro9999 ! "
                + "Esses registros serao criados e inseridos "
                + "automaticamente pelo sistema na hora de gerar o arquivo !");
        }
        addRegistroInterno(registro);
    }
    
    private void addRegistroInterno(Registro registro) {
        if (registros.contains(registro)) {
            return;
        }
        atualizarQuantidadeDeRegistroPorBloco(registro);
        registros.add(registro);
        if (registro instanceof RegistroX990) {
            registrosX990.add((RegistroX990) registro);
        }
        quantidadeTotalDeRegistros++;
        criarOuObterRegistro9900eAtualizar_QTD_REG_BLC(registro);
    }
    
    private void criarOuObterRegistro9900eAtualizar_QTD_REG_BLC(
            Registro registro) {
                
        Registro9900 reg9900 = registros9900.get(registro.getREG());
        if (reg9900 == null) {
            reg9900 = new Registro9900(registro.getREG());
            registros9900.put(registro.getREG(), reg9900);
            addRegistroInterno(reg9900);
        }
        reg9900.incrementarQTD_REG_BLC();
    }
    
    private void atualizarQuantidadeDeRegistroPorBloco(Registro registro) {
        Integer quantidade = quantidadePorBloco.get(registro.getBloco());
        if (quantidade == null) {
            quantidade = 0;
        }
        quantidade++;
        quantidadePorBloco.put(registro.getBloco(), quantidade);
    }

    public void gerar(String caminho) throws Exception {
        atualizarQuantidadeDeLinhasDeTodosRegistrosX990();
        // atualiza quantidade de linhas do registro 9999
        registro9999.setQTD_LIN(quantidadeTotalDeRegistros.toString());
        Collections.sort(registros); // ordena todos registros
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(caminho);
            for (Registro registro : registros) {
                pw.println(registro.gerarLinha());
            }
            pw.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            pw.close();
        }
    }

    private void atualizarQuantidadeDeLinhasDeTodosRegistrosX990() {
        for (RegistroX990 registroX990 : registrosX990) {
            Integer quantidade 
                    = quantidadePorBloco.get(registroX990.getBloco());
            
            if (quantidade == null) {
                quantidade = 0;
            }
            registroX990.setQTD_LIN(quantidade.toString());
        }
    }
    
}
