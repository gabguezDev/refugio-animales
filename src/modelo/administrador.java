package modelo;

import java.util.Set;

public class administrador extends persona {
    private String usuario;
    private String clave; 


    //administador tiene una lista de historial
    //@OneToMany
    private Set<historial> historial;

}
