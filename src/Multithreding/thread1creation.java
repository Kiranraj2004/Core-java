package Multithreding;

public class thread extends Thread{
//    multitasking allows several activites to occur concurrently on the computer
//     process based multitasking
//    thread based multitasking
//    two treads share the same address space threads is less expensive because
//    in threads  they will work in same program for
//    ex ms word where we write at the same time it will check the grammar mistake
//     process thread example switching from ms word to painting its not a in same program

    @Override
    public void run() {

        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread()+" "+i);
        }
    }
}
