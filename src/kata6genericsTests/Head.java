package kata6genericsTests;

public abstract class Head {

    public Head() {
        System.out.println("Head is mounted");
    };
    public void turnHeadLeft() {
        System.out.println("turning head to the left");
    }

    public void turnHeadRight() {
        System.out.println("turning head to the right");
    }

    public void shootLaserEyes() {
        System.out.println("Bzz, Bzz, Im firing you with hell laser fire");
    }
}
