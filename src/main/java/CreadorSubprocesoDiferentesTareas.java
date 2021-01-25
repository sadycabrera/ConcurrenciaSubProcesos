import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreadorSubprocesoDiferentesTareas {
    public static void main(String[] a)
    {
        TareaSumar tareaSumar=new TareaSumar("Tarea Sumar",12,21);
        TareaImprimir tareaImprimir=new TareaImprimir("Tarea Imprimir");

        System.out.println("Crando los subprocesos");
        ExecutorService executorService = Executors.newCachedThreadPool();

        System.out.println("Inicia los subproceso y los pone en estaso ejecucion");
        executorService.execute(tareaSumar);
        executorService.execute(tareaImprimir);

        executorService.shutdown();

        System.out.println("Iniciado los subprocesos, termina main");
    }
}
