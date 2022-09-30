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
        if(inputNumber < secretNumber)
        {
            System.out.println(" Sorry,that is too low ");
            numberOfTurnsLeft = numberOfTurnsLeft-1;
            if (numberOfTurnsLeft == 0) {
                System.out.println("YOU LOSE! The SECRET number was "+ secretNumber); 
                playAgain();
            }    
            System.out.println("Try Again! Chances remaining -> "+ numberOfTurnsLeft);
            if(secretNumber==1)
            System.out.println("The Chosen");
            else if(secretNumber==2)
            System.out.println("Minute ki Maggi!");
            else if(secretNumber==3)
            System.out.println("Gandhi ji ka kitna bandar");
            else if(secretNumber==4)
            System.out.println("Double Date!");
            else if(secretNumber==5)
            System.out.println("Cost of Chai");
            else if(secretNumber==6)
            System.out.println("hintfor6");
            else if(secretNumber==7)
            System.out.println("hintfor7");
            else if(secretNumber==8)
            System.out.println("hintfor8");
            else if(secretNumber==9)
            System.out.println("hintfor9");
            else if(secretNumber==10)
            System.out.println("hintfor10");
            else if(secretNumber==11)
            System.out.println("hintfor11");
            else if(secretNumber==12)
            System.out.println("hintfor12");
            else if(secretNumber==13)
            System.out.println("hintfor13");
            else if(secretNumber==14)
            System.out.println("hintfor14");
            else if(secretNumber==15)
            System.out.println("hintfor15");
            else if(secretNumber==16)
            System.out.println("hintfor16");
            else if(secretNumber==17)
            System.out.println("hintfor17");
            else if(secretNumber==18)
            System.out.println("hintfor18");
            else if(secretNumber==19)
            System.out.println("hintfor19");
            else if(secretNumber==20)
            System.out.println("hintfor20");
        }
        /* Check if inputNumber is higher
        than secretNumber */        
        else if(inputNumber > secretNumber)
        {
            System.out.println(" Sorry,that number is  too high ");
            numberOfTurnsLeft = numberOfTurnsLeft-1;
            if (numberOfTurnsLeft == 0) {
                System.out.println("YOU LOSE! The SECRET number was "+ secretNumber); 
                playAgain();
            }
            System.out.println("Try Again! Chances remaining ->"+ numberOfTurnsLeft);
            if(secretNumber==1)
            System.out.println("The Chosen");
            else if(secretNumber==2)
            System.out.println("Minute ki Maggi!");
            else if(secretNumber==3)
            System.out.println("Gandhi ji ka kitna bandar");
            else if(secretNumber==4)
            System.out.println("Double Date!");
            else if(secretNumber==5)
            System.out.println("Cost of Chai");
            else if(secretNumber==6)
            System.out.println("hintfor6");
            else if(secretNumber==7)
            System.out.println("hintfor7");
            else if(secretNumber==8)
            System.out.println("hintfor8");
            else if(secretNumber==9)
            System.out.println("hintfor9");
            else if(secretNumber==10)
            System.out.println("hintfor10");
            else if(secretNumber==11)
            System.out.println("hintfor11");
            else if(secretNumber==12)
            System.out.println("hintfor12");
            else if(secretNumber==13)
            System.out.println("hintfor13");
            else if(secretNumber==14)
            System.out.println("hintfor14");
            else if(secretNumber==15)
            System.out.println("hintfor15");
            else if(secretNumber==16)
            System.out.println("hintfor16");
            else if(secretNumber==17)
            System.out.println("hintfor17");
            else if(secretNumber==18)
            System.out.println("hintfor18");
            else if(secretNumber==19)
            System.out.println("hintfor19");
            else if(secretNumber==20)
            System.out.println("hintfor20");
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