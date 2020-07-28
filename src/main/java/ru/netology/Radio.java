package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public Radio(int currentStation, int maxStation, int minStation, int currentVolume, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public void soundLouder () {
        if (currentVolume == maxVolume) {
            return; {
        currentVolume++; }
        }
    }

    public void soundQuieter () {
        if (currentVolume == minVolume) {
            return; {
        currentVolume--; }
        }
    }

    public void nextStatin () {
        if (currentStation == maxStation) {
            currentStation = minStation; 
            return; {
            }
        }
        currentStation++;
    }


    public void prevStation () {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return; {
            }
        }
        currentStation--;
    }
}
