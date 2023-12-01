package recovery;

import parser.*;

public class Follow {

    static public final RecoverySet main = new RecoverySet();
    static public final RecoverySet comecaprograma = new RecoverySet();
    static public final RecoverySet abrebloco = new RecoverySet();
    static public final RecoverySet comandos = new RecoverySet();
    static public final RecoverySet declaravariavel = new RecoverySet();
    static public final RecoverySet tipodado = new RecoverySet();
    static public final RecoverySet id = new RecoverySet();
    static public final RecoverySet atribuicao = new RecoverySet();
    static public final RecoverySet separador = new RecoverySet();
    static public final RecoverySet cond_if = abrebloco;
    static public final RecoverySet cond_if2 = comandos;
    static public final RecoverySet expressao = new RecoverySet();
    static public final RecoverySet cond_then = abrebloco;
    static public final RecoverySet cond_then2 = comandos;
    static public final RecoverySet comandos3 = new RecoverySet();
    static public final RecoverySet cond_else = abrebloco;
    static public final RecoverySet cond_else2 = comandos;
    static public final RecoverySet rep_for = tipodado;
    static public final RecoverySet id2 = abrebloco;
    static public final RecoverySet id3 = comandos;
    static public final RecoverySet expressao2 = new RecoverySet();
    static public final RecoverySet rep_to = abrebloco;
    static public final RecoverySet rep_to2 = comandos;
    static public final RecoverySet rep_while = abrebloco;
    static public final RecoverySet rep_while2 = comandos;
    static public final RecoverySet expressao3 = new RecoverySet();
    static public final RecoverySet rep_do = abrebloco;
    static public final RecoverySet rep_do2 = comandos;
    static public final RecoverySet igual = new RecoverySet();
    static public final RecoverySet ifStatement = new RecoverySet();
    static public final RecoverySet forStatement = new RecoverySet();
    static public final RecoverySet whileStatement = new RecoverySet();

    static {
    	main.add(new Integer(Aula1Constants.EOF));
    	comecaprograma.add(new Integer(Aula1Constants.ABREBLOCO));
    	abrebloco.add(new Integer(Aula1Constants.INT));
    	abrebloco.add(new Integer(Aula1Constants.FLOAT));
    	abrebloco.add(new Integer(Aula1Constants.VARCHAR));
    	comandos.add(new Integer(Aula1Constants.INT));
    	comandos.add(new Integer(Aula1Constants.FLOAT));
    	comandos.add(new Integer(Aula1Constants.VARCHAR));
    	comandos.add(new Integer(Aula1Constants.TERMINABLOCO));
    	comandos.add(new Integer(Aula1Constants.IF));
    	comandos.add(new Integer(Aula1Constants.FOR));
    	comandos.add(new Integer(Aula1Constants.WHILE));
    	comandos.add(new Integer(Aula1Constants.IDENTIFICADOR));
    	comandos.add(new Integer(Aula1Constants.IGUAL));
    	comandos.add(new Integer(Aula1Constants.DECIMAL));
    	comandos.add(new Integer(Aula1Constants.SOMA));
    	comandos.add(new Integer(Aula1Constants.SUBTRACAO));
    	comandos.add(new Integer(Aula1Constants.MULTIPLICACAO));
    	comandos.add(new Integer(Aula1Constants.DIVISAO));
    	tipodado.add(new Integer(Aula1Constants.IDENTIFICADOR));
    	atribuicao.add(new Integer(Aula1Constants.SEPARAR));
    	id.add(new Integer(Aula1Constants.IGUAL));
    	separador.add(new Integer(Aula1Constants.FIMINSTRUCAO));
    	expressao.add(new Integer(Aula1Constants.THEN));
    	comandos.add(new Integer(Aula1Constants.ELSE));
    	expressao2.add(new Integer(Aula1Constants.TO));
    	expressao3.add(new Integer(Aula1Constants.DO));
    	igual.add(new Integer(Aula1Constants.LETRA));
    	igual.add(new Integer(Aula1Constants.DECIMAL));
    	declaravariavel.add(new Integer(Aula1Constants.IDENTIFICADOR));
    	declaravariavel.add(new Integer(Aula1Constants.SEPARAR));
    	declaravariavel.add(new Integer(Aula1Constants.FIMINSTRUCAO));
    	ifStatement.add(new Integer(Aula1Constants.IF));
    	ifStatement.add(new Integer(Aula1Constants.THEN));
    	ifStatement.add(new Integer(Aula1Constants.ELSE));
    	forStatement.add(new Integer(Aula1Constants.FOR));
    	forStatement.add(new Integer(Aula1Constants.IDENTIFICADOR));
    	forStatement.add(new Integer(Aula1Constants.TO));
    	forStatement.add(new Integer(Aula1Constants.FOR));
    	whileStatement.add(new Integer(Aula1Constants.WHILE));
    	whileStatement.add(new Integer(Aula1Constants.DO));
    }
}
