package kata6215;

import java.io.StringReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deq = new LinkedList<>();
        int i = 0;
        while (sc.hasNext()) {
            if (i++ % 2 == 1) {
                deq.add(sc.nextInt());
            } else {sc.nextInt();}
        }
        for (Integer el : deq) {
            System.out.print(el + " ");
        }
    }
}
