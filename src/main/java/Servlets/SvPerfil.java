/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.ControladoraLogica;
import Logica.Perfil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Propietario
 */
@WebServlet(name = "SvPerfil", urlPatterns = {"/SvPerfil"})
public class SvPerfil extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String numDocumento = request.getParameter("numDocumento");
        String centro = request.getParameter("centroFormacion");
        
        Perfil per = new Perfil();
        per.setNombreUsuario(nombre);
        per.setApellidoUsuarios(apellido);
        per.setCentroFormacion(centro);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
