package ex.ex4;

import static org.junit.Assert.*;

public class NurseryDog {

    dog[] Array = new dog[10];
    public void SetDog(dog Doge){
        int i = Doge.getI();
        Array[i] = Doge;
        Doge.setI(i+1);

    }

}