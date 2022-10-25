public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThred ob1= new NewThred("один");
        NewThred ob2 = new NewThred("два");
        NewThred ob3 = new NewThred("три");

        System.out.println("Поток один запущен " + ob1.thread.isAlive());
        System.out.println("Поток два запущен " + ob2.thread.isAlive());
        System.out.println("Поток три запущен " + ob3.thread.isAlive());


        try {
            System.out.println("ожидание завершение потоков");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток приостановелен");;
        }
        System.out.println("Поток один запущен " + ob1.thread.isAlive());
        System.out.println("Поток два запущен " + ob2.thread.isAlive());
        System.out.println("Поток три запущен " + ob3.thread.isAlive());
        System.out.println("главнй поток завершен");
    }
}
