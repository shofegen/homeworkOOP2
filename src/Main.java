import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car carToyota = new Car("Avensis", 4);
        Car carFord = new Car("Mondeo", 4);

        Truck truckVolvo = new Truck("FH 460", 6);
        Truck truckSkania = new Truck("G-series", 8);

        Bicycle bicycleStels = new Bicycle("512", 2);
        Bicycle bicycleOlimpic = new Bicycle("520", 2);
        ServiceStationAll[] serviceStationAlls = {
                (ServiceStationAll) carToyota,
                (ServiceStationAll) carFord,
                (ServiceStationAll) truckVolvo,
                (ServiceStationAll) truckSkania,
                (ServiceStationAll) bicycleStels,
                (ServiceStationAll) bicycleOlimpic
        };
        ServiceStation station = new ServiceStation();
        for (ServiceStationAll serviceStationAll : serviceStationAlls) {
            station.check(serviceStationAll);
        }
    }
}
