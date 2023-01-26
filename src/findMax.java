import java.util.Random;

public class findMax {

    public static void main(String[] args) {
        int[] numArray = new int[100];
        int max = 0;
        Random Random = new Random();
        for (int i = 0; i < 100; i++){
            int randomNum = Random.nextInt(1001);
            numArray[i] = randomNum;
            System.out.println(randomNum);
        }
        for (int i:numArray){
            if (i > max){
                max = i;
            }
        }

        System.out.println("The max number: "+ max);
    }
}