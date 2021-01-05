package Shapes;

import java.util.ArrayList;

public class Tree extends BaseShape{
    public Tree() {
        super("Tree", "Multiple", "Multiple", new ArrayList<>());
        this.addShape(new Rectangle("Trunk", "Bark", "Brown"));
        this.addShape(new Circle("Leaves", "Bio", "Green"));
        this.addShape(new Triangle("Root", "Wood", "Brown"));
    }
}