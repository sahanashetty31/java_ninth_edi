//create a second thread by extending Thread
class NewThread1 extends Thread{
    NewThread1(){
        //create a new second thread
        super("Demo Thread");
        System.out.println("Child thread: "+this);
        start();  //start the thread
    }
    //this is entry point for second thread


    public void run() {
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
class ExtendThread {
    public static void main(String[] args) {
        new NewThread1();  //create a new thread
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("main thread interrupted.");
        }
        System.out.println("Main thread exiting..");
    }
}
