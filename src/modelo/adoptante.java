package modelo;

import java.util.Set;

public class adoptante extends persona{
    private String direccion;


    //adoptante tiene una lista de historiales
    //@OneToMany
    private Set<historial>historiales;

}
