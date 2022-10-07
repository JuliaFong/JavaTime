/* 
 * There are two ways to create our own Thread object
 * 
 * Subclassing the Thread class and instantiating a new object of that class
 * Implementing the Runnable interface
 * both cases the run()method should be implemented
*/
package lesson1;

class MyClass extends Thread{
    public void run() {
        //TODO auto-generated method stub
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()  +" Value " + i);

        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            //Todo catch-block
            e.printStackTrace();
        }
    }
    
}

public class lesson1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.start();
        MyClass myClass1 = new MyClass();
        myClass1.start();
    }
    
}