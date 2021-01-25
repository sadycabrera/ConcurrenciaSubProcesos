import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjecutorTarea
{
    public static void main(String[] a)
    {
        // crea y nombra cada objeto Runnable
        TareaImprimir tarea1= new TareaImprimir("* Tarea1");
        TareaImprimir tarea2= new TareaImprimir("* Tarea2");
        TareaImprimir tarea3= new TareaImprimir("* Tarea3");

        System.out.println("Creando Executor............");

        //Crea objeto ExecutorService para administrar los subprocesos
        ExecutorService ejecutorSubprocesos = Executors.newCachedThreadPool();

        //Inicia los subprocesos y los pone en estado ejecutado
        ejecutorSubprocesos.execute(tarea1);
        ejecutorSubprocesos.execute(tarea2);
        ejecutorSubprocesos.execute(tarea3);
        //Cierra los subprocesos cuando tewrminan sus tares
        ejecutorSubprocesos.shutdown();
        System.out.println("Tareas, iniciadas, main termina............ \n");
    }
}
