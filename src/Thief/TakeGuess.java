package Thief;
import java.util.*;

public class TakeGuess {
    Scanner inpObj;

    public TakeGuess(){
        inpObj= new Scanner(System.in);
    }

    public int getValue(){
        System.out.println("Enter guess (1-10):");
        return this.inpObj.nextInt();
    };
}
