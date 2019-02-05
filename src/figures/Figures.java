/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

import java.util.Random;

/**
 *
 * @author админ
 */
public class Figures {
    
    public double generateRandomFigureArea(){
        double minRangeArea = 1.0;  //  Min range of figure Area
        double maxRangeArea = 50.0; //    Max range of figure Area
        double figureArea = (Math.random()*((maxRangeArea-minRangeArea)+1))+minRangeArea; // Generate random figure Area

        return figureArea;
    }
    
    public String generateRandomFigureColor(){  
        String[] colors = {"синий", "красный", "желтый", "зеленый", "белый", "черный"};
        int minRangeColor = 0;
        int maxRangeColor = colors.length;
        int figureRandomColor = (int)(Math.random()*((maxRangeColor-minRangeColor)))+minRangeColor;  // Generate random color form all Colors
        
        return colors[figureRandomColor];
    }
    
    static public int generateRandomNumber(){ //creates a random number with which creates the same number of figures of the same type
        Random rn = new Random();
        int number = rn.nextInt(5) + 1;
        return number;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] generateNumbersForAllFigures = new int[4]; // array size of all types of shapes
        for (int i = 0; i < generateNumbersForAllFigures.length; i++) {
            generateNumbersForAllFigures[i] = generateRandomNumber(); // generate a random number to create so many shapes 
        }
        
        int i = 0, j = 0, k = 0, m = 0;
        
        while(i != generateNumbersForAllFigures[0]){
            Square square = new Square();
            i++;
        }
        
        while(j != generateNumbersForAllFigures[1]){
            Triangle triangle = new Triangle();
            j++;
        }
        
        while(k != generateNumbersForAllFigures[2]){
            Circle circle = new Circle();
            k++;
        }
        
        while(m != generateNumbersForAllFigures[3]){
            Trapezoid trapezoid = new Trapezoid();
            m++;
        }
        
        
    }
     
}
