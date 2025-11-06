package com.example;

import com.example.MediaFacade.MediaFacade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern Example");

        MediaFacade mediaPlayer = new MediaFacade();
        mediaPlayer.runMediaPlayer("audio");
        mediaPlayer.runMediaPlayer("video");
        mediaPlayer.runMediaPlayer("image");
    }
}