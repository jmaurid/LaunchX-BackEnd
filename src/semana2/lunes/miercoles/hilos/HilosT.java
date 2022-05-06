package semana2.lunes.miercoles.hilos;

public class HilosT extends Thread{
    @Override
    public void run() {
        System.out.println("El hilo se está ejecutando.");
    }

    /*
    public void start(){
        //Iniciar la ejecución de un hilo
        // La JVM llama al método run () del hilo
    }
    sleep() - Detiened de manera temporal el numero especificado
    join () - Espera a que el hilo se muera
    getPriority() - Regresa la prioridad del hilo
    setPriority() - Establece la prioridad del hilo
    getName() - Nombre del hilo
    currentThread() - Referencia el hilo que se esta ejecutando
    getId() - Regresa el id del hilo
    Thread.State getState() - Regresa el state del hilo
    */

    public static void main(String[] args) {
        HilosT hilo = new HilosT();
        hilo.start();
    }
}

class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de runnable está " +
                "corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}
