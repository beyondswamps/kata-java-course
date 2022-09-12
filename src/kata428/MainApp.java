package kata428;

public class MainApp {
    public static void main(String[] args) {
        moveRobot(new RobotManager(), 5, 11);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection rc = null;
        for (int trialsCount = 1; trialsCount < 4; trialsCount++) {
            try {
                rc = robotConnectionManager.getConnection();
                rc.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException rce) {
                if (trialsCount == 3) {
                    throw rce;
                }
            } catch (Exception e) {
                throw e;
            } finally {
                if (rc != null) {
                    try {
                        rc.close();
                    } catch (Exception e) {}
                }
            }
        }
    }
}


