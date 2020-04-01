public class Time {

    private int min;
    private int hours;
    private int fullSEC;
    private int num;

    public Time(int sec, int min, int hours, int num) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
        this.num = num;

        this.fullSEC = fullSEC;
        this.num = num;
    }

    public int giveMeFullSec() {

        if (fullSEC != 0) {
            return fullSEC;
        } else {
            int sec;
        }

        @Override
        public String toString () {
            return "Значение в объекте " + num + " = " +
                    "interval{" +
                    "секунды ='" + sec + '\'' +
                    ", минуты ='" + min + '\'' +
                    ", часы ='" + hours + '\'' +
                    ", время в секундах =" + fullSEC +
                    '}';
        }
    }
}
