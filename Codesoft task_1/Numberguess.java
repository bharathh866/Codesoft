import javax.swing.*;

public class Numberguess {
  public static void main(String[] args) {
    int computernumber=(int)(Math.random()*100 +1);
    int userguess=0;
    int count=0;
    int attempt=7;
  
    while(userguess != computernumber && attempt>=1){

        String response=JOptionPane.showInputDialog(null, "Enter a guess between 1 to 100 \n Total Attempts : 7");
        userguess=Integer.parseInt(response);
      
        JOptionPane.showMessageDialog(null, ""+ determineGuess(userguess,computernumber,count,attempt));
     
        count++;

  attempt--;
    }
  }    
  public static String determineGuess(int userguess,int computernumber,int count,int attempt){

  

    if(userguess <=0 || userguess>100){
            attempt=attempt-1;
        return "Your guess is Invalid "+count +" Attempts left :"+attempt;
    }
    else if(userguess ==computernumber){
        return "Correct ! Total Guesses:"+count  ;
    }
    else if(userguess >computernumber){
        attempt=attempt-1;
        return "Your guess is too high,Try again \n " +" Attempts left :"+attempt;
    }
    else if(userguess <computernumber){
        attempt=attempt-1;
        return "Your Guess is too Low,Try again: \n "+" Attempt left :"+attempt;
    }

   else{
        return "Your guess is Incorrect \n "+" Attempt left :"+attempt;

    }
    }

  }


  

