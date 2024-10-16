package LeetCode.DesignPatterns.Singleton2;

public class Main {
    public static void main(String[] args) {
        ConfigService configService = ConfigService.getInstance();

        System.out.println(configService.getConfig("app.name"));
        System.out.println(configService.getConfig("db.url"));
    }
}
