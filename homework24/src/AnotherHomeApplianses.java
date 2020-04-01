
    public class AnotherHomeApplianses extends Applianses {
        private double weight;

        public AnotherHomeApplianses(int power, String manufacturer, double weigth) {
            super(power, manufacturer);
            this.weight = weigth;
        }

        @Override
        void plugIn() {
            isOn=true;
        }
    }
