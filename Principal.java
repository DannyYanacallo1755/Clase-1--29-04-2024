//Proceso Principal

import java.util.logging.Logger;

public class Principal {
  
    public static void main(String[] args) {
        // Creación de instancias de HilosRun para los hilos h1 y h2
        HilosRun h1 = new HilosRun(1); // Hilo h1 imprimirá números
        HilosRun h2 = new HilosRun(2); // Hilo h2 imprimirá letras

        // Creación de instancias de Thread para los hilos t1 y t2, pasando h1 y h2 como argumentos
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        try {
            t1.start();
            t1.join(); // Esperar a que hilo1 termine
            t2.start();
            t2.join(); // Esperar a que hilo2 termine
        } catch (InterruptedException exception) {
            Logger.getLogger(null);
        }
      
        System.out.println("Principal");
        
    }

    
}

