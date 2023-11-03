import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrad = new Scanner(System.in);

        int nota;
        int numero_de_notas = 0;
        int total = 0;
        int aprobados = 0;
        int suspensos = 0;
        do {
            nota = entrad.nextInt();
            if(nota != -1){
                total= total + nota;
                numero_de_notas ++ ;
            }if(nota >= 5){
                aprobados ++ ;

            }else suspensos ++;

        }while(nota != -1);

        int media = total / numero_de_notas;
        System.out.println("la media es "+ media);
        System.out.println("Aprobados: " + aprobados + " - suspensos: "+ suspensos);

    }
}
