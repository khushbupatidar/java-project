import java.util.*;
public class Game {
    public static void main(String[] args) 
    {
        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1 ;
        
        System.out.println("You have five attemps.....");
        System.out.println("Enter your guess(1 - 100) : ");

        int c = 5;
        
        while(c-- != 0)
        {
            int playerGuess = sc.nextInt();

            if(playerGuess == randomNumber)
            {
               System.out.println("Correct! You Win");
               System.exit(0);
            }
            else if(randomNumber > playerGuess )
            {
               System.out.println("Nope! The number is higher, Guess again");
            }
            else
            {
             System.out.println("Nope! The number is lower, Guess again");
            }
        }
        System.out.println("Sorry ! You lost");
        sc.close();
    }
}
