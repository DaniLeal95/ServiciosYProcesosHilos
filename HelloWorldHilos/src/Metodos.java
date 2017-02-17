import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 * Created by dleal on 3/02/17.
 */
public class Metodos {
    private long time = (long) (Math.random() * 1000);
    private String cadena="";
    private Object o = new Object();
    private boolean señal = false;
    private char sigueescribiendo='S';
    //private Semaphore semaforo = new Semaphore();

    private boolean algoleido=false;
    public Metodos() {

    }

    public void Leer (){
//        boolean leido=false;
        do {
            synchronized (o) {
                try {


                    while (!señal) {
                        if(sigueescribiendo=='S') {
                            o.wait();
                            while(algoleido){}
                            if (señal) algoleido = false;
                        }
                    }
                    if(sigueescribiendo=='S') {
                        System.out.println("Soy el consumidor:Me han despertao :D");
                        System.out.println(cadena);
                        algoleido=true;

                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        } while (this.sigueescribiendo == 'S');

    }

    public void Escribir(){
        Scanner sc = new Scanner(System.in);
        do {
            synchronized (o) {

                System.out.println("Soy el productor:Estoy escribiendo");



                señal = false;
                System.out.println("Escribe algo:");
                this.cadena = sc.nextLine();




                señal = true;
                o.notify();

            }
            try {

                algoleido=false;
                Thread.sleep(time);


                System.out.println("Desea Seguir escribiendo? S para seguir o cualquier otra cosa para salir");
                sigueescribiendo = Character.toUpperCase(sc.nextLine().charAt(0));



            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (sigueescribiendo == 'S');
    }

}
