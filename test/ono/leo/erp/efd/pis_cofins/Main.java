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
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM100;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM105;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM200;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM500;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM505;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM600;

/**
 * Gera um arquivo EFD-PIS/Cofins de exemplo simples que pelo menos
 * passa no validador PVA versao 1.0.0 Beta.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (10/03/2011 16:43)
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
    // Item da NFe
    static RegistroC170 registroC170 = new RegistroC170(); 

    // Bloco M
    
    // Credito de PIS/PASEP relativo ao periodo.
    static RegistroM100 registroM100 = new RegistroM100(); 
    // Detalhamento da base de calculo do credito apurado no periodo PIS/PASEP.
    static RegistroM105 registroM105 = new RegistroM105(); 
    static RegistroM200 registroM200 = new RegistroM200();
    // Credito de COFINS relativo ao periodo.
    static RegistroM500 registroM500 = new RegistroM500(); 
    // Detalhamento da base de calculo do credito apurado no periodo - Cofins.
    static RegistroM505 registroM505 = new RegistroM505(); 
    // TODO Registro M210 e obrigatorio ?
    static RegistroM600 registroM600 = new RegistroM600();
    // TODO Registro M610 e obrigatorio ?

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
        registro0140.addRegistroFilho(criarUnidadeTeste()); 
        // Registro0200 Produto
        registro0140.addRegistroFilho(criarProdutoTeste()); 
        // Registro0400 CFOP
        registro0140.addRegistroFilho(criarCfopTeste()); 

        RegistroC001 registroC001 
                = registroRoot.getRegistro0000().getRegistroC001();
        
        // Identificacao do estabelecimento
        registroC001.addRegistroFilho(registroC010); 
        // Cabecalho da NFe
        registroC010.addRegistroFilho(registroC100); 
        // Item da NFe
        registroC100.addRegistroFilho(registroC170); 

        RegistroM001 registroM001 
                = registroRoot.getRegistro0000().getRegistroM001();
        
        // Credito de PIS/PASEP relativo ao periodo.
        registroM001.addRegistroFilho(registroM100); 
        // Detalhamento da base de calc do credito apurado no periodo PIS/PASEP.
        registroM100.addRegistroFilho(registroM105); 
        
        registroM001.addRegistroFilho(registroM200);
        // TODO Registro M210 e obrigatorio ?
        // Credito de COFINS relativo ao periodo.
        registroM001.addRegistroFilho(registroM500); 
        // Detalhamento da base de calc do credito apurado no periodo - Cofins.
        registroM500.addRegistroFilho(registroM505); 
        
        registroM001.addRegistroFilho(registroM600);
        // TODO Registro M610 e obrigatorio ?
        
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
        return fornecedor;
    }
    
    private static Registro0150 criarClienteTeste() {
        Registro0150 cliente = new Registro0150();
        cliente.setCOD_PART("1");
        cliente.setBAIRRO("BAIRRO");
        cliente.setCNPJ("");
        cliente.setCPF("17898468970"); // Gerado pelo http://www.geradorcpf.com/
        cliente.setCOD_MUN("3550308");
        cliente.setCOD_PAIS("01058");
        cliente.setEND("RUA XXX");
        cliente.setNUM("99");
        cliente.setNOME("NOME PESSOA FISICA");
        return cliente;
    }
    
    private static Registro0190 criarUnidadeTeste() {
        Registro0190 unidade = new Registro0190();
        return unidade;
    }
    
    private static Registro0200 criarProdutoTeste() {
        Registro0200 produto = new Registro0200();
        return produto;
    }
    
    private static Registro0400 criarCfopTeste() {
        Registro0400 cfop = new Registro0400();
        return cfop;
    }
    
}
