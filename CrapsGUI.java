
/**
 * Creates GUI for the dice rolling simulator.
 * 
 * @author GrayKnight CPM
 * @version 11/16/03, 10-30-07, 11-1-10, 10-12-14, 10-11-18 
 * 
 * DO NOT MODIFY THIS CODE
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CrapsGUI extends JPanel
{
    private JLabel lastRollLabel, playersPointLabel;
    private JLabel dealersCommentsLabel, playerBetLabel, playerBankLabel;
    private JButton throwDiceButton, increaseButton, decreaseButton;
    private JPanel centerPanel, southPanel, northPanel;
    private PitBoss jim;
    private int playersInitialMoney = 500;
    private int playersInitialBet = 50;

    
    /**
     * Constructor for objects of class CrapsGUI
     */
    public CrapsGUI()
    {  
        
       jim = new PitBoss(playersInitialMoney, playersInitialBet);
       
       setLayout(new BorderLayout());
       
       throwDiceButton = new JButton("Throw Dice");
       increaseButton = new JButton("More");
       decreaseButton = new JButton("Less");
       
       //initial display information
       dealersCommentsLabel = new JLabel(jim.getDealersDialogue());
       lastRollLabel = new JLabel("Last Roll __");
       playersPointLabel = new JLabel("Player's Point __");
       playerBetLabel = new JLabel("Your Bet $" + jim.getPlayersBet());
       playerBankLabel = new JLabel("Your Money $"  + jim.getPlayersBank());
       
       ButtonListener Listener = new ButtonListener();
       throwDiceButton.addActionListener(Listener);
       increaseButton.addActionListener(Listener);
       decreaseButton.addActionListener(Listener);
       
       centerPanel = new JPanel();
       centerPanel.add(increaseButton);
       centerPanel.add(decreaseButton);

       southPanel = new JPanel();
       southPanel.add(lastRollLabel);
       southPanel.add(throwDiceButton);
       southPanel.add(playersPointLabel);
       
       add(dealersCommentsLabel, BorderLayout.NORTH);
       add(playerBetLabel, BorderLayout.WEST);
       add(centerPanel, BorderLayout.CENTER);
       add(playerBankLabel, BorderLayout.EAST);
       add(southPanel, BorderLayout.SOUTH);

       setPreferredSize(new Dimension(380, 100));
    }//end of constructor


    /**
     * Private Listener Class.
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
    if(event.getSource() == throwDiceButton)
    {
       jim.diceThrown();
       playerBankLabel.setText("Your Money $" + jim.getPlayersBank());
       dealersCommentsLabel.setText(jim.getDealersDialogue());
       lastRollLabel.setText("Last Roll " + jim.getLastRoll());
       
       String playersPointStr = "Player's Point ";
       if(jim.getPlayersPoint() == 0) //player won on first roll
          playersPointStr += "__";
       else //more rolling
          playersPointStr += jim.getPlayersPoint();
          
       playersPointLabel.setText(playersPointStr);
       
    }//throwDiceButton if
    
    if(event.getSource() == increaseButton)
    {
        playerBetLabel.setText("Your Bet $" + jim.increaseBet());
    }
    
    if(event.getSource() == decreaseButton)
    {
        playerBetLabel.setText("Your Bet $" + jim.decreaseBet());
    }
    
      
    }//end buttonClicked method
    
}//end innter class
}//end of class
