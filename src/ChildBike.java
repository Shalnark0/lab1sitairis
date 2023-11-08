public class ChildBike implements Bike{


    @Override
    public void start() {
        System.out.println("Ребенок сел на велик с доп колесами и начал кататься по двору.");
    }

    @Override
    public void stop() {
        System.out.println("Ребенок слез с велика и пошел домой.");

    }
}
