import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        int hormigas,arañas,cochinillas;

        System.out.println("Contando patas:");
        Scanner valorin =new Scanner(System.in);
        System.out.println("Introduce el nñumero de hormigas: ");
        hormigas= 6*valorin.nextInt();
        System.out.println("Introduce el nñumero de arañas: ");
        arañas= 8*valorin.nextInt();
        System.out.println("Introduce el nñumero de cochinillas: ");
        cochinillas= 16*valorin.nextInt();
        System.out.println("Has capturado un total de " +  (hormigas + arañas + cochinillas) + " patas" );

    }
}
