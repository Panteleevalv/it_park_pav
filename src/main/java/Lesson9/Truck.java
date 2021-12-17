package Lesson9;

public class Truck extends Automobile {

        public Truck() {
            this.setDist(1200);
        }

        public void Move(double dist) {
            if (dist <= this.getDist() && dist>0) {
                System.out.println("Грузовой автомобиль проехал " + dist + " метров");
            }

            else {
                System.out.println("Грузовой автомобиль не смог проехать " + dist + " метров");
            }
        }


}
