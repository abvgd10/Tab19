package com.company;

import java.util.Random;

public abstract class Randomy {

    Random random = new Random();
    byte kandaiUydo = (byte) random.nextInt(1,3);

    byte objtAdam = (byte) random.nextInt(1,4); // 4-тон ашык адам кысылып калат

    byte gostAdam = (byte) random.nextInt(1,7);

    byte kvartAdam = (byte) random.nextInt(1,7);// 8-тон ашык адам кысылып калат
}
