public class OneCard {
    /** To store the name of the card's owner*/
    String owner;

    /** To store the card owner's ID */
    String ID;

    /** To store the balance of funds on the card */
    double balance;

    /** Costructor */
    public OneCard(String owner, String ID,double balance){
// the argumet that feeds in to this constructor becomes the attribute of the class
        this.owner = owner;
        this.ID = ID;
        this.balance = balance;

    }
    //This naming convention also works 
    // public OneCard(String x, String x,double x){
    //     this.owner = x;
    //     this.ID = x;
    //     this.balance = x;
    // }
    public double getBalance(){
        return this.balance;
    }
    /** 
     * Adds specified amount to the card's balance
     * @param amt: the amount to deposit
     */
    public void deposit(double amt){
        this.balance += amt;
    }

    /**
     * Checks whether balance on card is greater than or equal to proposed amount
     * @param amt proposed amount to spend
     * @return T/F: whether the balance is sufficient to cover the proposed spending
     */
    public boolean canAfford(double amt){
        return (this.balance >= amt);
    }
    /**
     * If sufficient balance, debits card for amt
     * @param amt
     */
    public void spend(double amt){
        if(this.canAfford(amt)){
            this.balance -= amt;
        }
        System.err.println("Sorry, insufficient fund");
        
    }
    public static void main(String [] args){
        OneCard myCard = new OneCard("Vivian", "991429467", 4.5);
        System.out.println(myCard);
        System.out.println("Initial balance: "+myCard.balance);
        myCard.deposit(15.0);
        System.out.println("After deposit: "+ myCard.balance);
        System.out.println(myCard.canAfford(21.97));
        myCard.spend(134.56);
        System.out.println("After spend: "+ myCard.balance);

    }   
}
