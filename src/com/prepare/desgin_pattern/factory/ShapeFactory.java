package com.prepare.desgin_pattern.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeName) {

        if(shapeName.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeName.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    public static Shape getShapeSwitchCase(String shapeName) {
        switch (shapeName){
            case "CIRCLE" :
                return new Circle();
            case "SQUARE" :
                return new Square();
            default:
                 return null;
        }
    }
}
