package semana2.lunes.miercoles.hilos;

public class TestS extends Thread {
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestS h1 = new TestS();
        h1.start();

        HiloS h2 = new HiloS();
        Thread hr2 = new Thread(h2);
        hr2.start();
    }
}

class HiloS implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
