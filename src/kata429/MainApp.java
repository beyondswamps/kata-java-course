package kata429;

public class MainApp {
    public static void main(String[] args) {
        moveRobot(new RobotManager(), 59, 111);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int trialsCount = 1; trialsCount < 4; trialsCount++) {
            try (RobotConnection rc = robotConnectionManager.getConnection()) {
                rc.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException rce) {
                String lastMethodName = rce.getStackTrace()[0].getMethodName();
                if (trialsCount == 3 && !lastMethodName.equals("close")) {
                    throw new RobotConnectionException("Connection failed 3 times in a row", rce);
                }
            }
        }
    }
}
