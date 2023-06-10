public class Radio {

    private int quantityRadioStations = 10;
    private int numberMaxRadioStation = quantityRadioStations - 1;
    private int numberMinRadioStation = 0;
    private int numberCurrentRadioStation;
    private int currentVolume;

    public Radio(int quantityRadioStations) {
        this.numberMaxRadioStation = quantityRadioStations - 1;
    }

    public Radio() {
    }

    public void setCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < numberMinRadioStation) {
            setToMinRadioStation();
            return;
        }
        if (newNumberCurrentRadioStation > numberMaxRadioStation) {
            setToMaxRadioStation();
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void setToMaxRadioStation() {
        numberCurrentRadioStation = numberMaxRadioStation;
    }

    public void setToMinRadioStation() {
        numberCurrentRadioStation = numberMinRadioStation;
    }

    public int getCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public int getMaxRadioStation() {
        return numberMaxRadioStation;
    }

    public int getMinRadioStation() {
        return numberMinRadioStation;
    }

    public void increaseRadioStation() {
        if (numberCurrentRadioStation < numberMaxRadioStation && numberCurrentRadioStation > numberMinRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
            return;
        }
        if (numberCurrentRadioStation == numberMinRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
            return;
        }
        setToMinRadioStation();
        return;
    }

    public void decreaseRadioStation() {
        if (numberCurrentRadioStation < numberMaxRadioStation && numberCurrentRadioStation > numberMinRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
            return;
        }
        if (numberCurrentRadioStation == numberMaxRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
            return;
        }
        setToMaxRadioStation();
        return;
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

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }


    public int getCurrentVolume() {
        return currentVolume;
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
