public class HilosRun implements Runnable {

    private int tipo;

    public HilosRun(int tipo) {
        this.tipo = tipo; // Constructor que recibe el tipo de hilo
    }

    @Override
    public void run() {
        // Este método se ejecutará cuando se inicie el hilo
        // Dependiendo del tipo, el hilo realizará diferentes tareas.
        switch(tipo) {
            case 1 -> {
                for(int i = 1; i < 30; i++) {
                    System.out.println(i); // Imprimir números del 1 al 29
                }
            }


    }
    }}