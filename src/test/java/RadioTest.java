import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(15);
        int expected = 15;
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
    public void shouldSetToMinVolume() {
        Radio volume = new Radio();
        volume.setToMinVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setUpVolume(101);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpVolumeLessMax() {
        Radio volume = new Radio();
        volume.setUpVolume(70);
        int expected = 71;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeLessMin() {
        Radio volume = new Radio();
        volume.setDownVolume(-10);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeMoreMin() {
        Radio volume = new Radio();
        volume.setDownVolume(50);
        int expected = 49;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setDownVolume(110);
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(7);
        int expected = 7;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadio() {
        Radio radio = new Radio();
        radio.setToMaxRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadio() {
        Radio radio = new Radio();
        radio.setToMinRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpRadioMoreMax() {
        Radio radio = new Radio();
        radio.setUpRadio(10);
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpRadioLessMax() {
        Radio radio = new Radio();
        radio.setUpRadio(6);
        int expected = 7;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownRadioLessMin() {
        Radio radio = new Radio();
        radio.setDownRadio(0);
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownRadioMoreMin() {
        Radio radio = new Radio();
        radio.setDownRadio(5);
        int expected = 4;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }


}
