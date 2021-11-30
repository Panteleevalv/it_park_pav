package Lesson6;
import java.util.Arrays;

public class OpArrays {
    public static void main(String[] args) {

        int[] NumberArray = new int[10];
        for (int i = 0; i < NumberArray.length; i++){
            NumberArray[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(NumberArray));
        System.out.println("Min : " + MinValue(NumberArray));
        System.out.println("Max : " + MaxValue(NumberArray));
        System.out.println("AVG : " + AverageValue(NumberArray));
    }

   /* Вычисление минимального значения*/

    public static int MinValue(int[] array) {
        int minV = array[0];
        for (int i : array){
            if (minV > i){
                minV = i;
            }
        }
        return minV;
    }

    /* Вычисление максимального значения*/
    public static int MaxValue(int[] array) {
        int maxV = array[0];
        for (int i : array) {
            if (maxV < i) {
                maxV = i;
            }
        }
        return maxV;
    }

    /* Вычисление среднего значения*/
    public static double AverageValue(int[] array) {
        double averageV = 0;
        for (int i : array){
            averageV += i;
        }
        return averageV/array.length;
    }
}
