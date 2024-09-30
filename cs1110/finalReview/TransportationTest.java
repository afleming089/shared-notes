public class TransportationTest {
    public static void main(String[] args) {
        SolarCar x = new SolarCar();
        Bicycle y = new Bicycle();

        System.out.println("Solar car is " + x.fueledBy() + " carries " +
                x.getNumberPassengers() + " passengers.");
        System.out.println("Bicycle is " + y.fueledBy() + " carries " +
                y.getNumberPassengers() + " passengers.");

    }// end main

    static abstract class Transportation {
        private int numberPassengers;

        protected Transportation(int numberPassengers) {
            this.numberPassengers = numberPassengers;
        }

        public int getNumberPassengers() {
            return numberPassengers;
        }

        abstract String fueledBy();
    }

    static class SolarCar extends Transportation {
        SolarCar() {
            super(2);
        }

        @Override
        String fueledBy() {
            return "Solar powered";
        }
    }

    static class Bicycle extends Transportation {
        Bicycle() {
            super(1);
        }

        @Override
        String fueledBy() {
            return "Human power";
        }
    }
}// end TransportationTest1
