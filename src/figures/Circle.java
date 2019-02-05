/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author админ
 */
public class Circle {
    
    Circle(){
        Figures figure = new Figures();
        double figureArea = figure.generateRandomFigureArea();
        String color = figure.generateRandomFigureColor();
        double circleRadius = mathCustomLong(figureArea);
        set(figureArea, color, circleRadius);
    }
    
    void set(double figureArea, String color, double SideLong){
        String[] squareArray = {"Круг   " + Double.toString(figureArea) + " кв.ед.  цвет: " + color + "  Радиус Круга: " + Double.toString(SideLong)};
        System.out.println(squareArray[0]);
    }
    
    public double mathCustomLong(double figureArea){ // Radius
        double pi = 3.14;
        double circleRadius = Math.sqrt(figureArea/pi); // trianble R = sqrt( Area / Pi number )
        return circleRadius;
    }
}
