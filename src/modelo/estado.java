package modelo;

import java.util.Set;

public class estado {
    private Long id;
    private String nombre;


    //estado tiene una lista de historiales
    //@OneToMany
    private Set<historial>historiales;

}
