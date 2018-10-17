package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	//Lista estática
	private static List<Empresa> lista = new ArrayList<>();	
	private static Integer chaveSequencial = 1;	//Simula uma chave sequencial do banco de dados
	
	static { 
		//Empresa 01
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("alura");
		//Empresa 02
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		//Lista bancos
		return Banco.lista;	
	}
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			//Se o id da empresa for igual ao do parametro, remove!
			if(emp.getId() == id) {
				 it.remove();
			}
		}
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				 lista.remove(empresa);
			}
	     }	
      }
}
