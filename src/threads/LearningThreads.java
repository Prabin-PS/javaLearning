package threads;

//class A implements Runnable {                        //Instead of Thread we will be using the Runnable interface for
//    public void run(){                              //code optimisation and for extending multiple classes
//        for(int i=0;i<5;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class B implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class LearningThreads {

    public static void main(String[] Args){

        Runnable obj1 = ()->{                           //we are using Lambda operations here since Runnable is a functional interface
                for(int i=0;i<5;i++){                   //This is how we need to optimize code
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {throw new RuntimeException(e);}
                }
        };

        Runnable obj2 = ()->{
                for(int i=0;i<5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {throw new RuntimeException(e);}
                }
        };

        Thread t1 = new Thread(obj1);   //We are passing obj1 since that is how it got linked with the start function
        Thread t2 = new Thread(obj2);

        t1.start();                     //Since we can't work with start we are creating the Thread object t1 above
        t2.start();

    }
}



//If a class is extended with Thread then it will become a thread and inorder to execute a thread we should have start()
// and a run() method. Initially the start will be executed based on which the run will be triggered.

//In machines there will be a default scheduler which will allocate works and assign


//Different States of Threads

//New - When a thread is created then it will be in new state
//Runnable -  When start() is called it will be moved to Runnable state
//Running - When your thread is running with the help of run() it is in running state
//Waiting - If a running thread has to wait. can be done by using wait() or sleep()
    //If the waiting thread os scheduled then notify() will be used to rerun it again
//Dead - If in case a thread needs to be stopped we can use stop()
















