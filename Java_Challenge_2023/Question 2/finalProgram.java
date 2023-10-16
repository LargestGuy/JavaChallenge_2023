public class finalProgram {
    public static void main(String[] args){
        Die d6 = new Die(); //Creating objects
        Die d20 = new Die(20, "blue");
        Die d12 = new Die(12, "violet");

        //Printing the results of the different roles. The method also stores the returned value in the object
        System.out.println(d6.roll());
        System.out.println(d20.roll());
        System.out.println(d12.roll());

        //Calculating the sum of the roles
        int sum = d6.readLastRoll() + d20.readLastRoll() + d12.readLastRoll();

        //Printing
        System.out.println("");
        System.out.println("The sum is: "+ sum);
        System.out.println("");
        System.out.println("The colors are: " + d6.diceColor() + ", " + d20.diceColor() + ", and " + d12.diceColor());
    }
}
