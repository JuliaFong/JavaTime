package lesson4;

public class lesson4 {
    private static int count = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread (new Runnable() {
            public void run() {
                for(int i =0; i < 10000; i++){
                    count++;
                    count = count +1;
                }
                
            }
        });
            

        Thread t2 = new Thread (new Runnable() {

            public void run(){
                for(int i = 0; i <= 1000; i++){
                    count++;
                }
            }
        });
        t1.start();
        t2.start();

        try { //Java thread join method can be used to pause current thread execution until unless specified thread is dead
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("value : "+ count);

    }
    
}

