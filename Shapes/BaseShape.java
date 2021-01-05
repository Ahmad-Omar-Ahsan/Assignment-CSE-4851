package Shapes;

import java.util.List;

public class BaseShape {
    private String name;
    private String material;
    private String color; 
    private List<BaseShape> shapePart;

    public BaseShape(String name, String material, String color, List<BaseShape> shapePart){
        this.name = name;
        this.material = material;
        this.color = color;
        this.shapePart = shapePart;
    }

    public void addShape(BaseShape shape){
        shapePart.add(shape);
    }

    public void removeShape(BaseShape shape){
        if (shapePart.contains(shape)){
            shapePart.remove(shape);
        }
    }

    public int getShapeIndex(BaseShape shape){
        return shapePart.indexOf(shape);
    }

    public int totalParts(){
        return shapePart.size();
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }

    public void printDetails(int indent){
        String details = "Name of the object: " + getName() + ", Material of the object: " + getMaterial() + ", Color of the object: " +getColor();
        System.out.printf(details.indent(indent));

        if (shapePart.size() > 0){
            for (BaseShape shape: shapePart){
                shape.printDetails(indent + 4);
            }
        }
    }

    



}
