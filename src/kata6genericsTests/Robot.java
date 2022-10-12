package kata6genericsTests;

public class Robot<H extends Head, B extends Body> {
    public H head;
    public B body;

    public Robot(H head, B body) {
        this.head = head;
        this.body = body;
    }

    public static void main(String[] args) {
        Robot<Head, Body> robot = assembleRobot();
        robot.body.protect();
    }

    public static Robot<Head, Body> assembleRobot() {
        Robot<Head, Body> robot = new Robot<>(new SmallHead(), new ArmoredBody());
        return robot;
    }
}
