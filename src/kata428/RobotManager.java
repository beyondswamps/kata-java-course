package kata428;

public class RobotManager implements RobotConnectionManager, RobotConnection {
    @Override
    public RobotConnection getConnection() {
        return new RobotManager();
    }

    @Override
    public void moveRobotTo(int x, int y) {
        System.out.println("Moving to x: " + x + ", y: " + y + ", bzzz, bzzz");
    }

    @Override
    public void close() throws RobotConnectionException{
        System.out.println("Connection is closed");
    }
}
