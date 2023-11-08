import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Miracle miracle = new Miracle();
        miracle.start();

        Sherp sherp = new Sherp(4,2);
        sherp.swim();


        RoadBike roadBike = new RoadBike();
        System.out.println("Введите максимальную скорость для шоссейника");
        int speed = scanner.nextInt();
        roadBike.setMaxSpeed(speed);
        System.out.println(roadBike.getMaxSpeed());


    }
}
