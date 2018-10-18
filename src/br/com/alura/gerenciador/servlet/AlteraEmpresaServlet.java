package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Alterando empresa");

		// Lê o parâmetro nome
		String nomeEmpresa = request.getParameter("nome");
		// Lê o parâmetro data
		String paramDataEmpresa = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		// Inicialização da variável
		Date dataAbertura = null;
		try {// Envia a data para o formulário
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		response.sendRedirect("listaEmpresas");
	}
}
