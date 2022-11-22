package de.claudioaltamura.java.java17.sealed.interfaces;

sealed interface Service permits CarService, TruckService {

    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }
}