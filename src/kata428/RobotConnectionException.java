package kata428;

public class RobotConnectionException extends RuntimeException{
    RobotConnectionException(String message) {
        super(message);
    }

    RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
