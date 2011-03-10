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
 * Gera o arquivo EFD-PIS/Cofins com a minima estrutura necessaria
 * para passar no validador versao 1.0.0 Beta.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (10/03/2011 12:56)
 */
public class Main {

    public static void main(String[] args) throws Exception {

        GeradorDoArquivoEfdPisCofins gerador 
                = new GeradorDoArquivoEfdPisCofins();
        
        gerador.addRegistro(new Registro0000());
        gerador.addRegistro(new Registro0001());
        gerador.addRegistro(new Registro0110());
        gerador.addRegistro(new Registro0140());
        gerador.addRegistro(new Registro0990());

        gerador.addRegistro(new RegistroA001());
        gerador.addRegistro(new RegistroA990());
        
        gerador.addRegistro(new RegistroC001());
        gerador.addRegistro(new RegistroC990());

        gerador.addRegistro(new RegistroD001());
        gerador.addRegistro(new RegistroD990());
        
        gerador.addRegistro(new RegistroF001());
        gerador.addRegistro(new RegistroF990());
        
        gerador.addRegistro(new RegistroM001());
        gerador.addRegistro(new RegistroM200());
        gerador.addRegistro(new RegistroM600());
        gerador.addRegistro(new RegistroM990());
        
        gerador.addRegistro(new Registro1001());
        gerador.addRegistro(new Registro1990());

        gerador.addRegistro(new Registro9001());
        gerador.addRegistro(new Registro9990());
        
        gerador.gerar("c:/teste_efd_pis_cofins.txt");

    }
    
}
