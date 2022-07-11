
package Servlets;
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

@WebServlet(name = "SvPrueba", urlPatterns = {"/SvPrueba"})
public class SvPrueba extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> listaClientes = new ArrayList<> ();
        listaClientes.add(new Cliente("1234566","Rodrigo","Romano","232323212"));
        listaClientes.add(new Cliente("122223456","Jose","Romano","2244344344"));
        listaClientes.add(new Cliente("231323322","Pablo","Romano","386512332"));
        listaClientes.add(new Cliente("142421321","Pablito","Romano","2132323"));
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaClientes",listaClientes);
        
        response.sendRedirect("MostrarJSP.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String dni = request.getParameter("dni");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String telefono = request.getParameter("telefono");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
