package ru.netology.radioclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int currentVolume = minVolume;

    public Radio(int size) {
        maxStation = minStation + size;
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
        if (newCurrentVolume <= minVolume) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume >= maxVolume) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
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
