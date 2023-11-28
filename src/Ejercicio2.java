import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        int A,B,C,X,resultado;

        System.out.println("Vamos a calcular el valor de la función y=ax\u00B2+bx+c");
        Scanner valorin =new Scanner(System.in);
        System.out.println("Introduce el valor de a:");
        A= valorin.nextInt();
        System.out.println("Introduce el valor de b:");
        B= valorin.nextInt();
        System.out.println("Introduce el valor de c:");
        C= valorin.nextInt();
        System.out.println("Introduce el valor de x:");
        X= valorin.nextInt();
        //resultado = (A*Math.pow(X,2)+B*X+C); //Esta expresión no vale porque el ejercicio indica que sean de tipo entero y Math fuerza un cast a double
        resultado = (A*X*X+B*X+C);
        System.out.println("El resultado es y = " + resultado);

    }
}
