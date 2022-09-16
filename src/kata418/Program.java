package kata418;

public class Program {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod(){
        System.out.println(getCallerClassAndMethodName());
        anotherMethodToo();
    }

    private static void anotherMethodToo() {
        System.out.println(getCallerClassAndMethodName());
    }
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        if (st.length < 4) {
            return null;
        }
        StackTraceElement caller = st[3];
        return caller.getClassName() + "#" + caller.getMethodName();
    }
}
