import Thief.TakeGuess;
import java.util.*;


public class Finder{
    /*Class variable ları tanımlanır*/
    int targetWagon ;
    TakeGuess takeGuess;

    public Finder(){
        /*constructorda class variable lerine instanceler atanır*/
        targetWagon = new Random().nextInt(10) + 1; //rastgele yerleştirmeyi 1-10 arası yapmak için sonucu 0-9 arası olan rastgele sayıya 1 ekledik
        takeGuess = new TakeGuess();
    }

    public void find(){
        int i = 4, takenGuess = -1;
        /*Kullanıcı doğru tahmini yapana kadar i değişkeni her iterasyonda bir azaltılarak score düşürülür aynı zamanda toplamda 4 tahmin yapılabilmesi kontrol edilir.
        * tahmin tutmadığı sürece ve tahmin hakkı bitmediği sürece kullanıcıdan tahmin alınaya devam edilir*/
        while(i-->0 && targetWagon != takenGuess){
            if(takenGuess>-1)
                System.out.println("Thief is in " + (takenGuess>targetWagon? "back" : "front"));

            takenGuess = takeGuess.getValue();
        }

        // üstteki while doğru tahmin le yada thamin hakkı bitimince sonlanabileceği için sebebini kontrol edip veirlen hak içinde doğru tahmin yapıldığı kontrol edilir
        // takenGuess rastgele sayıyla eşitse tahmin doğru yapılmıştır.
        if(targetWagon != takenGuess)
            System.out.println("You kidnapped the thief. Thief is in number " + targetWagon + " wagon");
        else
            System.out.println("You caught the thief. Score: " + (i + 2) * 25 );
    };

    public static void main(String args[]){
        new Finder().find();
    }
}
