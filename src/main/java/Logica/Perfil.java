package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Perfil")
public class Perfil implements Serializable {
    
    @Id
    @Column(name = "id_perfil")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    @Column(nullable = false, name = "nombreUsuario")
    private String nombreUsuario;
    
    @Column(nullable = false, name = "numDocumento")
    private String numDocumento;
    
    @Column(nullable = false, name = "apellidoUsuario")
    private String apellidoUsuarios;
    
    @Column(nullable = false, name = "centroFormacion")
    private String centroFormacion;
    
    @OneToOne
    Usuarios usuarioFk;

    public Perfil() {
    }

    public Perfil(int id, String nombreUsuario, String numDocumento, String apellidoUsuarios, String centroFormacion, Usuarios usuarioFk) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.numDocumento = numDocumento;
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

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    
}
