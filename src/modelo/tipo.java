package modelo;

import java.util.Set;

public class tipo {
    private Long id;
    private String nombre;
    
    // Tipo tiene una lista de razas
    // @OneToMany
    private Set<raza> razas;


    //tipo tiene una lista de animales
    //@OneToMany
    private Set<animal>animales;

}
