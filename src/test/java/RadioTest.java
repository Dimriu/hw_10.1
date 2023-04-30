import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentOptionsVolumeRadioStation() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(50);
        Assertions.assertEquals(0, radioStation.getMinVolume());
        Assertions.assertEquals(100, radioStation.getMaxVolume());
        Assertions.assertEquals(50, radioStation.getCurrentVolume());

        radioStation.setCurrentRadioStation(5);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(5, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMinOptionsVolumeRadioStation() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(0);
        Assertions.assertEquals(0, radioStation.getMinVolume());
        Assertions.assertEquals(100, radioStation.getMaxVolume());
        Assertions.assertEquals(0, radioStation.getCurrentVolume());

        radioStation.setCurrentRadioStation(0);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxOptionsVolumeRadioStation() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(100);
        Assertions.assertEquals(0, radioStation.getMinVolume());
        Assertions.assertEquals(100, radioStation.getMaxVolume());
        Assertions.assertEquals(100, radioStation.getCurrentVolume());

        radioStation.setCurrentRadioStation(9);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRangeRadioStationVolumeRadioStation() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(50);
        Assertions.assertEquals(0, radioStation.getMinVolume());
        Assertions.assertEquals(100, radioStation.getMaxVolume());
        Assertions.assertEquals(50, radioStation.getCurrentVolume());

        radioStation.setCurrentRadioStation(5);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(5, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMinRangeVolumeRadioStation() {
        Radio radioStation = new Radio(0, 0);
        radioStation.setCurrentVolume(0);
        Assertions.assertEquals(0, radioStation.getMinVolume());
        Assertions.assertEquals(0, radioStation.getMaxVolume());
        Assertions.assertEquals(0, radioStation.getCurrentVolume());

        radioStation.setCurrentRadioStation(0);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(0, radioStation.getMaxRadioStation());
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxRangeVolumeRadioStation() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(100);
        Assertions.assertEquals(0, radioStation.getMinVolume());
        Assertions.assertEquals(100, radioStation.getMaxVolume());
        Assertions.assertEquals(100, radioStation.getCurrentVolume());

        radioStation.setCurrentRadioStation(9);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentOptionsVolumeRadioStationIncrease() {
        Radio radioStation = new Radio(0, 100, 0, 9);

        radioStation.setCurrentVolume(50);
        radioStation.increaseVolume();
        int expectedVolume = 51;
        int actualVolume = radioStation.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);

        radioStation.setCurrentRadioStation(5);
        radioStation.increaseRadioStation();
        int expectedRadioStation = 6;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMinOptionsVolumeRadioStationIncrease() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(0);
        radioStation.increaseVolume();
        int expectedVolume = 1;
        int actualVolume = radioStation.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);

        radioStation.setCurrentRadioStation(0);
        radioStation.increaseRadioStation();
        int expectedRadioStation = 1;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMaxOptionsVolumeRadioStationIncrease() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(100);
        radioStation.increaseVolume();
        int expectedVolume = 100;
        int actualVolume = radioStation.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);

        radioStation.setCurrentRadioStation(9);
        radioStation.increaseRadioStation();
        int expectedRadioStation = 0;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetCurrentRangeVolumeRadioStationIncrease() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(50);
        radioStation.increaseVolume();
        int expectedVolume = 51;
        int actualVolume = radioStation.getCurrentVolume();

        radioStation.setCurrentRadioStation(5);
        radioStation.increaseRadioStation();
        int expectedRadioStation = 6;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMinRangeVolumeRadioStationIncrease() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(0);
        radioStation.increaseVolume();
        int expectedVolume = 1;
        int actualVolume = radioStation.getCurrentVolume();

        radioStation.setCurrentRadioStation(0);
        radioStation.increaseRadioStation();
        int expectedRadioStation = 1;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMaxRangeVolumeRadioStationIncrease() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(100);
        radioStation.increaseVolume();
        int expectedVolume = 100;
        int actualVolume = radioStation.getCurrentVolume();

        radioStation.setCurrentRadioStation(9);
        radioStation.increaseRadioStation();
        int expectedRadioStation = 0;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetCurrentOptionsVolumeRadioStationDecrease() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(50);
        radioStation.decreaseVolume();
        int expectedVolume = 49;
        int actualVolume = radioStation.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);

        radioStation.setCurrentRadioStation(5);
        radioStation.decreaseRadioStation();
        int expectedRadioStation = 4;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMinOptionsVolumeRadioStationDecrease() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(0);
        radioStation.decreaseVolume();
        int expectedVolume = 0;
        int actualVolume = radioStation.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);

        radioStation.setCurrentRadioStation(0);
        radioStation.decreaseRadioStation();
        int expectedRadioStation = 9;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMaxOptionsVolumeRadioStationDecrease() {
        Radio radioStation = new Radio(0, 100, 0, 9);
        radioStation.setCurrentVolume(100);
        radioStation.decreaseVolume();
        int expectedVolume = 99;
        int actualVolume = radioStation.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);

        radioStation.setCurrentRadioStation(9);
        radioStation.decreaseRadioStation();
        int expectedRadioStation = 8;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetCurrentRangeVolumeRadioStationDecrease() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(50);
        radioStation.decreaseVolume();
        int expectedVolume = 49;
        int actualVolume = radioStation.getCurrentVolume();

        radioStation.setCurrentRadioStation(5);
        radioStation.decreaseRadioStation();
        int expectedRadioStation = 4;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMintRangeVolumeRadioStationDecrease() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(0);
        radioStation.decreaseVolume();
        int expectedVolume = 0;
        int actualVolume = radioStation.getCurrentVolume();

        radioStation.setCurrentRadioStation(0);
        radioStation.decreaseRadioStation();
        int expectedRadioStation = 9;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    public void shouldSetMaxRangeVolumeRadioStationDecrease() {
        Radio radioStation = new Radio(100, 10);
        radioStation.setCurrentVolume(100);
        radioStation.decreaseVolume();
        int expectedVolume = 99;
        int actualVolume = radioStation.getCurrentVolume();

        radioStation.setCurrentRadioStation(9);
        radioStation.decreaseRadioStation();
        int expectedRadioStation = 8;
        int actualRadioStation = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }
    
}
