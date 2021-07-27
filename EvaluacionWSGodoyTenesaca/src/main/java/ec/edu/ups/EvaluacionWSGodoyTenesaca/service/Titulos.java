package ec.edu.ups.EvaluacionWSGodoyTenesaca.service;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.EvaluacionWSGodoyTenesaca.business.EstudianteON;
import ec.edu.ups.EvaluacionWSGodoyTenesaca.business.TituloON;
import ec.edu.ups.EvaluacionWSGodoyTenesaca.modelo.Titulo;

/**
 * Servlet implementation class Titulos
 */
@WebServlet("/Titulos")
public class Titulos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Inject
	private EstudianteON estudianteON;
	@Inject
	private TituloON tituloON;
	
	
    public Titulos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		//Crear Titulo
		Titulo t=new Titulo();
		t.setCodigo(1);
		t.setEstado("INGRESADO");
		t.setTitulo("Ingeniero en Informática");
		tituloON.insertarTitulo(t);
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
