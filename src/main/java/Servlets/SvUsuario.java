/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.ControladoraLogica;
import Logica.Usuarios;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Propietario
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

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
        processRequest(request, response);
        
        request.setCharacterEncoding("UTF-8");
        
        String correo = request.getParameter("correoInstitucional");
        String contraseña = request.getParameter("contraseña");
        
        String regexAprendiz = "\\b[A-Za-z0-9._%+-]+@soy\\.sena\\.edu\\.co\\b";;
        Pattern p = Pattern.compile(regexAprendiz);
        Matcher m = p.matcher(correo);
        
        Usuarios usu = new Usuarios();
        
        try {
            if (m.matches()) {  
                usu.setCorreoInst(correo);
                usu.setContraseña(contraseña);
                control.crearUsuario(usu);
                response.sendRedirect("Views/Assets/Pages/perfil.jsp");
            }
            else{
                response.sendRedirect("Views/Assets/Pages/registro.jsp");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
