package modelo;

import java.util.Set;

public class evento {
    private Long id;
    private String nombre;

    //evento tiene una lista de historiales
    //@OneToMany
    private Set<historial>historiales;
   
}
