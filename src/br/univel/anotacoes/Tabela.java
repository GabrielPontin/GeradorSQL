package br.univel.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Esta anotação determina até quando a anotação fica presente no código
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
