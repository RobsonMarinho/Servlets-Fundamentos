package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi apelidoURL
//@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//Estrutura html do servlet exibida na tela
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo, parabens voce escreveu o primeiro servlets.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet OiMundoServlet foi chamado"); //Exibe no console
	}
}
