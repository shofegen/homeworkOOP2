public class Bicycle {
    public String modelName;
    public int wheelsCount;

    @Override
    public String toString() {
        return "Модель:" + modelName + '\'' +
                "Количество колес: " + wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

