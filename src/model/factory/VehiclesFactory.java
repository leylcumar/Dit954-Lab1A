package model.factory;

import model.Saab95;
import model.Scania;
import model.Vehicles;
import model.Volvo240;

public class VehiclesFactory {

    public Vehicles createVehicle(int response, int x, int y) {
        if (response == 0) {
            return new Volvo240(x, y);
        } else if (response == 1) {
            return new Saab95(x, y);
        } else if (response == 2) {
            return new Scania(x, y);
        } else return null;
    }
}