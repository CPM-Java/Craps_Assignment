
/**
 * Part of the solution of PP4.7
 * 
 * GrayKnight
 * 11/1/10
 * 
 * DO NOT MODIFY THIS CLASS
 */
public class PairOfDice
{
    // instance identifiers
    private Die my1Die, my2Die;
    private int mySum;

    /**
     * Constructor for objects of class PairOfDice
     */
    public PairOfDice()
    {
        my1Die = new Die(6);
        my2Die = new Die(6);
    }

    /**
     * simulates rolling the dice
     */
    public void rollDice()
    {
        mySum = my1Die.roll() + my2Die.roll();
    }
    
    public int getSum()
    {
        return mySum;
    }

    public int getFirstDie()
    {
        return my1Die.getMyFaceValue();
    }
    
    public int getSecondDie()
    {
        return my2Die.getMyFaceValue();
    }
}
