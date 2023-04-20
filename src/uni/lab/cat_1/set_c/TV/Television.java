package src.uni.lab.cat_1.set_c.TV;

// A television set is characterized by its channels, its volume levels
// and whether it is on or it is off. The instance variables are channel
// number, volume level and on/off state. The television class has a zero
// argument constructor, a method to turn it on or off, a method to set
// its channel, and another method to set its volume level, a method for
// channel up and another method for channel down and a method for volume
// up and another method for volume down. Implement the TV class in a package
// and implement a driver class in another package to test the TV class creating
// an object of TV class. The information about a TV is entered interactively
// through keyboard. A TV has 10000 channels and its volume may vary from level
// one to level ten. The necessary validation should be performed for change of
// channel and change of volume.

public class Television {
    private int channelNum;
    private int volumeLevel;
    private boolean onOff;

    public Television() {
        channelNum = 1;
        volumeLevel = 25;
        onOff = false;
    }

    public void tunrnOnOffState() {
        // if its off it will on and vice versa
        onOff = !onOff;
    }

    public boolean getTunrnOnOffState() {
        return onOff;
    }

    public void setChannel(int channelNum) {
        this.channelNum = channelNum;
    }

    public int getChannel() {
        return channelNum;
    }

    public void channelUp() {
        this.channelNum++;
    }

    public void channelDown() {
        this.channelNum--;
    }

    public void volumeUp() {
        this.volumeLevel++;
    }

    public void volumeDown() {
        this.volumeLevel--;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
