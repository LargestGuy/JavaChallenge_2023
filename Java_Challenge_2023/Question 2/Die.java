public class Die {
    int sides; //Attribute of die class
    int lastRoll;
    String color;

    public Die(){ //Default constructor (creates a 6 sided dice)
        this.sides = 6;
        this.lastRoll = 0;
        this.color = "white";
    }
    public Die(int n){ //Perameterized construcotr (creates a dice with the same # of sides as n)
        this.sides = n;
        this.lastRoll = 0;
        this.color = "white";
    } public Die(int n, String m){
        this.sides = n;
        this.color = m;
        this.lastRoll = 0;
    }

    public int roll(){
        lastRoll = (int) ((Math.random()*sides-1)+1); //Stores a value between 1 and the total # of sides. Needed for getting the previous roll
        return lastRoll; //Returns said value
    }
    public int readLastRoll(){ //Returns the value of the last roll if it is 0 or greater
        if(this.lastRoll>=1){
            return this.lastRoll;
        } else { //Otherwise, returns -1
            return -1;
        }
    } public String diceColor(){
        return this.color;
    }
}
