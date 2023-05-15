public class Radio {
    private int currentRadioStation = 10;
    private int maxRadioStation = currentRadioStation - 1;
    private int minRadioStation = 0;
    private int currentVolume;

    public Radio(int newRadioStation) {
        this.currentRadioStation = newRadioStation;
        this.maxRadioStation = newRadioStation - 1;
        this.minRadioStation = minRadioStation;
    }

    public Radio() {
        currentRadioStation = this.getCurrentRadioStation();
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            setToMinRadioStation();
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            setToMaxRadioStation();
            return;
        }
        this.currentRadioStation = currentRadioStation;
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
