//create a second thread
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        //create a new,second thread
        t = new Thread(this, "Demo thread");
        System.out.println("Child thread: "+t);
        t.start();  //start the thread
    }

    //this is entry point for second thread
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();  //create a new thread
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interupted.");
        }
        System.out.println("Main thread exiting...");
    }
}
