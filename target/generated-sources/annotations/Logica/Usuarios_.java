package Logica;

import Logica.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-05T16:25:41")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, String> correoInst;
    public static volatile SingularAttribute<Usuarios, Rol> rolFk;
    public static volatile SingularAttribute<Usuarios, String> contraseña;

}