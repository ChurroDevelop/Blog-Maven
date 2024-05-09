/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Usuarios;

public class ControladoraPersistencia {
    
    UsuariosJpaController usuarioJpa = new UsuariosJpaController();
    
    public void crearUsuario (Usuarios usuario){
        usuarioJpa.create(usuario);
    }    
}
