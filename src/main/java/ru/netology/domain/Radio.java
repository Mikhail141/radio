package ru.netology.domain;

public class Radio {

    private int currentNumberstation;
    private int currentSound;



    public int getCurrentNumberstation() {
        return currentNumberstation;
    }

    public void setCurrentNumberstation(int currentNumberstation) {
        this.currentNumberstation = currentNumberstation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
    }

    public void increaseCurrentNumberstation() {
        if (currentNumberstation == 10) {

            this.currentNumberstation = 0;
            return;
        }
        this.currentNumberstation++;
    }

    public void decreaseCurrentNumberstation() {
        if (currentNumberstation <= 0) {
            this.currentNumberstation = 10;
            return;
        }
        this.currentNumberstation--;
    }

    public void increaseCurrentSound() {
        if (currentSound >= 100) {

            this.currentSound = 100;
            return;
        }
        this.currentSound++;
    }

    public void decreaseCurrentSound() {
        if (currentSound == 0) {

            this.currentSound = 0;
            return;
        }
        this.currentSound --;

    }
}
