package src.uni.lab.cat_1.set_c.TestTV;

import src.uni.lab.cat_1.set_c.TV.Television;;

public class DriverTelevision {
    public static void getTelevisionInfo(Television television) {
        System.out.println("On/Off: " + television.getTunrnOnOffState());
        System.out.println("Channel Number: " + television.getChannel());
        System.out.println("Volume Level: " + television.getVolumeLevel());
    }

    public static void main(String[] args) {
        Television television = new Television();

        System.out.println("Initial TV Stats");
        getTelevisionInfo(television);

        // turning on the televison
        television.tunrnOnOffState();
        // setting the channel of the television
        television.setChannel(100);
        System.out.println("\nAfter changes");
        getTelevisionInfo(television);

        television.channelUp(); // from 100 to 101
        television.channelDown(); // fromt 101 to 100

        television.volumeUp(); // from 25 to 26
        television.volumeDown(); // from 26 to 25

        System.out.println("\nAfter changes");
        getTelevisionInfo(television);
    }
}
