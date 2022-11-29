
//this program uses synchronized method
class Callmee{
    //synchronized void call(String msg)
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Callerr implements Runnable{
    String msg;
    Callmee target;
    Thread t;

    public Callerr(Callmee targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (target){ //synchronized block
            target.call(msg);
        }
    }
}
class Synch1 {
    public static void main(String[] args) {
        Callmee target = new Callmee();
        Callerr ob1 = new Callerr(target, "Hello");
        Callerr ob2 = new Callerr(target, "Synchronized");
        Callerr ob3 = new Callerr(target, "World");

        //wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
