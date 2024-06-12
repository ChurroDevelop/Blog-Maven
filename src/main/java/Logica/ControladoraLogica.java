package Logica;

import Persistencia.ControladoraPersistencia;
import Persistencia.exceptions.NonexistentEntityException;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    // Metodos para los usuarios en la base de datos
    
    // Metodo para crear un nuevo usuario
    public void crearUsuario (Usuarios usuarios){
        controlPersistencia.crearUsuario(usuarios);
    }
    
    // Metodo para eliminar un usuario por su id
    public void eliminarUsuario (int id) throws NonexistentEntityException{
        controlPersistencia.eliminarUsuario(id);
    }
    
    // Metodo para editar un usuario
    public void editarUsuario (Usuarios usuarios) throws Exception{
        controlPersistencia.editarUsuario(usuarios);
    }
    // ---------------------------------------------------------------------
    
    // Metodos para los roles
    
    // Metodo para crear un nuevo rol
    public void crearRol (Rol rol){
        controlPersistencia.crearRol(rol);
    }
    
    // Metodo para eliminar el rol
    public void elminarRol (int id){
        controlPersistencia.eliminarRol(id);
    }
    
    // Metodo para editar el rol
    public void editarRol (Rol rol){
        controlPersistencia.editarRol(rol);
    }
    // ---------------------------------------------------------------------
    
    // Metodos para el perfil
    
    // Metodo para crear el perfil
    public void crearPerfil (Perfil per){
        controlPersistencia.crearPerfil(per);
    }
    
    // Metodo para eliminar el perfil
    public void eliminarPerfil (int id){
        controlPersistencia.eliminarPerfil(id);
    }
    
    // Metodo para editar el Perfil
    public void editarPerfil (Perfil per){
        controlPersistencia.editarPerfil(per);
    }
}
