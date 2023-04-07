package ru.netology.radioclass;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
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
        setCurrentStation(target);

    }

    public void prevStation() {
        int target = currentStation - 1;
        setCurrentStation(target);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void setTomMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
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