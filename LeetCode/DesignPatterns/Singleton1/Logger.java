package LeetCode.DesignPatterns.Singleton1;

public class Logger {

    private static Logger instance; 

    private Logger(){

    }

     // Metoda statica instanta Singleton
    public static Logger getInstance(){
        if(instance == null){
             instance = new Logger();
        }
        return instance;
    }

    public void logWarning(String message){
        System.out.println("[WARNING]: " + message);
    }

    public void logInfo(String message){
        System.out.println("[INFO]: " + message);
    }

    public void logError(String message){
        System.out.println("[ERROR]: " + message);
    }
}