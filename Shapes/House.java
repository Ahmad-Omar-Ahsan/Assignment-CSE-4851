package Shapes;

import java.util.ArrayList;

public class House extends BaseShape {

    public House() {
        super("House", "Multiple", "Multiple", new ArrayList<>());
        this.addShape(new Rectangle("Room", "Bricks", "Orange"));
        this.addShape(new Triangle("Roof", "Clay", "Maroon"));
    }

}