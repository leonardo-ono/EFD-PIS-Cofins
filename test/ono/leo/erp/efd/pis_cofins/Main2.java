package ono.leo.erp.efd.pis_cofins;

import ono.leo.erp.efd.pis_cofins.bloco0.Registro0000;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0001;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0110;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0140;
import ono.leo.erp.efd.pis_cofins.bloco0.Registro0990;
import ono.leo.erp.efd.pis_cofins.bloco1.Registro1001;
import ono.leo.erp.efd.pis_cofins.bloco1.Registro1990;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9001;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9990;
import ono.leo.erp.efd.pis_cofins.bloco9.Registro9999;
import ono.leo.erp.efd.pis_cofins.blocoA.RegistroA001;
import ono.leo.erp.efd.pis_cofins.blocoA.RegistroA990;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC001;
import ono.leo.erp.efd.pis_cofins.blocoC.RegistroC010;
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
 * Tutorial passo-a-passo de como utilizar este projeto para
 * geracao do arquivo EFD-PIS/Cofins.
 * 
 * Ao executar, o codigo desta classe ira gerar um arquivo EFD-PIS/Cofins 
 * de exemplo simples que pelo menos passa no validador PVA versao 1.0.0 Beta.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (11/05/2011 11:39)
 */
public class Main2 {
    
    public static void main(String[] args) throws Exception {

        /**
         * Crie um novo objeto RegistroRoot.
         */
        RegistroRoot registroRoot = new RegistroRoot();

        /**
         * Ao instanciar um novo RegistroRoot, os registros de nivel 0,
         * ou seja, os registros 0000 e 9999 tambem ja sao criados e 
         * adicionados automaticamentee podendo ser acessados através 
         * dos metodos getters, conforme codigo abaixo:
         */ 
        Registro0000 registro0000 = registroRoot.getRegistro0000();
        Registro9999 registro9999 = registroRoot.getRegistro9999();
        
        /**
         * Ao instanciar um novo RegistroRoot, os registros de nivel 1,
         * ou seja, os registros de abertura e encerramento de bloco
         * tambem ja sao criados e adicionados automaticamente 
         * no registro 0000 e podem ser acessados através dos 
         * metodos getters, conforme codigo abaixo:
         */ 
        
        // Metodos getters para os registro de abertura de bloco
        Registro0001 registro0001 = registro0000.getRegistro0001();
        RegistroA001 registroA001 = registro0000.getRegistroA001();
        RegistroC001 registroC001 = registro0000.getRegistroC001();
        RegistroD001 registroD001 = registro0000.getRegistroD001();
        RegistroF001 registroF001 = registro0000.getRegistroF001();
        RegistroM001 registroM001 = registro0000.getRegistroM001();
        Registro1001 registro1001 = registro0000.getRegistro1001();
        Registro9001 registro9001 = registro0000.getRegistro9001();
        
        // Metodos getters para os registro de encerramento de bloco
        Registro0990 registro0990 = registro0000.getRegistro0990();
        RegistroA990 registroA990 = registro0000.getRegistroA990();
        RegistroC990 registroC990 = registro0000.getRegistroC990();
        RegistroD990 registroD990 = registro0000.getRegistroD990();
        RegistroF990 registroF990 = registro0000.getRegistroF990();
        RegistroM990 registroM990 = registro0000.getRegistroM990();
        Registro1990 registro1990 = registro0000.getRegistro1990();
        Registro9990 registro9990 = registro0000.getRegistro9990();
        
        /**
         * Apartir disso, os demais registros de nivel maior ou igual a 2
         * devem ser criados e adicionados manualmente no seu respectivo
         * registro PAI.
         * 
         * Exemplo: o codigo abaixo cria o registro 0110 (regime de apuracao)
         *          e adiciona ao registro 0001 (que e o registro PAI de 0110).
         */ 
        Registro0110 registro0110 = new Registro0110();
        registro0001.addRegistroFilho(registro0110);
        
        /**
         * o codigo abaixo cria o registro 0140 (tabela de cadastro de 
         * estabelecimento) e adiciona ao registro 0001 (que e o registro
         * PAI de 0140).
         */ 
        Registro0140 registro0140 = new Registro0140();
        registro0001.addRegistroFilho(registro0140);
        
        /**
         * o codigo abaixo cria o registro C010 (identificacao do 
         * estabelecimento) e adiciona ao registro C001 (que e o registro
         * PAI de C010).
         */ 
        RegistroC010 registroC010 = new RegistroC010();
        registroC010.setCNPJ("22222222000191");
        registroC010.setIND_ESCRI("2");
        
        registroC001.addRegistroFilho(registroC010); 
        
        /**
         * o codigo abaixo cria o registro M200 (consolidacao da contribuicao
         * PIS/PASEP do periodo) e adiciona ao registro M001 (que e o registro
         * PAI de M200).
         */ 
        RegistroM200 registroM200 = new RegistroM200();
        registroM001.addRegistroFilho(registroM200); 
        
        /**
         * o codigo abaixo cria o registro M600 (consolidacao da contribuicao
         * Cofins do periodo) e adiciona ao registro M001 (que e o registro
         * PAI de M600).
         */ 
        RegistroM600 registroM600 = new RegistroM600();
        registroM001.addRegistroFilho(registroM600); 
        
        /**
         * Depois que todos os registros de seu interesse foram
         * adicionados, basta utilizar o metodo gerar() da classe RegistroRoot
         * conforme codigo abaixo:
         */ 
        registroRoot.gerar("c:/teste_efd_pis_cofins.txt");
        
    }

}
