public class Truck extends Car {
    public void whells() {
        super.updateTyre();
    }
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void engine() {
        super.checkEngine();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
