package ono.leo.erp.efd.pis_cofins;

import javax.swing.JOptionPane;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0001;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0100;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0110;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0140;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0150;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0190;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0200;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0400;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC001;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC010;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC100;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC170;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM001;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM200;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM600;

/**
 * Gera um arquivo EFD-PIS/Cofins de exemplo simples.
 * 
 * Testado no validador PVA versao 2.0.1.a.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (06/09/2012 12:51)
 */
public class Main {
    
    // Ponto de partida / Registro Root
    static RegistroRoot registroRoot = new RegistroRoot(); 
    
    // Bloco 0
    
    // Dados do contabilista
    static Registro0100 registro0100 = new Registro0100(); 
    static Registro0110 registro0110 = new Registro0110();
    static Registro0140 registro0140 = new Registro0140();

    // Bloco C
    
    // Identificacao do estabelecimento
    static RegistroC010 registroC010 = new RegistroC010(); 
    // Cabecalho da NFe
    static RegistroC100 registroC100 = new RegistroC100(); 
    
    // Bloco M

    static RegistroM200 registroM200 = new RegistroM200();
    static RegistroM600 registroM600 = new RegistroM600();

    public static void main(String[] args) {

        Registro0001 registro0001 
                = registroRoot.getRegistro0000().getRegistro0001();
        
        registro0001.addRegistroFilho(registro0100); // Dados do contabilista
        registro0001.addRegistroFilho(registro0110);
        registro0001.addRegistroFilho(registro0140);
        
        // Registro0150 Cliente
        registro0140.addRegistroFilho(criarClienteTeste()); 
        // Registro0150 Fornecedor
        registro0140.addRegistroFilho(criarFornecedorTeste()); 
        // Registro0190 Unidade
        registro0140.addRegistroFilho(criarUnidadeTeste_1()); 
        registro0140.addRegistroFilho(criarUnidadeTeste_2()); 
        // Registro0200 Produto
        registro0140.addRegistroFilho(criarProdutoTeste_1()); 
        // Registro0400 CFOP
        registro0140.addRegistroFilho(criarCfopTeste()); 

        RegistroC001 registroC001 
                = registroRoot.getRegistro0000().getRegistroC001();
        
        // Identificacao do estabelecimento
        registroC001.addRegistroFilho(registroC010); 
        
        // Cabecalho NF
        registroC100.setCOD_MOD("01");
        registroC100.setCOD_PART("1");
        registroC100.setVL_PIS("5,22");
        registroC100.setVL_COFINS("24,02");
        registroC010.addRegistroFilho(registroC100); 
        
        // Item da NFe
        registroC100.addRegistroFilho(criarItemDaNFeTeste_1()); 
        registroC100.addRegistroFilho(criarItemDaNFeTeste_2()); 
        
        RegistroM001 registroM001 
                = registroRoot.getRegistro0000().getRegistroM001();
        
        registroM001.addRegistroFilho(registroM200);
        registroM001.addRegistroFilho(registroM600);
        
        String caminho = "c:/teste_efd_pis_cofins.txt";
        
        caminho = JOptionPane.showInputDialog(
                "Informe o caminho em que o arquivo será gerado:", caminho);
        
        try {
            registroRoot.gerar(caminho);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null
                    , "Ocorreu um erro ao tentar gerar arquivo ! \n\n"
                    + "Verifique o caminho informado e tente novamente."
                    , ":: Erro", JOptionPane.ERROR_MESSAGE );
        }

    }

    private static Registro0150 criarFornecedorTeste() {
        Registro0150 fornecedor = new Registro0150();
        fornecedor.setCOD_PART("2");
        fornecedor.setBAIRRO("BAIRRO AAA");
        fornecedor.setCNPJ("");
        fornecedor.setCPF("88340920588"); // Gerado pelo http://www.geradorcpf.com/ 
        fornecedor.setCOD_MUN("3550308");
        fornecedor.setCOD_PAIS("01058");
        fornecedor.setEND("RUA AAA");
        fornecedor.setNUM("99");
        fornecedor.setNOME("NOME PESSOA FISICA");
        return fornecedor;
    }
    
    private static Registro0150 criarClienteTeste() {
        Registro0150 cliente = new Registro0150();
        cliente.setCOD_PART("1");
        cliente.setBAIRRO("BAIRRO BBB");
        cliente.setCNPJ("");
        cliente.setCPF("17898468970"); // Gerado pelo http://www.geradorcpf.com/
        cliente.setCOD_MUN("3550308");
        cliente.setCOD_PAIS("01058");
        cliente.setEND("RUA BBB");
        cliente.setNUM("99");
        cliente.setNOME("NOME PESSOA FISICA");
        return cliente;
    }
    
    private static Registro0190 criarUnidadeTeste_1() {
        Registro0190 unidade = new Registro0190();
        return unidade;
    }
    
    private static Registro0190 criarUnidadeTeste_2() {
        Registro0190 unidade = new Registro0190();
        unidade.setUNID("PC");
        unidade.setDESC("PECA");
        return unidade;
    }
    
    private static Registro0200 criarProdutoTeste_1() {
        Registro0200 produto = new Registro0200();
        return produto;
    }
    
    private static Registro0400 criarCfopTeste() {
        Registro0400 cfop = new Registro0400();
        return cfop;
    }
    
    private static RegistroC170 criarItemDaNFeTeste_1() {
        RegistroC170 item = new RegistroC170();
        item.setNUM_ITEM("1");
        item.setCST_PIS("70");
        item.setCST_COFINS("70");
        return item;
    }
    
    private static RegistroC170 criarItemDaNFeTeste_2() {
        RegistroC170 item = new RegistroC170();
        item.setNUM_ITEM("2");
        item.setVL_ITEM("123,45");
        item.setUNID("PC");
        item.setCST_PIS("70");
        item.setCST_COFINS("70");
        return item;
    }
    
}
