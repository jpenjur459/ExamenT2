import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        char relleno = 'X';
        int fila = 0;


        if (numero % 2 != 0)  {


            for (fila = 1; fila <= numero; fila++) {
                if (fila != numero / 2 + 1) {
                    for (int espacios = 0; espacios < numero / 2; espacios++) {
                        System.out.print(" ");
                    }

                    for (int i = 0; i < 1; i++) {
                        System.out.print(relleno);
                    }
                }
                if (fila == numero / 2 + 1) {
                    for (int figura = 0; figura < numero; figura++) {
                        System.out.print(relleno);
                    }
                }
                System.out.println(" ");
            }
        } else  {
            System.out.println("el numero que has introducido no es valido");
        }




    }
}
