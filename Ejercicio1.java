import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int numero_elejido = entrada.nextInt();


        if (numero_elejido % 2 == 0) {
            for (int par = 10; par < numero_elejido; par = par + 5) {
                System.out.println(par);
            }
        } else if (numero_elejido % 2 != 0) {
            for (int inpar = 10; inpar < numero_elejido; inpar = inpar + 3){
                System.out.println(inpar);
            }

        }
    }
}
