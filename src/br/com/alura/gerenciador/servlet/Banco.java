package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	//Lista estática
	private static List<Empresa> lista = new ArrayList<>();	
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {

		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		//Lista bancos
		return Banco.lista;	
	}
}
