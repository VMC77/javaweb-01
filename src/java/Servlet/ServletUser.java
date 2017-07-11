package Servlet;

import cl.negocio.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Usuario user = new Usuario();
            if (request.getParameter("del") == null) {
                if (request.getParameter("accion").equals("registrar")) {
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
                    response.sendRedirect("usuarios/index.jsp");
                } else if (request.getParameter("accion").equals("actualizar")) {
                    String id = request.getParameter("id");
                    String name = request.getParameter("name");
                    String apepat = request.getParameter("apepat");
                    String apemat = request.getParameter("apemat");
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    user.setId(id);
                    user.setName(name);
                    user.setApepat(apepat);
                    user.setApemat(apemat);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.update();
                    response.sendRedirect("usuarios/index.jsp");
                }
            } else {
                String id = request.getParameter("del");
                user.setId(id);
                user.delete();
                out.println("Ha sido Eliminado <a href='usuarios/index.jsp'>Volver</a>");
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
