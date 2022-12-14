package com.mavenit.ui.utilis;

import java.util.Random;

public class NumberHelper {

    public int randomNumber(int size){
        Random random = new Random(); // by using random class we are generating random index
        return random.nextInt(size-1);

    }
}
