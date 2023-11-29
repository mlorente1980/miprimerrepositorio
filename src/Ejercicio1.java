import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        float A,B,C,D,E,V_medio;

        System.out.println("Introduzca 4 valores para calcular el valor medio");
        Scanner valorin =new Scanner(System.in);
        A= valorin.nextFloat();
        B= valorin.nextFloat();
        C= valorin.nextFloat();
        D= valorin.nextFloat();
        E= valorin.nextFloat();
        V_medio = (A+B+C+D+E)/4;
        System.out.println("El valor medio es " + V_medio);

    }
}
