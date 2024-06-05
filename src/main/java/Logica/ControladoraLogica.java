package Logica;

import Persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    // Metodos para los usuarios en la base de datos
    public void crearUsuario (Usuarios usuarios){
        controlPersistencia.crearUsuario(usuarios);
    }
    
}
