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
        try {
            throw new Exception();
        } catch (Exception e) {
            if (e.getStackTrace().length < 3) {
                return null;
            }
            StackTraceElement caller = e.getStackTrace()[e.getStackTrace().length - 1];
            return caller.getClassName() + "#" + caller.getMethodName();
        }
    }
}
