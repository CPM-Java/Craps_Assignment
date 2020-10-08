/**
 * class that implements Die objects
 * 
 * @author Mr. Coyner 
 * @version 8/31/17
 */
public class Die
{
   private int myNumSides; // number of sides on this die
   private int myFaceValue = 1;  // current value showing on the die

   
    /**
     *   Constructor: Sets the number of sides.
     */
   public Die(int numSides){
      myNumSides = numSides;
   }

   
    /**
     *   Rolls the die and returns the result.
     * 
     * @return     the value of the roll as an integer 
     */
   public int roll(){
      myFaceValue = (int)(Math.random() * myNumSides) + 1;
      return myFaceValue;
   }

    /**
     *   Face value getter method.
     * 
     * @return     the most recent roll as an integer 
     */
   public int getMyFaceValue(){
      return myFaceValue;
   }
   
    /**
     *   Number of sides getter method.
     * 
     * @return     the number of die sides as an integer 
     */
   public int getMyNumSides(){
      return myNumSides;
   }
   
    /**
     *   Number of sides setter method.
     * 
     * @param     numSides the number of die sides as an integer 
     */
   public void setMyNumSides(int numSides){
      myNumSides = numSides;
   }

    /**
     * Returns a string representation of this die.
     * 
     * @return     a string describing instance variables
     */
   public String toString(){
      String result = "The number of sides is: " + myNumSides + "The current face value is: " + myFaceValue;
      return result;
   }
}
