// import java.util.Scanner;

// class GuessingGame {
//     static int secretNumber = 4;
//     public static void main(String[] args){
//         System.out.println("Works!");
//         Scanner input = new Scanner(System.in);
//         int guess = input.nextInt();

//         if (guess == secretNumber) {
//             System.out.println(x: "Yay! You guessed right");
//         }
//         else{
//             System.out.println("Sorry,incorrect guess.");
//         }
            
        
//         input.close();
//     }
        
// }
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {

        int secretNumber = 4;

        System.out.print("Please enter an integer between 0 and 10: ");
        Scanner input = new Scanner(System.in);
        int userGuess = input.nextInt();
        
        if (userGuess == secretNumber) {
            System.out.println("Yay! You guessed it");
        } else {
            System.out.println("Sorry, you didn't guess right");
        }

        input.close();

    }
}