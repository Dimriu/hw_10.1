public class Radio {

    public int currentVolume;
    public int currentRadio;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setUpVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
        }
        return;
    }

    public void setDownVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100 - 1;
        }
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setToMaxRadio() {
        currentRadio = 9;
    }

    public void setToMinRadio() {
        currentRadio = 1;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 1) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setUpRadio(int newCurrentRadio) {
        if (newCurrentRadio < 9) {
            currentRadio = newCurrentRadio + 1;
        } else {
            currentRadio = 1;
        }
    }

    public void setDownRadio(int newCurrentRadio) {
        if (newCurrentRadio > 1) {
            currentRadio = newCurrentRadio - 1;
        } else {
            currentRadio = 9;
        }
    }

}
