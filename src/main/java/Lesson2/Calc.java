package Lesson2;

public class Calc {
    public static void main(String[] args) {
        System.out.println("привет, Мир!122");
        long summa = CalcSum(2, 5);
        System.out.println(summa);

        long minus = CalcMinus(10, 15);
        System.out.println(minus);
    }

    public static int CalcSum(int arg1, int arg2) {
        return arg1 + arg2;
    }
    public static int CalcMinus(int arg1, int arg2) {
        return  arg1 - arg2;

    }

}
