import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        final String[] strings = {"test", "test2", "test3"};
        final int[] ints = {3, 5, 7, 9};
        int[] intsss = {2, 4, 6};
        strings[1] = "notest";
        ints[1] = 11;

        System.out.println(strings[1]);

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));

        Program prg = new Program();

        Program.printing();
        prg.printing("nothing");

    }

    static void printing() {
        System.out.println("static");
    }

    void printing(String a) {
        System.out.println("nonstatic");
    }

    private class Inner {
        
    }


}

class anotherProgram {
    static void anotherPrg() {
        System.out.println("anotherPrg");
    }
}
