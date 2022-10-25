public class NewThred implements Runnable{
    String name;
    Thread thread;

    public NewThred(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("Новый поток " + thread);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {

            try {
                System.out.println(name+ ":" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("прерванны поток  " + name);
            }
        }
        System.out.println(name + " поток завершен");

    }
}
