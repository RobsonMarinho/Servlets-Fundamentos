package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * Servlet implementation class NovaEmpresaServlet
 */

@WebServlet("/novaEmpresa")	//Chamada na URL
public class NovaEmpresaServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");	//L� o par�metro nome
		String paramDataEmpresa = request.getParameter("data");	//L� o par�metro data
		
		Date dataAbertura = null;	//Inicializa��o da vari�vel
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	//Envia a data para o formul�rio
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);		
		} 
		
		
		Empresa empresa = new Empresa();	//Inst�ncia um objeto empresa
		empresa.setNome(nomeEmpresa);	//Exibe o nome da empresa
		empresa.setDataAbertura(dataAbertura);	//Exibe a data de abertura
	    
		Banco banco = new Banco();	//Inst�ncia um objeto banco
		banco.adiciona(empresa);	//Adiciona a empresa no banco!
	
		//chama o JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response);
	}

}