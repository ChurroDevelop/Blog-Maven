package Logica;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Perfil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    @Column(nullable = false)
    private String nombreUsuario, apellidoUsuarios, centroFormacion;
    
    @OneToOne
    Usuarios usuarioFk;

    public Perfil() {
    }

    public Perfil(int id, String nombreUsuario, String apellidoUsuarios, String centroFormacion, Usuarios usuarioFk) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuarios = apellidoUsuarios;
        this.centroFormacion = centroFormacion;
        this.usuarioFk = usuarioFk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuarios() {
        return apellidoUsuarios;
    }

    public void setApellidoUsuarios(String apellidoUsuarios) {
        this.apellidoUsuarios = apellidoUsuarios;
    }

    public String getCentroFormacion() {
        return centroFormacion;
    }

    public void setCentroFormacion(String centroFormacion) {
        this.centroFormacion = centroFormacion;
    }

    public Usuarios getUsuarioFk() {
        return usuarioFk;
    }

    public void setUsuarioFk(Usuarios usuarioFk) {
        this.usuarioFk = usuarioFk;
    }
    
    
    
}
