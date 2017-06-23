package Servlet;

import cl.negocio.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Usuario user = new Usuario();
            HttpSession sesion = request.getSession();
            if (request.getParameter("accion").equals("Ingresar")) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                user.setUsername(username);
                user.setPassword(password);
                if (user.validar() == 1) {
                    System.out.println("USUARIO VALIDO");
                    sesion.setAttribute("conectado", "true");
                    response.sendRedirect("Inicio.jsp");
                } else {
                    System.out.println("USUARIO INVALIDO");
                    sesion.setAttribute("conectado", "false");
                    response.sendRedirect("index.jsp");
                }
            } else if (request.getParameter("accion").equals("Registrar")) {                 
                String name = request.getParameter("name");
                String apepat = request.getParameter("apepat");
                String apemat = request.getParameter("apemat");
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                user.setName(name);
                user.setApepat(apepat);
                user.setApemat(apemat);
                user.setUsername(username);
                user.setPassword(password);
                user.save();
                response.sendRedirect("index.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
