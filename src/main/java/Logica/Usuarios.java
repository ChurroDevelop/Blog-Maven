package Logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuarios implements Serializable {
    
    @Id
    @Column(name = "idUsuario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    @Column(nullable = false, name = "correoInst")
    private String correoInst;
    
    @Column(nullable = false, name = "contraseña")
    private String contraseña;
    
    @OneToMany(mappedBy = "usuario")
    private LinkedList<Rol> roles;

    public Usuarios() {
    }

    public Usuarios(int id, String correoInst, String contraseña, LinkedList<Rol> roles) {
        this.id = id;
        this.correoInst = correoInst;
        this.contraseña = contraseña;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreoInst() {
        return correoInst;
    }

    public void setCorreoInst(String correoInst) {
        this.correoInst = correoInst;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LinkedList<Rol> getRoles() {
        return roles;
    }

    public void setRoles(LinkedList<Rol> roles) {
        this.roles = roles;
    }
    
    

}
