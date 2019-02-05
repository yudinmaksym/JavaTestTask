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
public class Square {
    
    Square(){
        Figures figure = new Figures();
        double figureArea = figure.generateRandomFigureArea();
        String color = figure.generateRandomFigureColor();
        double squareSideLong = mathCustomLong(figureArea);
        set(figureArea, color, squareSideLong);
    }

    void set(double figureArea, String color, double SideLong){
        String[] squareArray = {"Квадрат   " + Double.toString(figureArea) + " кв.ед.  цвет: " + color + "  Длина стороны: " + Double.toString(SideLong)};
        System.out.println(squareArray[0]);
    }
    
    public double mathCustomLong(double figureArea){
        double squareSideLong = Math.sqrt(figureArea); // square S = a^2
        return squareSideLong;
    }
    
    
    
}
