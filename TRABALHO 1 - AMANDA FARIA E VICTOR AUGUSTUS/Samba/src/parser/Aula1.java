/* Aula1.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. Aula1.java */
package parser;
import recovery.*;

public class Aula1/*@bgen(jjtree)*/implements Aula1TreeConstants, Aula1Constants {/*@bgen(jjtree)*/
  protected static JJTAula1State jjtree = new JJTAula1State();public static void main (String args []) throws ParseException
        {
                Aula1 parser = new Aula1 (System.in);
                while (true)
                {
                        System.out.println("Comecando a contagem: 1,2,3,4");
                        System.out.print("Toque o primeiro instrumento: ");

                        SimpleNode n = Aula1.main();
                        n.dump(" ");

                        try
                        {
                                /*switch (Aula1.main())
				{
					case 0:
					System.out.println("Samba limpo");
					break;
					case 1:
					System.out.println("Instrumentos na salinha");
					break;
					default:
					break;
				}*/
                        }
                        catch (Exception e)
                        {
                                System.out.println("Ta ficando sujo o instrumento");
                                System.out.println(e.getMessage());
                                Aula1.ReInit(System.in);
                        }
                        catch (Error e)
                        {
                                System.out.println("Para! Saiu do tempo");
                                System.out.println(e.getMessage());
                                break;
                        }
                }
        }
static public String im(int x)
  {
    int k;
        String s;
    s = tokenImage[x];
    k = s.lastIndexOf("\"");
    try {
      s = s.substring(1,k);
    }
   catch (StringIndexOutOfBoundsException e)
           {}
   return s;
  }

  static Token lastError = null;
  static boolean eof;    // variável que indica se EOF foi alcançado

  // o método abaixo consome tokens até alcançar um que pertença ao conjunto
  // de sincronização
  static void consumeUntil(RecoverySet g,
                         ParseException e,
                         String met) throws ParseEOFException,
                                            ParseException
  {
        Token tok;
        System.out.println();
        System.out.println("*** " + met + " ***");
        System.out.println("     Conjunto de sincroniza\u00c3\u00a7\u00c3\u00a3o: " + g);

        if (g == null) throw e; // se o conjunto é null, propaga a exceção

        tok = getToken(1); // pega token corrente
        while ( ! eof ) { // se não chegou ao fim do arquivo
          if ( g.contains(tok.kind)) {//achou um token no conjunto
            System.out.println("     Encontrado token de sincroniza\u00c3\u00a7\u00c3\u00a3o: " +
                               im(tok.kind));
            break;
          }
          System.out.println("     Ignorando o token: " + im(tok.kind));
          getNextToken();     // pega próximo token       
      tok = getToken(1);
          if (tok.kind == EOF && ! g.contains(EOF) ) // fim da entrada?   
              eof = true;
        }
    if ( tok != lastError)  {
          System.out.println(e.getMessage());
          lastError = tok;

        }
        if ( eof )
          throw new ParseEOFException("Encontrei EOF onde n\u00c3\u00a3o deveria.");
  }

  static final public SimpleNode main() throws ParseException {/*@bgen(jjtree) main */
 SimpleNode jjtn000 = new SimpleNode(JJTMAIN);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);RecoverySet sincronizacao = Follow.main;
    try {
      try {
        comecaprograma();
        abrebloco();
        label_1:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case INT:
          case FLOAT:
          case VARCHAR:
          case IF:
          case FOR:
          case WHILE:
          case IDENTIFICADOR:{
            ;
            break;
            }
          default:
            jj_la1[0] = jj_gen;
            break label_1;
          }
          comandos();
        }
        terminabloco();
{if ("" != null) return jjtn000;}
      } catch (ParseException e) {
consumeUntil(sincronizacao, e, "main");
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
}

  static final public void ID() throws ParseException {/*@bgen(jjtree) ID */
  SimpleNode jjtn000 = new SimpleNode(JJTID);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFICADOR);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void comecaprograma() throws ParseException {/*@bgen(jjtree) comecaprograma */
  SimpleNode jjtn000 = new SimpleNode(JJTCOMECAPROGRAMA);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(COMECAPROGRAMA);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void abrebloco() throws ParseException {/*@bgen(jjtree) abrebloco */
  SimpleNode jjtn000 = new SimpleNode(JJTABREBLOCO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ABREBLOCO);
    } finally {
if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
}

  static final public void terminabloco() throws ParseException {/*@bgen(jjtree) terminabloco */
  SimpleNode jjtn000 = new SimpleNode(JJTTERMINABLOCO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(TERMINABLOCO);
    } finally {
if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
}

  static final public void comandos() throws ParseException {/*@bgen(jjtree) comandos */
 SimpleNode jjtn000 = new SimpleNode(JJTCOMANDOS);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);RecoverySet sincronizacao = Follow.comandos;
    try {
      try {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:
        case FLOAT:
        case VARCHAR:{
          declararVariavel();
          break;
          }
        case IF:
        case FOR:
        case WHILE:{
          function();
          break;
          }
        case IDENTIFICADOR:{
          conta();
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (ParseException e) {
consumeUntil(sincronizacao, e, "comandos");
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void declararVariavel() throws ParseException {/*@bgen(jjtree) declararVariavel */
 SimpleNode jjtn000 = new SimpleNode(JJTDECLARARVARIAVEL);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);RecoverySet sincronizacao = Follow.declaravariavel;
    try {
      try {
        tipoDado();
        label_2:
        while (true) {
          ID();
          atribuicao();
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case SEPARAR:{
            separador();
            break;
            }
          default:
            jj_la1[2] = jj_gen;
            ;
          }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case IDENTIFICADOR:{
            ;
            break;
            }
          default:
            jj_la1[3] = jj_gen;
            break label_2;
          }
        }
        fiminstrucao();
      } catch (ParseException e) {
consumeUntil(sincronizacao, e, "declaravariavel");
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void separador() throws ParseException {/*@bgen(jjtree) separador */
  SimpleNode jjtn000 = new SimpleNode(JJTSEPARADOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(SEPARAR);
    } finally {
if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
}

  static final public void fiminstrucao() throws ParseException {/*@bgen(jjtree) fiminstrucao */
  SimpleNode jjtn000 = new SimpleNode(JJTFIMINSTRUCAO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(FIMINSTRUCAO);
    } finally {
if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
}

  static final public void function() throws ParseException {/*@bgen(jjtree) function */
  SimpleNode jjtn000 = new SimpleNode(JJTFUNCTION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IF:{
        ifStatement();
        break;
        }
      case FOR:{
        forStatement();
        break;
        }
      case WHILE:{
        whileStatement();
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void ifStatement() throws ParseException {/*@bgen(jjtree) ifStatement */
 SimpleNode jjtn000 = new SimpleNode(JJTIFSTATEMENT);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);RecoverySet sincronizacao = Follow.ifStatement;
    try {
      try {
        cond_if();
        expressao();
        cond_then();
        comandos();
        cond_else();
        comandos();
      } catch (ParseException e) {
consumeUntil(sincronizacao, e, "ifStatement");
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void cond_if() throws ParseException {/*@bgen(jjtree) cond_if */
  SimpleNode jjtn000 = new SimpleNode(JJTCOND_IF);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IF);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void cond_then() throws ParseException {/*@bgen(jjtree) cond_then */
  SimpleNode jjtn000 = new SimpleNode(JJTCOND_THEN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(THEN);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void cond_else() throws ParseException {/*@bgen(jjtree) cond_else */
  SimpleNode jjtn000 = new SimpleNode(JJTCOND_ELSE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ELSE);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void forStatement() throws ParseException {/*@bgen(jjtree) forStatement */
 SimpleNode jjtn000 = new SimpleNode(JJTFORSTATEMENT);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);RecoverySet sincronizacao = Follow.forStatement;
    try {
      try {
        rep_for();
        ID();
        expressao();
        rep_to();
        expressao();
        comandos();
      } catch (ParseException e) {
consumeUntil(sincronizacao, e, "forStatement");
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void rep_for() throws ParseException {/*@bgen(jjtree) rep_for */
  SimpleNode jjtn000 = new SimpleNode(JJTREP_FOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(FOR);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void rep_to() throws ParseException {/*@bgen(jjtree) rep_to */
  SimpleNode jjtn000 = new SimpleNode(JJTREP_TO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(TO);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void whileStatement() throws ParseException {/*@bgen(jjtree) whileStatement */
 SimpleNode jjtn000 = new SimpleNode(JJTWHILESTATEMENT);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);RecoverySet sincronizacao = Follow.whileStatement;
    try {
      try {
        rep_while();
        expressao();
        rep_do();
        comandos();
      } catch (ParseException e) {
consumeUntil(sincronizacao, e, "whileStatement");
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void rep_while() throws ParseException {/*@bgen(jjtree) rep_while */
  SimpleNode jjtn000 = new SimpleNode(JJTREP_WHILE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(WHILE);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void rep_do() throws ParseException {/*@bgen(jjtree) rep_do */
  SimpleNode jjtn000 = new SimpleNode(JJTREP_DO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(DO);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void tipoDado() throws ParseException {/*@bgen(jjtree) tipoDado */
  SimpleNode jjtn000 = new SimpleNode(JJTTIPODADO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:{
        tipo_int();
        break;
        }
      case FLOAT:{
        tipo_float();
        break;
        }
      case VARCHAR:{
        tipo_varchar();
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void tipo_int() throws ParseException {/*@bgen(jjtree) tipo_int */
  SimpleNode jjtn000 = new SimpleNode(JJTTIPO_INT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INT);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void tipo_float() throws ParseException {/*@bgen(jjtree) tipo_float */
  SimpleNode jjtn000 = new SimpleNode(JJTTIPO_FLOAT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(FLOAT);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void tipo_varchar() throws ParseException {/*@bgen(jjtree) tipo_varchar */
  SimpleNode jjtn000 = new SimpleNode(JJTTIPO_VARCHAR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(VARCHAR);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void atribuicao() throws ParseException {/*@bgen(jjtree) atribuicao */
  SimpleNode jjtn000 = new SimpleNode(JJTATRIBUICAO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IGUAL:{
        igual();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LETRA:{
          letra();
          break;
          }
        case DECIMAL:{
          decimal();
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void op_matematica() throws ParseException {/*@bgen(jjtree) op_matematica */
  SimpleNode jjtn000 = new SimpleNode(JJTOP_MATEMATICA);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      termo();
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SOMA:
        case SUBTRACAO:{
          ;
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          break label_3;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SOMA:{
          soma();
          break;
          }
        case SUBTRACAO:{
          subtracao();
          break;
          }
        default:
          jj_la1[9] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        termo();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void termo() throws ParseException {/*@bgen(jjtree) termo */
  SimpleNode jjtn000 = new SimpleNode(JJTTERMO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      fator();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTIPLICACAO:
        case DIVISAO:{
          ;
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          break label_4;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTIPLICACAO:{
          multiplicacao();
          break;
          }
        case DIVISAO:{
          divisao();
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        fator();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void fator() throws ParseException {/*@bgen(jjtree) fator */
  SimpleNode jjtn000 = new SimpleNode(JJTFATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DECIMAL:{
        decimal();
        break;
        }
      case IDENTIFICADOR:{
        ID();
        break;
        }
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void conta() throws ParseException {/*@bgen(jjtree) conta */
  SimpleNode jjtn000 = new SimpleNode(JJTCONTA);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ID();
      igual();
      op_matematica();
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void igual() throws ParseException {/*@bgen(jjtree) igual */
  SimpleNode jjtn000 = new SimpleNode(JJTIGUAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IGUAL);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void soma() throws ParseException {/*@bgen(jjtree) soma */
  SimpleNode jjtn000 = new SimpleNode(JJTSOMA);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(SOMA);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void subtracao() throws ParseException {/*@bgen(jjtree) subtracao */
  SimpleNode jjtn000 = new SimpleNode(JJTSUBTRACAO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(SUBTRACAO);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void multiplicacao() throws ParseException {/*@bgen(jjtree) multiplicacao */
  SimpleNode jjtn000 = new SimpleNode(JJTMULTIPLICACAO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(MULTIPLICACAO);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void divisao() throws ParseException {/*@bgen(jjtree) divisao */
  SimpleNode jjtn000 = new SimpleNode(JJTDIVISAO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(DIVISAO);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static final public void letra() throws ParseException {/*@bgen(jjtree) letra */
  SimpleNode jjtn000 = new SimpleNode(JJTLETRA);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LETRA);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void decimal() throws ParseException {/*@bgen(jjtree) decimal */
  SimpleNode jjtn000 = new SimpleNode(JJTDECIMAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(DECIMAL);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static final public void expressao() throws ParseException {/*@bgen(jjtree) expressao */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSAO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:
        case FLOAT:
        case VARCHAR:
        case IF:
        case FOR:
        case WHILE:
        case IDENTIFICADOR:{
          ;
          break;
          }
        default:
          jj_la1[13] = jj_gen;
          break label_5;
        }
        comandos();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public Aula1TokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[14];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x8052700,0x8052700,0x800,0x8000000,0x52000,0x700,0x12000000,0x100000,0x600000,0x600000,0x1800000,0x1800000,0xa000000,0x8052700,};
	}

  /** Constructor with InputStream. */
  public Aula1(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Aula1(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new Aula1TokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Aula1(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new Aula1TokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new Aula1TokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Aula1(Aula1TokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(Aula1TokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[29];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 14; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 29; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
