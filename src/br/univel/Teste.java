package br.univel;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Teste {
	
	public Teste(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		int cont = 0, x = 0;
		Class<?> cl = obj.getClass();//Pega a classe
		
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(cl.getSimpleName()).append(" (");
		Field[] vetorFields = cl.getDeclaredFields();
		
		int qtdFields = vetorFields.length;
		
		for(int i = 0; i < qtdFields; i++){//Varre a classe procurando os campos
			Field field = vetorFields[i];
			if(i < qtdFields - 1)
				sb.append(field.getName()).append(", ");
			else
				sb.append(field.getName());
			cont++;
		}
		
		sb.append(") VALUES (");
		
		for(int i = 0; i < qtdFields; i++){//Varre a classe procurando os campos
			Field field = vetorFields[i];
			if(i < qtdFields - 1)
				sb.append("?").append(", ");
			else
				sb.append("?");
			x++;
		}
		
		sb.append(");");
		
		String sql = sb.toString();
		
		System.out.println(sql);
		
		/*for(Method m : cl.getDeclaredMethods()){
			if(m.getName().startsWith("get")){
				Object dado = m.invoke(obj, null);
				System.out.println(dado);
			}
		}*/
		 
	}
	
	public static void main(String[] args){
		
		Pessoa p = new Pessoa();
		
		p.setId(1);
		p.setNome("Matheus");
		                                                                                                                                                                                                                                                                                                                                                  
		try {
			new Teste(p);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
