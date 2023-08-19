package modelo;

import java.util.Date;

public class historial {
    private Long id;
    private Date fechaRescate;
    private Date fechaAdopcion;
    private Long peso;
    

    // historial tiene un animal
    // @ManytoOne
    private animal animal;

    //historial tiene un evento
    //@ManyToOne
    private evento evento;

    //historial tiene un estado;
    //@ManyToOne
    private estado estado;

    //historial tiene un adoptante
    //@ManyToOne
    private adoptante adoptante;
    
    //historial tiene un rescastista
    //@ManyToOne
    private rescatista rescatista;


    //historial tiene un administrador
    //@ManyToOne
    private administrador administrador;


}
