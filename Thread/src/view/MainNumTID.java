package view;

import controller.NumTID;

public class MainNumTID {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new NumTID();
            thread.start();
        }
    }
}
