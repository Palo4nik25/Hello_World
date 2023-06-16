import java.util.Random;

public class Lesson {
    public static void main(String[] args) {
        float[] weight = new float[10];
        float sum = 0f;
        int count = 0;

        for (int i = 0; i < weight.length; i++) {
            weight[i] = (new Random().nextFloat(40, 100));
            sum += weight[i];

            if (weight[i] >= 60 && weight[i]<= 80) {
                count++;
            }
        }
        System.out.println("Average weight is: " + (sum / weight.length) + "\nPeople with weight from 60 to 80: " + count);
    }
}
