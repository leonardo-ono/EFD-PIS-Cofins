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
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0000;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0001;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0110;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0140;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0990;
import ono.leo.erp.efd.pis_cofins.bloco1.Registro1001;
import ono.leo.erp.efd.pis_cofins.bloco1.Registro1990;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9001;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9990;
import ono.leo.erp.efd.pis_cofins.blocoA.RegistroA001;
import ono.leo.erp.efd.pis_cofins.blocoA.RegistroA990;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC001;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC990;
import ono.leo.erp.efd.pis_cofins.blocoD.RegistroD001;
import ono.leo.erp.efd.pis_cofins.blocoD.RegistroD990;
import ono.leo.erp.efd.pis_cofins.blocoF.RegistroF001;
import ono.leo.erp.efd.pis_cofins.blocoF.RegistroF990;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM001;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM200;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM600;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM990;

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
        adicionarTodosRegistrosObrigatorios();
    }
    
    private void adicionarTodosRegistrosObrigatorios() {
        // Bloco 0
        addRegistroInterno(new Registro0000());
        addRegistroInterno(new Registro0001());
        addRegistroInterno(new Registro0110());
        addRegistroInterno(new Registro0140());
        addRegistroInterno(new Registro0990());
        // Bloco A
        addRegistroInterno(new RegistroA001());
        addRegistroInterno(new RegistroA990());
        // Bloco C
        addRegistroInterno(new RegistroC001());
        addRegistroInterno(new RegistroC990());
        // Bloco D
        addRegistroInterno(new RegistroD001());
        addRegistroInterno(new RegistroD990());
        // Bloco F
        addRegistroInterno(new RegistroF001());
        addRegistroInterno(new RegistroF990());
        // Bloco M
        addRegistroInterno(new RegistroM001());
        addRegistroInterno(new RegistroM200());
        // TODO Registro M210 e obrigatorio ?
        addRegistroInterno(new RegistroM600());
        // TODO Registro M610 e obrigatorio ?
        addRegistroInterno(new RegistroM990());
        // Bloco 1
        addRegistroInterno(new Registro1001());
        addRegistroInterno(new Registro1990());
        // Bloco 9
        addRegistroInterno(new Registro9001());
        addRegistroInterno(new Registro9990());        
        addRegistroInterno(registro9999);
    }
    
    public void addRegistro(Registro registro) {
        if (registro.getObrigatoriedade() == Registro.Obrigatoriedade.O) {
            throw new RuntimeException("Nao e permitido adicionar "
                + "registros obrigatórios ! "
                + "Esses registros serao criados e inseridos "
                + "automaticamente na hora de gerar o arquivo !");
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
