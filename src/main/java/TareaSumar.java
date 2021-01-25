import java.util.Random;

public class TareaSumar implements Runnable {
    private final int tiempoInactividad; // tiempo de inactividad aleatorio para el subproceso
    private final String nombreTarea; // nombre de la tarea
    private final static Random generador = new Random();
    private int a;
    private  int b;

    public TareaSumar(String nombre,int a, int b) {

        nombreTarea = nombre;
        this.a=a;
        this.b=b;
        //tiempoInactividad = generador.nextInt( 5000 );
        tiempoInactividad = 101;
    }
// el método run contiene el código que ejecutará un subproceso
         public void run()
{
         try // deja el subproceso inactivo durante tiempoInactividad segundos
        {
             System.out.printf( "%s va a estar inactivo durante %d milisegundos.\n",
                     nombreTarea, tiempoInactividad );
             Thread.sleep( tiempoInactividad ); // deja el subproceso inactivo
            } // fin de
    // try
    catch ( InterruptedException excepcion )
         {
             System.out.printf( "%s %s\n", nombreTarea,"termino en forma prematura, debido a la interrupcion" );
             } // fin de catch

       // imprime el nombre de la tarea
        System.out.printf( "%s termino su inactividad\n", nombreTarea );
    System.out.println("Voy a sumar");
    int c= a+b;
    System.out.println("Resultado operadcion:"+c);
        } // fin del método run
}
