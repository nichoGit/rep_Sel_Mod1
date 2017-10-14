package com.qalabs.javabasics;


public class AssertionExample {

    public int substract(int A, int B){
         return A - B;
    }

    public static void main (String[] args) {
        int age = 2;
        //assert age >= 18;
        //assert  1 > 5: "Un minuto no menos 5 minutos";

        String cad1 ="cadena1", cad2 = "Cadena2";
        AssertionExample subs = new AssertionExample();

        //System.out.print(subs.substract(5,3));

        //assert cad1.equals(cad2): "No son igual";

       // assert cad1 == age: "No son tipos iguales";

        //assert age > 10 && age < 30: "Esta fuera de rango";
    }




}



