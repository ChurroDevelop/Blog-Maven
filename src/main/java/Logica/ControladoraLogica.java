package Logica;

import Persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearUsuario (Usuarios usuarios){
        controlPersistencia.crearUsuario(usuarios);
    }
    
}
