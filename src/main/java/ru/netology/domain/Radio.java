package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data



public class Radio {

    private int maxStation ;
    private int maxSound ;
    private int currentNumberstation ;
    private int currentSound ;


    public void increaseCurrentNumberstation() {
        if (currentNumberstation == maxStation) {

            this.currentNumberstation = 0;
            return;
        }
        this.currentNumberstation++;
    }

    public void decreaseCurrentNumberstation() {
        if (currentNumberstation <= 0) {
            this.currentNumberstation = maxStation;
            return;
        }
        this.currentNumberstation--;
    }

    public void increaseCurrentSound() {
        if (currentSound >= maxSound) {

            this.currentSound = maxSound;
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