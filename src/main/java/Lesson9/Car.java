package Lesson9;

    public  class Car extends Automobile{
        public Car() {
             this.setDist(500);
        }

        public void Move(double dist) {
            if (dist <= this.getDist() && dist>0) {
                System.out.println("Легковой автомобиль проехал " + dist + " метров");
            }
            else {
                System.out.println("Легковой автомобиль не смог проехать " + dist + " метров");
            }

        }
    }


