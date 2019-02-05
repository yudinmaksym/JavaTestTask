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
public class Triangle {
    
    Triangle(){
        Figures figure = new Figures();
        double figureArea = figure.generateRandomFigureArea();
        String color = figure.generateRandomFigureColor();
        double triangleSideLong = mathCustomLong(figureArea);
        set(figureArea, color, triangleSideLong);
    }
    
    void set(double figureArea, String color, double SideLong){
        String[] squareArray = {"Треугольник   " + Double.toString(figureArea) + " кв.ед.  цвет: " + color + "  Длина гипотенусы: " + Double.toString(SideLong)};
        System.out.println(squareArray[0]);
    }
    
    public double mathCustomLong(double figureArea){ // Gipotenusa
        double degrees = 30.0;
        double radians = Math.toRadians(degrees);
        
        double a = Math.cos(radians); // Side А
        double b = Math.sin(radians); // Side B
        
        // System.out.println("Сторона а " + a);
        // System.out.println("Сторона b " + b);
        
        
        double g = (figureArea * 2)/(a*b);
        
        double triangleSideLong = Math.sqrt(g); // trianble S = (a*b)/2
        return triangleSideLong;
    }
}
