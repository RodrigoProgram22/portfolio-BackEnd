
package Servlets;

import Class.Auto;
import Class.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvAutos", urlPatterns = {"/SvAutos"})
public class SvAutos extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }
    List<Auto> listaAutos = new ArrayList<> ();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession misession = request.getSession();
        misession.setAttribute("listaAutos",listaAutos);
        response.sendRedirect("mostrarAutos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String placa = request.getParameter("placa");
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String color = request.getParameter("color");
        String tipo_motor = request.getParameter("tipo_motor");
        listaAutos.add(new Auto(placa,marca,modelo,color,tipo_motor));
        
        response.sendRedirect("autos.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
