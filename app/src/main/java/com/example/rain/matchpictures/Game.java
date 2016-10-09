package com.example.rain.matchpictures;

import java.util.Random;

/**
 * Created by rain on 2016/10/9.
 */
public class Game {
    private int[] rear;//a array for saving the point

    RandomHelper randomHelper = new RandomHelper();

    public Game() {
        rear = new int[16];
    }

    public int getNumber(int po) {
        return Math.abs(rear[po]) - 1;
    }

    public void setNumber(int po, int num) {
        rear[po] = num;
    }

    public void setNumberToZreo(int po) {
        rear[po] = 0;
    }

    public boolean isempty() {
        for(int i : rear) {
            if(i != 0)
                return false;
        }
        return true;
    }

    public boolean compare(int po1, int po2) {
        if(rear[po1] + rear[po2] == 0)
            return true;
        else
            return false;
    }

    //give -8 ~ -1  and 1 ~ 8 to rear[16]
    public void init() {

        int temp;

        for(int i = 0; i < 16; i++) {
            rear[i] = 0;
        }

        for(int i = 0; i < 16; i++) {

            temp = randomHelper.makeRandom(1, 16);

            while(isExist(temp)){
                temp = temp%16 + 1;
            }

            rear[i] = temp;
        }

        for(int i = 0; i < 16; i++){
            if(rear[i] > 8) {
                rear[i] = rear[i] - 17;
            }
        }

    }

    public boolean isExist(int number) {
        for(int i = 0; i < 16; i++) {
            if(rear[i] == number){
                return true;
            }
        }
        return false;
    }


}
