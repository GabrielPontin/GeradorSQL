//1� Descobrir classe do Obj
//2� Ler o anotation e pegar e ver os atributos (se tiver anotation)
//3� Ler os atributos
//4� Gerar sql automatico

package br.univel;

import br.univel.anotacoes.Tabela;
import br.univel.enums.EstadoCivil;
import br.univel.enums.Uf;

public class lerAnotacao {
	
	public lerAnotacao(Object obj){
		
		Class<?> cl = obj.getClass();//Pega a classe
		
		if(cl.isAnnotationPresent(Tabela.class)){//Verifica se cl tem a anota��o Tabela presente
			Tabela t = cl.getAnnotation(Tabela.class);//Pega a anota��o
			System.out.println(t);
		}else{
			System.out.println("Opa n�o tem anota��o em!");
		}
	}
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setId(1);
		//p.getUf(Uf.SC);
		p.setNome("Matheus Vieira");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		
		new lerAnotacao(p);
		
	}
}
