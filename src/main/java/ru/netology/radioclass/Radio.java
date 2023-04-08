package ru.netology.radioclass;

public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int currentVolume = minVolume;

    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public Radio(int size) {
        maxStation = minStation + size;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int target = currentStation + 1;

        if (target > maxStation) {
            target = 0;
        }
        setCurrentStation(target);

    }

    public void prevStation() {
        int target = currentStation - 1;

        if (target < minStation) {
            target = 9;
        }
        setCurrentStation(target);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void setTomMaxVolume() {
        currentVolume = maxVolume;

    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void increaseVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void decreaseVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }
}