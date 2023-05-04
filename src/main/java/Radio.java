public class Radio {
    private int quantityRadioStations = 10;
    private int maxRadioStation = quantityRadioStations - 1;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    private int currentVolume;

    public Radio(int quantityRadioStations) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentRadioStation = currentRadioStation;
    }

    public Radio() {
        quantityRadioStations = this.quantityRadioStations;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < maxRadioStation && currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        setToMinRadioStation();
        return;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation < maxRadioStation && currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        setToMaxRadioStation();
        return;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            setToMinVolume();
            return;
        }
        if (newCurrentVolume > 100) {
            setToMaxVolume();
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100 && currentVolume > 0) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume < 100 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}


