package Shapes;

import java.util.ArrayList;

public class WaterSource extends BaseShape {

    public WaterSource() {
        super("Water Source", "Multiple", "Multiple", new ArrayList<>());
        this.addShape(new Circle("Well Wall", "Bricks", "Red"));
        this.addShape(new Triangle("Well Shed", "Tin", "Blue"));
        this.addShape(new Cylinder("Bucket", "Tin", "Grey"));
    }

}