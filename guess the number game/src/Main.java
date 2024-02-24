import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;


        System.out.println("\n*************** Welcome to Guess the number game ***************\n");

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(true){

            System.out.println("Chance " + count + " : ");
            System.out.print("Enter your guess : ");
            int guess = scanner.nextInt();

            if(guess>randomNumber){
                System.out.println("Guess lower!");
            }
            else if(guess == randomNumber){
                System.out.println("Correct! You guessed it right!");
                break;
            }

            else{
                System.out.println("Guess higher!");
            }
            System.out.println();
            count++;
        }
        if(count<=5){
            if(count == 1){
                System.out.println("Dammmmn Where are your feet i gotta kneel down to you, GENIUS!");
            }
            if(count<2){
                System.out.println("By any chance are you superHuman!");
            }
            if(count<3){
                System.out.println("Excellent!");
            }
            System.out.println("Great job!");
        }

        if(count>5){
            System.out.println("You can do better!");
        }
        System.out.println("\n********************* Thanks for playing  **********************\n");
    }
}