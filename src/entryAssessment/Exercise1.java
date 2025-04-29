package entryAssessment;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {

        Random random = new Random(); //create object of Random class
        for (int i =1; i<=100;i++){
            int randomNumber = random.nextInt(100) + 1;
            String result= i + ": "+random.nextInt(100)+1;

            if (randomNumber % 7 == 0) { // Check if the random number is divisible by 7.
                
                result += " Lucky number!"; 
            }
            System.out.println(result + (i % 5 == 0 && i != 100 ? "\n---" : ""));
        }

    }

}
