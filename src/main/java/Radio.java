public class Radio {
    private int currentVolume;
    private int currentRadioStation;

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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            setToMinRadioStation();
            return;
        }
        if (newCurrentRadioStation > 9) {
            setToMaxRadioStation();
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < 9 && currentRadioStation > 0) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        setToMinRadioStation();
        return;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation < 9 && currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        setToMaxRadioStation();
        return;
    }
}


