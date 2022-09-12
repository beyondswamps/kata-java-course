package kata416;

import java.lang.Math;

public class Program {
    public static void main(String[] args) {
//        A a = new A();
//        Double b = Math.random();
//        if (b > 0.5) {
//            a = new C();
//        } else if (b < 0.5) {
//        a = new E();
//        }
//
//        A c = (B) a;

        C a = new A();
        // B b = (B) a;
    }
}

class C {

}

class A extends C {

}

class B extends C {

}
