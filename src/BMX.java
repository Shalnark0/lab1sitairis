public class BMX implements SportBike{
    @Override
    public void start() {
        System.out.println("Сел на маленький велик и начал делать трюки.");
    }

    @Override
    public void stop() {
        System.out.println("Слез с маленького велика, кинул на землю.");
    }

    @Override
    public void showTrick() {
        System.out.println("Сделал сальто на BMX.");
    }
}
