package br.com.apss4.prodata.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginController")
public class loginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Teste OK");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		System.out.println(login +" - "+ senha);
		
		resp.getWriter().print("<h1>Sucesso</h1>");
	}
	
}
