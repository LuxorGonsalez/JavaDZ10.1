package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class RadioTest {
    Radio radio = new Radio();


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rado.csv")

    public void shouldSetCurrentRadioStation(int currentChannel, int expected) {
        radio.setCurrentChannel(currentChannel);
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "0,1",
            "9,0"
    })
    public void shouldNextRadioStation(int currentChanel, int expected) {
        radio.setCurrentChannel(currentChanel);
        radio.nextRadio();
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "4,3",
            "9,8",
            "0,9"
    })
    public void shouldPrevRadioStation(int currentChanel, int expected) {
        radio.setCurrentChannel(currentChanel);
        radio.prevRadio();
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volume.csv")

    public void shouldSetCurrentVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @ParameterizedTest
    @CsvSource({
            "5,6",
            "0,1",
            "10,10"
    })

    public void shouldPlusVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.nextVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "1,0",
            "0,0",
            "10,9"

    })

    public void shouldMinusVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.prevVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}

