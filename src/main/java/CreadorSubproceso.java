public class CreadorSubproceso {
    public  static void main(String[] a)
    {
        System.out.println("Creación de subprocesos:");

        //Se crea cada subproceso con un nuevo objeto Runnable
        Thread subproceso1=new Thread(new TareaImprimir("Imprime Mate"));
        Thread subproceso2= new Thread(new TareaImprimir("Imprime lengua"));

        System.out.println("Subprocesos creados, iniciando tareas:");

        //Inicia los subprocesos y los pone en estado EN EJECUCION
        subproceso1.start();
        subproceso2.start();

        System.out.println("Tareas iniciadas, main termina. \n");
    }
}
