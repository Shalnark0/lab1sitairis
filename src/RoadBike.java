
public class RoadBike implements SportBike {


    public int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public RoadBike(){

    }

    public RoadBike(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Сел на шоссейный велик и поехал в другой город");
    }

    @Override
    public void stop() {
        System.out.println("Слез с велика и пошел домой.");
    }

    @Override
    public void showTrick() {
        System.out.println("Подпрыгнул на шоссейном велосипеде.");
    }
}
