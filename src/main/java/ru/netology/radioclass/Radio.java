package ru.netology.radioclass;

public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int maxStation, int minStation, int currentStation, int maxVolume, int minVolume, int currentVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getMaxStation() {
        return this.maxStation;
    }

    public int getMinStation() {
        return this.minStation;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getMaxStation() != other.getMaxStation()) {
                return false;
            } else if (this.getMinStation() != other.getMinStation()) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else if (this.getMaxVolume() != other.getMaxVolume()) {
                return false;
            } else if (this.getMinVolume() != other.getMinVolume()) {
                return false;
            } else {
                return this.getCurrentVolume() == other.getCurrentVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getMaxStation();
        result = result * 59 + this.getMinStation();
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getMaxVolume();
        result = result * 59 + this.getMinVolume();
        result = result * 59 + this.getCurrentVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getMaxStation();
        return "Radio(maxStation=" + var10000 + ", minStation=" + this.getMinStation() + ", currentStation=" + this.getCurrentStation() + ", maxVolume=" + this.getMaxVolume() + ", minVolume=" + this.getMinVolume() + ", currentVolume=" + this.getCurrentVolume() + ")";
    }
}
