public class Car extends Bicycle {
    public void whells() {
        super.updateTyre();
    }
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
