package ono.leo.erp.efd.pis_cofins;

import ono.leo.erp.efd.pis_cofins.bloco0.Registro0150;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0190;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0200;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0400;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC010;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC100;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC170;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM100;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM105;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM500;
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM505;

/**
 * Gera um arquivo EFD-PIS/Cofins de exemplo simples que pelo menos
 * passa no validador PVA versao 1.0.0 Beta.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (10/03/2011 12:56)
 */
public class Main {

    public static void main(String[] args) throws Exception {

        GeradorDoArquivoEfdPisCofins geradorDoArquivo 
                = new GeradorDoArquivoEfdPisCofins();
        
        geradorDoArquivo.addRegistro(criarClienteTeste()); // Registro0150 Cliente
        geradorDoArquivo.addRegistro(criarFornecedorTeste()); // Registro0150 Fornecedor
        geradorDoArquivo.addRegistro(criarUnidadeTeste()); // Registro0190 Unidade
        geradorDoArquivo.addRegistro(criarProdutoTeste()); // Registro0200 Produto
        geradorDoArquivo.addRegistro(criarCfopTeste()); // Registro0400 CFOP
        
        geradorDoArquivo.addRegistro(new RegistroC010()); // Identificacao do estabelecimento
        geradorDoArquivo.addRegistro(new RegistroC100()); // Cabecalho da NFe
        geradorDoArquivo.addRegistro(new RegistroC170()); // Item da NFe
        
        geradorDoArquivo.addRegistro(new RegistroM100()); // Credito de PIS/PASEP relativo ao periodo.
        geradorDoArquivo.addRegistro(new RegistroM105()); // Detalhamento da base de calculo do credito apurado no periodo PIS/PASEP.
        geradorDoArquivo.addRegistro(new RegistroM500()); // Credito de COFINS relativo ao periodo.
        geradorDoArquivo.addRegistro(new RegistroM505()); // Detalhamento da base de calculo do credito apurado no periodo - Cofins.
        
        geradorDoArquivo.gerar("c:/teste_efd_pis_cofins.txt");

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
