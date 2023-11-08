public class Miracle implements PitBike, ClassicBike, EnduroBike {
    @Override
    public void start() {
        System.out.println("Завели данный аппарат и он поехал по грязи, по дорогам и т.д.");
    }

    @Override
    public void stop() {
        System.out.println("Заглушили двигатель этого чуда.");
    }


}
