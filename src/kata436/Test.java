package kata436;

import java.util.logging.*;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Test.class.getName());
        logger.log(Level.INFO, "Всё хорошо");
        logger.log(Level.WARNING, "Произошла ошибка");
        logger.log(Level.WARNING, "Произошла ошибка");
        logger.log(Level.FINE, "Меня видно?");
    }
}
