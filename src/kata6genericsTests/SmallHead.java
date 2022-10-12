package kata6genericsTests;

public class SmallHead extends Head {
    public SmallHead() {
        System.out.println("Small head is mounted");
    }

    @Override
    public void turnHeadLeft() {
        System.out.println("Cant. Head to small to turn");
    }

    @Override
    public void turnHeadRight() {
        System.out.println("Cant. Head to small to turn");
    }
}
