package modelo;

import java.util.Set;

public class rescatista extends persona{
    private String direccionTransito;
    

    //rescatista tiene una lista de historiales
    //@OneToMany
    private Set<historial>historiales;
}
