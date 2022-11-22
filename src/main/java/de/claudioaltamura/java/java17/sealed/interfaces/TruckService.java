package de.claudioaltamura.java.java17.sealed.interfaces;

final class TruckService implements Service {

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }

}