package com.Eje1SegParte;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Coche miCoche = new Coche(2);
        miCoche.incrementarPuertas(1);
        System.out.println(miCoche.puerta);
    }
}
