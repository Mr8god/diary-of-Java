package cn.mr8god.jchapterten;

import static net.mindview.util.Print.print;

interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    private int i = 0;

    @Override
    public void increment() {
        i++;
        print(i);
    }
}

class MyIncrement{
    public void increment(){ print("Other operation");}
    static void f(MyIncrement mi) { mi.increment(); }
}

class Callee2 extends MyIncrement{
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        print(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){ callbackReference = cbh; }
    void go(){ callbackReference.increment(); }
}

/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 13:48
 */
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
