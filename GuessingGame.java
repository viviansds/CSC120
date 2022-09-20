import java.util.Scanner;

class GuessingGame {
    static int secretNumber = 4;
    public static void main(String[] args){
        System.out.println("Works!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == secretNumber) {
            System.out.println(x: "Yay! You guessed right");
        }
        else{
            System.out.println("Sorry,incorrect guess.");
        }
            
        
        input.close();
    }
        
}
