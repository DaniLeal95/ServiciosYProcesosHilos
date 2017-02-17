import java.util.Random;
import java.util.Scanner;

/**
 * Created by dleal on 17/02/17.
 */
public class Main {

    public static void main (String args[]){


        System.out.println("Cuantos filosofos hay en la mesa?");
        Scanner sc = new Scanner(System.in);
        int numFilosofos=Integer.parseInt(sc.nextLine());
        FilosofosUtilidades fu = new FilosofosUtilidades(numFilosofos);

        HiloFilosofo filosofo= new HiloFilosofo();
        for(int i=0;i<numFilosofos;i++){

        }
    }
}
