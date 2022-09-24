package kata4review;

import java.io.IOException;

public class Testing {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[]{1, 2, 3, 4};
        ints[2] = 5;
        System.out.println(ints[2]);
        AutocloseableTestClass.main();

        try (AutocloseableTestClass aut1 = new AutocloseableTestClass("aut1");
             AutocloseableTestClass aut2 = new AutocloseableTestClass("aut2")) {
            if (true) {throw new Exception("exception in try");}
            test2();
        } catch (RuntimeException re){
            System.out.println(re.getStackTrace());
        } catch (Exception e) {
            System.out.println("this is in catch");
            throw new RuntimeException(e);
        }
    }

    public static void test2() throws Exception{
        throw new Exception();
    }

    public static class AutocloseableTestClass implements AutoCloseable {
        public String name;

        public static void main() throws Exception{
            try {
                System.out.println("try block");
                throw new Exception("try exception");
            } catch (Exception e) {
                System.out.println("catch block");
                Exception excp = new Exception("catch exception");
                StackTraceElement[] stackTraceElement = excp.getStackTrace();
                throw excp;
            }
        }

        AutocloseableTestClass(String name) {
            this.name = name;
            System.out.println(name + " is created");
        };

        @Override
        public void close() throws Exception {
            System.out.println(name + " is closing");
            throw new Exception("exception in close()");
        }
    }
}
