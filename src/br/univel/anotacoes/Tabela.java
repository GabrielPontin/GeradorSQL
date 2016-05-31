package br.univel.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Esta anota��o determina at� quando a anota��o fica presente no c�digo
//RUNTIME
//SOURCE
/*
 * FONTE ------------ BYTECODE ----------------- VM
 * SOURCE              CLASS     		       RUNTIME
 * 
 * 			COMPILA              EXECUTA
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {
	String value();
}
