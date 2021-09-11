package com.prepare.desgin_pattern.factory;

public class ShapeLauncher {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

    }
}
