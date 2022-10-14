import java.util.Random;

/**
 * @author Drumstyle92
 * A class that contains a variable, a constructor, and a method.
 */
public class CustomNumber {
    /**
     * random number.
     */
    public int number;

    /**
     * method to set the random value to the class variable.
     */
    public CustomNumber(){
       int min = 1;
       int max = 12;
       Random random = new Random();
       int num = random.nextInt((max - min) + 1) + min;
       System.out.println("The random number is: " + num);
       this.number = num;
    }

    /**
     * method that provides a table of multiplications to the random number.
     */
    public void getMultiplicationTable(){
        for(int i = 12; i>=1; i--){
            System.out.println(i +" x "+ this.number +" = "+ i * this.number );
        }
    }
}
