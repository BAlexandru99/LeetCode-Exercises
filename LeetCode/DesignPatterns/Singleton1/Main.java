package LeetCode.DesignPatterns.Singleton1;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
        logger.logInfo("Crowded street");
        logger.logError("Engine problem");
        logger.logWarning("Accident ahead");
    }
}
