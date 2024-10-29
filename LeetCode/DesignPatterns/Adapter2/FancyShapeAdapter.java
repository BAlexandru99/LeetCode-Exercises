package LeetCode.DesignPatterns.Adapter2;

public class FancyShapeAdapter implements Shape {
    private FancyShape fancyShape;

    public FancyShapeAdapter(FancyShape fancyShape){
        this.fancyShape = fancyShape;
    }

    @Override
    public void draw() {
        System.out.println("Start drawing: " + fancyShape.render());
    }



}
