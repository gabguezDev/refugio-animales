package modelo;

import java.util.Set;


public class animal  {
    private Long id;
    private int edad;
    private boolean estaCastrado;
    private Long tamañoEsperado;
    private String imagenURL;

    
    // Animal tiene una lista de historial
    // @OneToMany
    private Set<historial> historiales;
    
    // Animal tiene una raza 
    // @OneToOne
    private raza raza;
    
    // Animal tiene un tipo 
    // @OneToOne
    private tipo tipo;



}
