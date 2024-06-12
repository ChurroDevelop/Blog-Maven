/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.ControladoraLogica;
import Logica.Rol;
import Logica.Usuarios;
import java.io.IOException;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica(); // Instanciando una nueva controladora de la logica la cual es la que tendra los metodos CRUD
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
        
        String correo = request.getParameter("correoInstitucional"); // Tomar correo que ingresa el usuario
        String contraseña = request.getParameter("contraseña"); // Tomar la contraseña que toma el usuario
        
        String regexAprendiz = "\\b[A-Za-z0-9._%+-]+@soy\\.sena\\.edu\\.co\\b"; // Expresion regular para validar el correo del aprendiz
        String regexInstructor = "\\b[A-Za-z0-9._%+-]+@misena\\.edu\\.co\\b"; // Expresion regular para validar el correo del instructor
        Pattern pAprendiz = Pattern.compile(regexAprendiz); // Compilando la expresion regular del aprendiz
        Pattern pInstructor = Pattern.compile(regexInstructor); // Compilando la expresion regular del instructor
        Matcher mAprendiz = pAprendiz.matcher(correo); // Se valida primero el correo por el regex del aprendiz
        Matcher mInstructor = pInstructor.matcher(correo); // Se valida despues por el regex del instructor
        
        Usuarios usu = new Usuarios(); // Instancia de un nuevo usuarios
        Rol aprendiz = new Rol(1, "Aprendiz");
        Rol instructor = new Rol(2, "Instructor");
        Rol visitante = new Rol(3, "Visitante");
        
        control.crearRol(aprendiz);
        control.crearRol(instructor);
        control.crearRol(visitante);
        
        LinkedList<Rol> roles = new LinkedList<Rol>();
        roles.add(aprendiz);
        roles.add(instructor);
        roles.add(visitante);
        
        try { // Manejo de errores
            if (mAprendiz.matches()) { // Si el correo coincide con las condiciones de la expresion regular del aprendiz realiza el siguiente scope de codigo
                System.out.println("Se registro el aprendiz");
                usu.setCorreoInst(correo);
                usu.setContraseña(contraseña);
                usu.setRoles(roles);
//                control.crearRol(rol);
                control.crearUsuario(usu);
                response.sendRedirect("Views/Assets/Pages/perfil.jsp"); // Reenvia al codigo de verificacion
            }
            else{
                if (mInstructor.matches()) { // Si el correo coindice con las condiciones de la expresion regular del instructor realiza el siguiente scope de codigo
                    System.out.println("Se registro el instructor");
                    usu.setCorreoInst(correo);
                    usu.setContraseña(contraseña);
                    control.crearUsuario(usu);
                    response.sendRedirect("Views/Assets/Pages/perfil.jsp"); // Reenvia al codigo de verificacion
                } else {
                    response.sendRedirect("Views/Assets/Pages/registro.jsp");
                }
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
