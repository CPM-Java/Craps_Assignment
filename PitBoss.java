
/**  
 * Review Assignment
 * 
 * @author GrayKnight CPM 
 * @version 10-12-14, 10-11-18
 * 
 */

public class PitBoss
{
    private PairOfDice myTosser;
    private boolean isFirstRoll;
    private int myPlayersBank, myPlayersBet, myPlayersPoint, myLastRoll;
    private String myDealersComment = "Wanna Play?";
   
    //Constructor
    public PitBoss(int bank, int bet)
    {  
       myTosser = new PairOfDice();
       isFirstRoll = true;    
       myPlayersBank = bank;
       myPlayersBet = bet;
    }
    
   /* Students will complete the diceThrown() method  
    
   diceThrown() enforces game rules
   
   Does not allow the game to proceed if the player has no money
    or if the player is betting more money than they have.
   
   If the player rolls a 7 or 11 on their first roll the player wins.
   The house wins on a 2, 3 or 12 on the first roll.
   
   IF none of those values are rolled, the last roll becomes the "players point".
   on all following rolls, the player wins if they roll the "players point",
   and the house wins on 7.  The player rolls until either one happens 
   and cannot change the amount bet until they win or the house wins.
   
   */    
    public void diceThrown()
    {
        myDealersComment = "You've got work to do!";
    }
    
        //GETTER METHODS
    public int getPlayersBank(){return myPlayersBank;}
    public int getPlayersPoint(){return myPlayersPoint;}
    public int getPlayersBet(){return myPlayersBet;}
    public int getLastRoll(){return myLastRoll;}
    public String getDealersDialogue(){return myDealersComment;}
    
    //SETTER METHODS
    public int increaseBet()    
    {
        if (isFirstRoll && myPlayersBet < myPlayersBank) myPlayersBet += 10;
        return myPlayersBet;
    }
    
    public int decreaseBet()
    {
        if (isFirstRoll && myPlayersBet >= 20) myPlayersBet -= 10;
        return myPlayersBet;
    }
}

