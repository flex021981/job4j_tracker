package ru.job4j.oop.transport;

public class Transport {
    public static void main(String[] args) {
        Train trainOne = new Train();
        Train trainTwo = new Train();
        Object trainObjOne = trainOne;
        Object trainObjTwo = trainTwo;

        Bus busOne = new Bus();
        Bus busTwo = new Bus();
        Object busObjOne = busOne;
        Object busObjTwo = busTwo;

        Airplane airplaneOne = new Airplane();
        Airplane airplaneTwo = new Airplane();
        Object airplaneObjOne = airplaneOne;
        Object airplaneObjTwo = new Airplane();

        Vehicle[] vehicles = new Vehicle[12];
        vehicles[0] = trainOne;
        vehicles[1] = trainTwo;
        vehicles[2] = (Train) trainObjOne;
        vehicles[3] = (Train) trainObjTwo;
        vehicles[4] = busOne;
        vehicles[5] = busTwo;
        vehicles[6] = (Bus) busObjOne;
        vehicles[7] = (Bus) busObjTwo;
        vehicles[8] = airplaneOne;
        vehicles[9] = airplaneTwo;
        vehicles[10] = (Airplane) airplaneObjOne;
        vehicles[11] = (Airplane) airplaneObjTwo;

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
