import java.util.Random;

public class TareaImprimir implements Runnable {
    private final int tiempoInactividad; // tiempo de inactividad aleatorio para el subproceso
    private final String nombreTarea; // nombre de la tarea
    private final static Random generador = new Random();

    public TareaImprimir(String nombre) {

        nombreTarea = nombre;
       // tiempoInactividad = generador.nextInt( 5000 );
        tiempoInactividad =100;
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
        } // fin del método run
}
