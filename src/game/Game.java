/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom = random.nextInt(10);
        
        
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(10);
        System.out.print("Программа загадала число от 0 до 9, отгадайте: ");
        int userNumber = scanner.nextInt();
        if(userNumber == number) 
        {
            System.out.println("Ты выиграл!");
        }
        else
        {
            System.out.println("Проигрыш");
        }
    }
    
}
