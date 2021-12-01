package Lesson8;

public class AnimalVoice {
    public static void main(String[] args) {


        Cats catOne = new Cats("Mурзик");
        Dogs dogOne = new Dogs("Шарик");
        Birds birdOne = new Birds("Синичка");

        Animals[] animals = new Animals[3];
        animals[0] = catOne;
        animals[1] = dogOne;
        animals[2] = birdOne;

        for (Animals array: animals){
            System.out.print(array.name + " ");
            array.voice();
        }
    }
}
