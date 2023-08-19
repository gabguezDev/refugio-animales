package modelo;

import java.util.Set;

public class raza {
    private Long id;
    private String nombre;
    

    // Muchas razas tiene un tipo
    // @ManyToOne
    private tipo tipo;

    //una raza tiene muchos animales
    //@OneToMany
    private Set<animal>animales;


}
