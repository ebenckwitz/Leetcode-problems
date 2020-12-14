/*
Suppose we have a class:

public class Foo {
  public void first() { print("first"); }
  public void second() { print("second"); }
  public void third() { print("third"); }
}
The same instance of Foo will be passed to three different threads. Thread A will call first(), thread B will call second(), and thread C will call third(). 
Design a mechanism and modify the program to ensure that second() is executed after first(), and third() is executed after second().
Example 1:

Input: [1,2,3]
Output: "firstsecondthird"
Explanation: There are three threads being fired asynchronously. 
The input [1,2,3] means thread A calls first(), thread B calls second(), and thread C calls third(). "firstsecondthird" is the correct output.
*/

class Foo {
    boolean[] t = new boolean[2];
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        System.out.print("first");
        t[0] = true;
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        while(!t[0]);
        System.out.print("second");
        t[1] = true;
        
         printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!t[0] || !t[1]);
        System.out.print("third");
        
        // printThird.run() outputs "third". Do not change or remove this line.
         printThird.run();
    }
}
