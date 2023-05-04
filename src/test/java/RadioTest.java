import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStationCurrent() {
        Radio radioStation = new Radio(10);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationCurrentNoOptions() {
        Radio radioStation = new Radio();
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());

    }

    @Test
    public void shouldSetRadioStationCurrentLessMin() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio volume = new Radio();
        volume.setToMinVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio volume = new Radio();
        volume.setToMaxVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(20);
        int expected = 20;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(102);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncreaseMore() {
        Radio volume = new Radio();
        volume.setCurrentVolume(20);
        volume.increaseVolume();
        int expected = 21;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncreaseLessMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-10);
        volume.increaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncreaseMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(110);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDecreaseLess() {
        Radio volume = new Radio();
        volume.setCurrentVolume(20);
        volume.decreaseVolume();
        int expected = 19;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDecreaseLessMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-10);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDecreaseMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(110);
        volume.decreaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setToMinRadioStation();
        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setToMaxRadioStation();
        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMoreMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(10);
        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationLessMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIncreaseMore() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);
        radioStation.increaseRadioStation();
        int expected = 6;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIncreaseMoreMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.increaseRadioStation();
        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIncreaseMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.increaseRadioStation();
        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationDecreaseLess() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);
        radioStation.decreaseRadioStation();
        int expected = 4;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationDecreaseMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.decreaseRadioStation();
        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationDecreaseMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.decreaseRadioStation();
        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


}
