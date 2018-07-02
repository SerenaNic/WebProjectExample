package it.unirc.campo_coni;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unirc.campo_coni.util.BorderoBean;
import it.unirc.campo_coni.util.JDBCDAO;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ivr = request.getParameter("ivrCode");
		int periodo = Integer.parseInt(request.getParameter("periodo"));
		String ivrOld = request.getParameter("ivrCodeOld");
		int periodoOld = Integer.parseInt(request.getParameter("periodoOld"));

		int res = JDBCDAO.updateBordero( ivr,  periodo, ivrOld,  periodoOld);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UpdateResult.jsp");
		
		request.setAttribute("result", res);
		dispatcher.forward(request,  response);

	}


}
