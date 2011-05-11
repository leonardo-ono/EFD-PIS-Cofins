package ono.leo.erp.efd.pis_cofins.bloco0;

import ono.leo.erp.efd.pis_cofins.Registro;
import ono.leo.erp.efd.pis_cofins.Registro.Obrigatoriedade;
import ono.leo.erp.efd.pis_cofins.RegistroX001;
import ono.leo.erp.efd.pis_cofins.RegistroX990;
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
import ono.leo.erp.efd.pis_cofins.blocoM.RegistroM990;

/**
 * Registro 0000. 
 * Abertura do arquivo digital e identificacao da pessoa juridica.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 * @since 1.00.00 (22/02/2011 14:56)
 */
public class Registro0000 extends Registro {
    
    private String COD_VER = "002";
    private String TIPO_ESCRIT = "0";
    private String IND_SIT_ESP = "";
    private String NUM_REC_ANTERIOR = "";
    private String DT_INI = "01012011";
    private String DT_FIN = "31012011";
    private String NOME = "EMPRESA";
    private String CNPJ = "22222222000191";
    private String UF = "SP";
    private String COD_MUN = "3513801";
    private String SUFRAMA = "";
    private String IND_NAT_PJ = "00";
    private String IND_ATIV = "0";
    
    // -- Registros de abertura e encerramento de bloco --
    
    // Bloco 0
    private Registro0001 registro0001 = new Registro0001();
    private Registro0990 registro0990 = new Registro0990();

    // Bloco A
    private RegistroA001 registroA001 = new RegistroA001();
    private RegistroA990 registroA990 = new RegistroA990();

    // Bloco C
    private RegistroC001 registroC001 = new RegistroC001();
    private RegistroC990 registroC990 = new RegistroC990();

    // Bloco D
    private RegistroD001 registroD001 = new RegistroD001();
    private RegistroD990 registroD990 = new RegistroD990();

    // Bloco F
    private RegistroF001 registroF001 = new RegistroF001();
    private RegistroF990 registroF990 = new RegistroF990();

    // Bloco M
    private RegistroM001 registroM001 = new RegistroM001();
    private RegistroM990 registroM990 = new RegistroM990();

    // Bloco 1
    private Registro1001 registro1001 = new Registro1001();
    private Registro1990 registro1990 = new Registro1990();

    // Bloco 9
    private Registro9001 registro9001 = Registro.getRegistro9001Static();
    private Registro9990 registro9990 = new Registro9990();    

    public Registro0000() {
        REG = "0000";
        REG_PAI = "ROOT";
        nivel = 0;
        ocorrencia = Ocorrencia.UM;
        obrigatoriedade = Obrigatoriedade.O;
        adicionarTodosRegistrosDeAberturaEncerramentoDeBloco();
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCOD_MUN() {
        return COD_MUN;
    }

    public void setCOD_MUN(String COD_MUN) {
        this.COD_MUN = COD_MUN;
    }

    public String getCOD_VER() {
        return COD_VER;
    }

    public void setCOD_VER(String COD_VER) {
        this.COD_VER = COD_VER;
    }

    public String getDT_FIN() {
        return DT_FIN;
    }

    public void setDT_FIN(String DT_FIN) {
        this.DT_FIN = DT_FIN;
    }

    public String getDT_INI() {
        return DT_INI;
    }

    public void setDT_INI(String DT_INI) {
        this.DT_INI = DT_INI;
    }

    public String getIND_ATIV() {
        return IND_ATIV;
    }

    public void setIND_ATIV(String IND_ATIV) {
        this.IND_ATIV = IND_ATIV;
    }

    public String getIND_NAT_PJ() {
        return IND_NAT_PJ;
    }

    public void setIND_NAT_PJ(String IND_NAT_PJ) {
        this.IND_NAT_PJ = IND_NAT_PJ;
    }

    public String getIND_SIT_ESP() {
        return IND_SIT_ESP;
    }

    public void setIND_SIT_ESP(String IND_SIT_ESP) {
        this.IND_SIT_ESP = IND_SIT_ESP;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getNUM_REC_ANTERIOR() {
        return NUM_REC_ANTERIOR;
    }

    public void setNUM_REC_ANTERIOR(String NUM_REC_ANTERIOR) {
        this.NUM_REC_ANTERIOR = NUM_REC_ANTERIOR;
    }

    public String getSUFRAMA() {
        return SUFRAMA;
    }

    public void setSUFRAMA(String SUFRAMA) {
        this.SUFRAMA = SUFRAMA;
    }

    public String getTIPO_ESCRIT() {
        return TIPO_ESCRIT;
    }

    public void setTIPO_ESCRIT(String TIPO_ESCRIT) {
        this.TIPO_ESCRIT = TIPO_ESCRIT;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    // -- Registros de abertura e encerramento de bloco --

    public Registro0001 getRegistro0001() {
        return registro0001;
    }

    public Registro0990 getRegistro0990() {
        return registro0990;
    }

    public Registro1001 getRegistro1001() {
        return registro1001;
    }

    public Registro1990 getRegistro1990() {
        return registro1990;
    }

    public Registro9001 getRegistro9001() {
        return registro9001;
    }

    public Registro9990 getRegistro9990() {
        return registro9990;
    }

    public RegistroA001 getRegistroA001() {
        return registroA001;
    }

    public RegistroA990 getRegistroA990() {
        return registroA990;
    }

    public RegistroC001 getRegistroC001() {
        return registroC001;
    }

    public RegistroC990 getRegistroC990() {
        return registroC990;
    }

    public RegistroD001 getRegistroD001() {
        return registroD001;
    }

    public RegistroD990 getRegistroD990() {
        return registroD990;
    }

    public RegistroF001 getRegistroF001() {
        return registroF001;
    }

    public RegistroF990 getRegistroF990() {
        return registroF990;
    }

    public RegistroM001 getRegistroM001() {
        return registroM001;
    }

    public RegistroM990 getRegistroM990() {
        return registroM990;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "";
        linha += "|" + REG;
        linha += "|" + COD_VER;
        linha += "|" + TIPO_ESCRIT;
        linha += "|" + IND_SIT_ESP;
        linha += "|" + NUM_REC_ANTERIOR;
        linha += "|" + DT_INI;
        linha += "|" + DT_FIN;
        linha += "|" + NOME;
        linha += "|" + CNPJ;
        linha += "|" + UF;
        linha += "|" + COD_MUN;
        linha += "|" + SUFRAMA;
        linha += "|" + IND_NAT_PJ;
        linha += "|" + IND_ATIV ;
        linha += "|" + (char) 13 + (char) 10;
        linha += super.gerarLinha();
        return linha;
    }

    @Override
    public void addRegistroFilho(Registro registro) {
        if (registro instanceof RegistroX001 
                || registro instanceof RegistroX990) {
            
            throw new RuntimeException("Nao e permitido adicionar "
                    + "registros de abertura ou encerramento no "
                    + "registro 0000 !\nEsses registros serao criados "
                    + "e adicionados automaticamente !");
        }
        super.addRegistroFilho(registro);
    }
    
    private void adicionarTodosRegistrosDeAberturaEncerramentoDeBloco() {
        // Bloco 0
        super.addRegistroFilho(registro0001);
        super.addRegistroFilho(registro0990);
        // Bloco A
        super.addRegistroFilho(registroA001);
        super.addRegistroFilho(registroA990);
        // Bloco C
        super.addRegistroFilho(registroC001);
        super.addRegistroFilho(registroC990);
        // Bloco D
        super.addRegistroFilho(registroD001);
        super.addRegistroFilho(registroD990);
        // Bloco F
        super.addRegistroFilho(registroF001);
        super.addRegistroFilho(registroF990);
        // Bloco M
        super.addRegistroFilho(registroM001);
        super.addRegistroFilho(registroM990);
        // Bloco 1
        super.addRegistroFilho(registro1001);
        super.addRegistroFilho(registro1990);
        // Bloco 9
        super.addRegistroFilho(registro9001);
        super.addRegistroFilho(registro9990);
    }
    
    public void atualizarQuantidadeNosRegistrosDeEncerramentoDeBloco() {
        // Registro0000 + Registro0001 + demais registros
        registro0990.setQTD_LIN(
                registro0001.getQuantidadeTotalDeRegistros() + 2 + ""); 
        
        registroA990.setQTD_LIN(
                registroA001.getQuantidadeTotalDeRegistros() + 1 + "");
        
        registroC990.setQTD_LIN(
                registroC001.getQuantidadeTotalDeRegistros() + 1 + "");
        
        registroD990.setQTD_LIN(
                registroD001.getQuantidadeTotalDeRegistros() + 1 + "");
        
        registroF990.setQTD_LIN(
                registroF001.getQuantidadeTotalDeRegistros() + 1 + "");
        
        registroM990.setQTD_LIN(
                registroM001.getQuantidadeTotalDeRegistros() + 1 + "");
        
        registro1990.setQTD_LIN(
                registro1001.getQuantidadeTotalDeRegistros() + 1 + "");
        
        // Registro9999 + Registro9001 + demais registros
        registro9990.setQTD_LIN(
                registro9001.getQuantidadeTotalDeRegistros() + 2 + ""); 
    }
    
}
