public class Main {

    public static void main(String[] args) {
//        instanziating classes
        Zoo zoo = new Zoo();
        GuestFactory guestFactory = new GuestFactory();

//        Creates Threads
        Runnable keeper1 = new Zookeeper();
        Runnable keeper2 = new Zookeeper();


//        Starts Threads
        while (true) {
            Thread thread1 = new Thread(keeper1);
            Thread thread2 = new Thread(keeper2);
        }

    }
}
