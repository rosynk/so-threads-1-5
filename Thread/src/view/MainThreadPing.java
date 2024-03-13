package view;

import controller.ThreadPing;
public class MainThreadPing {
    public static void main(String[] args) {
        Thread[] pings = new ThreadPing[3];

        pings[0] = new ThreadPing("www.google.com.br");
        pings[1] = new ThreadPing("www.uol.com.br");
        pings[2] = new ThreadPing("www.terra.com.br");

        for (Thread ping : pings) {
            ping.start();
        }
    }
}