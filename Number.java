import java.util.*;
public class Number 
{
    public static void main(String[] args) throws Exception 
    {
        /*  Make the computer player first.
        *   1)Make int variable computerPlayer
            2) Make the random object, then create an instance of it with a range of 5 followed by plus 1
        */
        int computerPlayer;
        Random computerChoice = new Random();
        computerPlayer = computerChoice.nextInt(5)+1;

        /*
            1)Make humanPlayer variable 
            2) Make it to where the user can input a number.
            
        */
        int humanPlayer;
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("Please enter in a random number to guess: \n " + "Enter a number between 1-6: ");
        humanPlayer = keyboard.nextInt();
        //Input validation using a while loop. Make sure the number is no less than zero or greater than six
        while(humanPlayer<=0 || humanPlayer>6)
        { 
            if(humanPlayer<=0 || humanPlayer>6)
            System.out.println("Please enter in a number in the suitable range! ");
            System.out.println("Try a new guess here: ");
            humanPlayer = keyboard.nextInt();
        }



        /*Decision making
            1) Make a nested while loop to have the program terminate once the condition is met.
                -If the condition is true print the winner message then terminate.
                -Otherwise, print a message stating the guess is incorrect and prompt the user to try again.


        */
        while(computerPlayer!=humanPlayer)
        {
            if(computerPlayer==humanPlayer)
            {
                System.out.println("Congratulations! You've guessed the right number!");
                break;
            }
            else if(computerPlayer!=humanPlayer)
            {
                System.out.println("Wrong guess!\n" + "Enter another guess within the range");
                humanPlayer =  keyboard.nextInt();
            }
        }
    }
}
