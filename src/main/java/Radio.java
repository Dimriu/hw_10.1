public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 50;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;

    public Radio(int minVolume, int maxVolume, int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = minRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int level, int size) {
        this.maxVolume = level;
        if (size == 0) {
            this.maxRadioStation = size;
            return;
        }
        this.maxRadioStation = size - 1;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < maxRadioStation && currentRadioStation >= minRadioStation) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        setToMinRadioStation();
        return;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume && currentVolume >= minVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation <= maxRadioStation && currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        setToMaxRadioStation();
        return;
    }

    public void decreaseVolume() {
        if (currentVolume <= maxVolume && currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            setToMinVolume();
            return;
        }
        if (newCurrentVolume > maxVolume) {
            setToMaxVolume();
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            setToMinRadioStation();
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            setToMaxRadioStation();
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = minRadioStation;
    }


}


