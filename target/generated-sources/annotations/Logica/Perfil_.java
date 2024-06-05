package Logica;

import Logica.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-05T16:25:41")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile SingularAttribute<Perfil, String> centroFormacion;
    public static volatile SingularAttribute<Perfil, Usuarios> usuarioFk;
    public static volatile SingularAttribute<Perfil, String> apellidoUsuarios;
    public static volatile SingularAttribute<Perfil, Integer> id;
    public static volatile SingularAttribute<Perfil, String> nombreUsuario;

}