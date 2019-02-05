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
public class Trapezoid {
    
    Trapezoid(){
        Figures figure = new Figures();
        
        double sideA = figure.generateRandomFigureArea();
        double sideB = figure.generateRandomFigureArea();
        double sideC = figure.generateRandomFigureArea();
        
        String stringSideA = Double.toString(sideA);
        String stringSideB = Double.toString(sideB);
        String stringSideC = Double.toString(sideC);
        
        String threeSides = stringSideA + " " + stringSideB + " " +stringSideC;
        
        String color = figure.generateRandomFigureColor();
        
        double trapezArea = mathCustomLong(sideA, sideB, sideC);
        
        set(threeSides, color, trapezArea);
    }
    
    void set(String threeSides, String color, double SideLong){
        String[] squareArray = {"Трапеция   " + threeSides + " см  цвет: " + color + "  Площадь кв.ед. : " + Double.toString(SideLong)};
        System.out.println(squareArray[0]);
    }
    
    public double mathCustomLong(double sideA, double sideB, double sideC){ // Area
        
        double trapezArea = ((sideA + sideB)/2) * Math.sqrt(Math.pow(sideC,2) - (Math.pow(sideA+sideB, 2)/4)); // 
        return trapezArea;
    }
    
}
