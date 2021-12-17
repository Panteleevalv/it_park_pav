package Lesson9;

public abstract class Automobile {
    private double dist;

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }
    public abstract void Move(double dist);
}
