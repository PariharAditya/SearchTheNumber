import java.util.Scanner;
public class Game {
    static int low=1,high=20;
    static int numberOfTurnsLeft = 2; 
 
    public static void main(String[] args) {
        gameBegins();
    }
    public static void gameBegins()
    {
        int secretNumber=0;
        
        double i =Math.random();
        if(i != 0)
        secretNumber= (int) (i*21);
        else
        {
            gameBegins();
            System.out.println("Please enter a valid number");
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("NUMBER GUESSING GAME ");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("pick a number between 1-20! You will get 2 turns");
        if(secretNumber%2==0)
        System.out.println("Hint - The number is even");
        else
        System.out.println("Hint - The number is odd");
        while(true)
        {
            int inputNumber = playerInput();
            predictionResult(inputNumber, secretNumber);
        }
    }
    
    
    public static int playerInput()
    {
        Scanner in = new Scanner(System.in);
        int playerInput= in.nextInt();
        System.out.println("player guesses "+ playerInput);
        return playerInput;
    }
    
    public static void predictionResult(int inputNumber , int secretNumber)
    {
        /* Check if inputNumber is lesser
        than secretNumber */
        if(inputNumber!= secretNumber)
        {
            numberOfTurnsLeft=numberOfTurnsLeft-1;
            System.out.println("Chances remaining -> "+ numberOfTurnsLeft);
            if(secretNumber==1)
            System.out.println("The Chosen");
            else if(secretNumber==2)
            System.out.println("Minute ki Maggi!");
            else if(secretNumber==3)
            System.out.println("Gandhi ji k kitne Bandar");
            else if(secretNumber==4)
            System.out.println("Double Date!");
            else if(secretNumber==5)
            System.out.println("Cost of tapri chai");
            else if(secretNumber==6)
            System.out.println("The First common multiple of starting two number");
            else if(secretNumber==7)
            System.out.println("Cristiano Ronaldo");
            else if(secretNumber==8)
            System.out.println("The number of hoocruxes in Harry Potter");
            else if(secretNumber==9)
            System.out.println("Jewels of Akbar");
            else if(secretNumber==10)
            System.out.println("The number of heads Ravana had");
            else if(secretNumber==11)
            System.out.println("Twins when you start the counting again");
            else if(secretNumber==12)
            System.out.println("Month for the homecoming of Santa Claus");
            else if(secretNumber==13)
            System.out.println("6th prime number");
            else if(secretNumber==14)
            System.out.println("Valentine week");
            else if(secretNumber==15)
            System.out.println("Thrice of 3rd prime number");
            else if(secretNumber==16)
            System.out.println("Half of number of days in a month+1");
            else if(secretNumber==17)
            System.out.println("4th prime number + twice of five");
            else if(secretNumber==18)
            System.out.println("Twice of 2nd prime number X 2");
            else if(secretNumber==19)
            System.out.println("index is 7 in array of prime number");
            else if(secretNumber==20)
            System.out.println("5X2X2");
            if(inputNumber < secretNumber)
            {
                System.out.println(" Sorry,that is too low ");
                if (numberOfTurnsLeft == 0) {
                    System.out.println("You're out of trys! The SECRET number was "+ secretNumber); 
                    playAgain();
                }    
            }
        /* Check if inputNumber is higher
        than secretNumber */        
            else if(inputNumber > secretNumber)
            {
                System.out.println(" Sorry,that number is  too high ");
                if (numberOfTurnsLeft == 0) {
                    System.out.println("You're out of trys! The SECRET number was "+ secretNumber); 
                    playAgain();
                }

            }
        }    
        else
        {
            System.out.println("YOU WIN! The SECRET number was "+ secretNumber);
            playAgain();
        }
    }
    public static void playAgain()
    {
        low=1;
        high=20;
        numberOfTurnsLeft = 2;
        gameBegins();
        
    }
    
}
//finished
