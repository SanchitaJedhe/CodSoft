import java.util.Random;
import java.util.Scanner;

public class GuessLogic {
    public static void main(String [] args){
        
        // specify the varibles that needed
        int userGuess=0;
        int attempts=0;
        int limit=5;
        boolean flag=false;

        GuessLogic gl=new GuessLogic();
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to 'Guess the Number'!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        System.out.println(" you have only "+ limit+" attempts");

        

         // Create a Random object
         Random random = new Random();

        // Generate a random integer between 1 and 100 (inclusive)
          int randomInt = random.nextInt(100) + 1;
    
    while(attempts <limit){
        System.out.println("enter the number: - ");
        userGuess=sc.nextInt();
        attempts++;
        
       if(userGuess>randomInt){
           System.out.println("too high !! try again....");
        
       }    
       else if(userGuess < randomInt) {
        System.out.println(" too low!! try again.....");
       }
       else{
        System.out.println("Congragulation !!!.. your guesing Correct");
        System.out.println(" it took you "+ attempts+ " attempts to guess");
        flag=true;
       
        }
    }
    if(!flag){
        System.out.println("Soory you have run out of attempsts");
        System.out.println("the correct number was: " +randomInt);
    }

   }
 }
    
