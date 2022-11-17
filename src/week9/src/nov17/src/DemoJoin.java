//using join() to wait for threads
class NewThread1 implements Runnable{
    String name;
    Thread t;
    NewThread1(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: "+t);
        t.start();  //start the thread
    }

    //this is entry point for thread
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println(name + ": "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + "interrputed.");
        }
        System.out.println(name + " exiting.");
    }
}
class DemoJoin {
    public static void main(String[] args) {
        NewThread1 ob1 = new NewThread1("One");
        NewThread1 ob2 = new NewThread1("Two");
        NewThread1 ob3 = new NewThread1("Three");
        System.out.println("thread One is alive: "+ob1.t.isAlive());
        System.out.println("thread Two is alive: "+ob2.t.isAlive());
        System.out.println("thread Three is alive: "+ob3.t.isAlive());
        //wait for threads to finsih
        try{
            System.out.println("Waiting for threads to finsih.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("thread One is alive: "+ob1.t.isAlive());
        System.out.println("thread Two is alive: "+ob2.t.isAlive());
        System.out.println("thread Three is alive: "+ob3.t.isAlive());
        System.out.println("Main thread exiting.");

    }
}
