package ru.netology;


public class Radio {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {

        if (currentChannel < 0) {
            return;
        }
        if (currentChannel > 9) {
            return;
        }
        this.currentChannel = currentChannel;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void nextVolume() {
        if (currentVolume >= 10) {
            return;
        }
        currentVolume++;

    }

    public void prevVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume--;
    }

    public void nextRadio() {
        if (currentChannel >= 9) {
            currentChannel = 0;
        } else {
            currentChannel++;
        }
    }

    public void prevRadio() {
        if (currentChannel <= 0) {
            currentChannel = 9;
        } else {
            currentChannel--;
        }
    }

}