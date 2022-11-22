package de.claudioaltamura.java.java17.sealed.interfaces;

final class CarService implements Service {

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }

}