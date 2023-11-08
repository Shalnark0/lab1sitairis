public class Sherp implements Amphibian, EnduroBike {

    private int amountOfWheels;
    private int amountOfPlaces;

    public Sherp() {
    }

    public Sherp(int amountOfWheels, int amountOfPlaces) {
        this.amountOfWheels = amountOfWheels;
        this.amountOfPlaces = amountOfPlaces;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public int getAmountOfPlaces() {
        return amountOfPlaces;
    }

    public void setAmountOfPlaces(int amountOfPlaces) {
        this.amountOfPlaces = amountOfPlaces;
    }

    @Override
    public void start() {
        System.out.println("Запустили двигатель Sherpa и поехали в грязь.");
    }

    @Override
    public void stop() {
        System.out.println("Заглушили грязный Sherp и погрузили его на эвакуатор.");
    }

    @Override
    public void swim() {
        System.out.println("Перешел в режим плавания");
    }

    @Override
    public void ride() {
        System.out.println("Перешел в сухопутный режим");
    }
}

