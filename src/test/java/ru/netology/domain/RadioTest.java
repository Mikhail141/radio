package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();


    @Test
    void getNumberstation() {
        int maxstation = 10;
        int minstation = 0;
        radio.setCurrentNumberstation(3);
        assertEquals(3,radio.getCurrentNumberstation());
    }

    @Test
    void getSound() {
        int maxsound = 100;
        int minsound = 0;
        radio.setCurrentSound(100);
        assertEquals(100,radio.getCurrentSound());
    }


    @Test
    void increaseCurrentNumberstationMax() {
        radio.setCurrentNumberstation(10);
        radio.increaseCurrentNumberstation();
        assertEquals(0,radio.getCurrentNumberstation());

    }

    @Test
    void increaseCurrentNumberstation() {
        radio.setCurrentNumberstation(0);
        radio.increaseCurrentNumberstation();
        assertEquals(1,radio.getCurrentNumberstation());
    }

    @Test
    void decreaseCurrentNumberstationMin() {
        radio.setCurrentNumberstation(0);
        radio.decreaseCurrentNumberstation();
        assertEquals(10,radio.getCurrentNumberstation());
    }

    @Test
    void decreaseCurrentNumberstation(){
        radio.setCurrentNumberstation(8);
        radio.decreaseCurrentNumberstation();
        assertEquals(7,radio.getCurrentNumberstation());
    }

    @Test
    void increaseCurrentSoundMax() {
        radio.setCurrentSound(100);
        radio.increaseCurrentSound();
        assertEquals(100,radio.getCurrentSound());
    }

    @Test
    void increaseCurrentSound(){
        radio.setCurrentSound(7);
        radio.increaseCurrentSound();
        assertEquals(8,radio.getCurrentSound());
    }

    @Test
    void decreaseCurrentSoundMin() {
        radio.setCurrentSound(0);
        radio.decreaseCurrentSound();
        assertEquals(0,radio.getCurrentSound());
    }
    @Test
    void decreaseCurrentSound(){
        radio.setCurrentSound(8);
        radio.decreaseCurrentSound();
        assertEquals(7,radio.getCurrentSound());
    }
}
