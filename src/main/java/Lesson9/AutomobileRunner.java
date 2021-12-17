package Lesson9;

public class AutomobileRunner {
    public static void main(String[] args) {
        int automobiles = 10;
        Automobile[] auto = new Automobile[automobiles];

        for (int i = 0; i <= 4; i++){
            auto[i] = new Car();
        }

        for (int i = 5; i < automobiles; i++) {
            auto[i] = new Truck();
        }

        for(int i = 0; i < automobiles; i++){
            auto[i].Move((int)(Math.random() * (1500)));
        }
    }
}
