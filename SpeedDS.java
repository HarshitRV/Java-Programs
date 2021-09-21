class SpeedDS {
    public static void main(String[] args) {
        long lightspeed = 186000;
        long distance, days = 1000;
        long days_in_seconds = days * 24 * 60 * 60;

        distance = lightspeed * days_in_seconds;
        System.out.println("Distance : "+ distance);
    }
}