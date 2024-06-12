/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Perfil;
import Logica.Rol;
import Logica.Usuarios;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    UsuariosJpaController usuarioJpa = new UsuariosJpaController(); // Instancia para el crud del jpa
    RolJpaController rolesJpa = new RolJpaController(); // Instancia para el crud del jpa
    
    // Metodos para los usuarios
    
    // Metodo de crear usuario
    public void crearUsuario (Usuarios usuario){
        usuarioJpa.create(usuario);
    }
    
    // Metodo de eliminar usuario
    public void eliminarUsuario (int id){
        try {
            usuarioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Metodo para editar el usuari
    public void editarUsuario (Usuarios usuarios){
        try {
            usuarioJpa.edit(usuarios);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // ----------------------------------------------------------------------

    // Metodos para los roles
    
    // Metodo para crear nuevo rol
    public void crearRol(Rol rol) {
        rolesJpa.create(rol);
    }

    // Metodo para eliminar el rol
    public void eliminarRol(int id){
        try {
            rolesJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Metodo para editar el rol
    public void editarRol(Rol rol){
        try {
            rolesJpa.edit(rol);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // ------------------------------------
    
    // Metodos para el perfil
    
    // Metodo para crear el perfil 

    public void crearPerfil(Perfil per) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void eliminarPerfil(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void editarPerfil(Perfil per) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
