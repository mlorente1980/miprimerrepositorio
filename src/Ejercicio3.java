import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        double mm,cm,m,total;

        System.out.println("Introduce 3 distancias en las unidades indicadas");
        Scanner valorin =new Scanner(System.in);
        System.out.print("Introduce la primera distancia (mm): ");
        mm= valorin.nextDouble();
        System.out.print("Introduce la primera distancia (cm): ");
        cm= valorin.nextDouble();
        System.out.print("Introduce la primera distancia (m): ");
        m= valorin.nextDouble();
        total = mm/10 + cm + m*100;
        System.out.println("La distancia total es (cm) :" + total);

    }
}
