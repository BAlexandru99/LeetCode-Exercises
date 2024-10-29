package LeetCode.DesignPatterns.Adapter2;

public class Main {
    public static void main(String[] args) {
        FancyShape fancyShape =  new FancyShape();
        Shape shape = new FancyShapeAdapter(fancyShape);

        shape.draw();

    }
}
