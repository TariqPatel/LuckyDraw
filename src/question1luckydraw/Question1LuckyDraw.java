/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1luckydraw;

import javax.swing.*;
import java.util.*;
import java.util.Random.*;
import java.lang.String;
/**
 *
 * @author Tariq
 */
//MOGAMAT TARIQ PATEL
public class Question1LuckyDraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Pane for Entering persons first name
        String name = JOptionPane.showInputDialog(null, "Enter your first name");
        System.out.println("Name: " + name);

        //Pane for Entering persons Date of birth
        String DateofBirth = JOptionPane.showInputDialog(null, "Enter your Year of Birth");
        System.out.println(DateofBirth);





        //calling method 
        int myAge = getAge(DateofBirth);
        System.out.println(myAge);

        //checking if random generator is working
        char char1 = getRandomCharactar();
        char char2 = getRandomCharactar();
        char char3 = getRandomCharactar();
        char char4 = getRandomCharactar();
        char char5 = getRandomCharactar();
        char char6 = getRandomCharactar();

        //generating 6 letters
        
         JOptionPane.showMessageDialog(null, "CODE " + char1 +char2 +char3 +char4 + char5 + char6);
        //initialising score variables
        int score1 = getCharacterScore(char1);
        int score2 = getCharacterScore(char2);
        int score3 = getCharacterScore(char3);
        int score4 = getCharacterScore(char4);
        int score5 = getCharacterScore(char5);
        int score6 = getCharacterScore(char6);
        
        //checking if scores are correct
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        System.out.println(score4);
        System.out.println(score5);
        System.out.println(score6);

        //adding up the scores
        int finalScore = score1 + score2 + score3 + score4 + score5 + score6;


        //code for deciding what the cash amount is
        int cashAmount = 0;
        if (finalScore == 0){
            cashAmount = 100;
        }else if (finalScore >0) 
        cashAmount = getCashPayOut(myAge, finalScore);
         JOptionPane.showMessageDialog(null, "Gift: R" + cashAmount);

        
    }
    
    
    
    
    
    
    //method for age
    public static int getAge(String yearOfBirth) {

        int numberOfBirth = Integer.parseInt(yearOfBirth);

        GregorianCalendar aCalendar = new GregorianCalendar();
        int currentYear = aCalendar.get(aCalendar.YEAR);

        int myAge = currentYear - numberOfBirth;
        System.out.println("Age: " + myAge);

        return myAge;
    }

    //method for getting random charactars/generate code
    public static char getRandomCharactar() {

        String Alphabet1 = ("abcdefghijklmnopqrstuvwxyz");
        int randomnumber = (int) ((int) 0 + Math.random() * 25);
        char random = Alphabet1.charAt(randomnumber);

System.out.println(randomnumber);
        return random;
    }
//method to determine points
    public static int getCharacterScore(char aCharactar) {

        int Score = 0;
        switch (aCharactar) {

            case 'a':
                Score = 1;
                break;
            case 'e':
                Score = 2;
                break;
            case 'i':
                Score = 3;
                break;
            case 'o':
                Score = 4;
                break;
            case 'u':
                Score = 5;


        }
        return Score;
    }
//method for determining cash amount
    public static int getCashPayOut(int age, int totalscore) {
        int digit1 = age / 10;
        int digit2 = age % 10;
        age = digit1 + digit2;
        int cashpayout = age * totalscore;





        return cashpayout;
    }
    
    
    
    
    
    
    
    
    
}
