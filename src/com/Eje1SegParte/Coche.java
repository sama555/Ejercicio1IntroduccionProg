package com.Eje1SegParte;

public class Coche {
    /*
    - Crear una clase coche.
- Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
- Una función que incremente el número de puertas que tiene el coche.
- Crear un objeto miCoche en el main y añadirle una puerta.
- Mostrar el número de puertas que tiene el objeto.
     */
    String modelo;
    double velocidad;
    Integer puerta;

    public Coche(Integer puerta)
    {
        this.puerta=puerta;
    }

    public Integer incrementarPuertas(Integer puerta){
      return  puerta+=puerta;
    }

}
