package kata428;

//testing catch with break
public class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            try (AutoCloseable ac = new autocl()) {
                break;
            } catch (Exception e) {
                System.out.println("catch entered the game");
            } finally {
                System.out.println("finally is speaking");
            }
        }
    }
}


class autocl implements AutoCloseable {
    Integer field = 15;

    @Override
    public void close(){
        System.out.println("close() in autocl");
    }
}