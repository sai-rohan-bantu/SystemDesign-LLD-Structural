package com.example.MediaFacade;

import com.example.MediaPlayers.AudioPlayer;
import com.example.MediaPlayers.ImageViewer;
import com.example.MediaPlayers.VideoPlayer;

public class MediaFacade {
    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;
    private final ImageViewer imageViewer;


    public MediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.imageViewer = new ImageViewer();
    }

    public void runMediaPlayer(String playerType) {
        switch (playerType.toLowerCase()) {
            case "audio" -> {
                audioPlayer.initializeAudioDrivers();
                audioPlayer.decodeAudio();
                audioPlayer.startPlayback();
            }
            case "video" -> {
                videoPlayer.setupRenderingEngine();
                videoPlayer.loadVideoFile();
                videoPlayer.playVideo();
            }
            case "image" -> {
                imageViewer.loadImageFile();
                imageViewer.applyScaling();
                imageViewer.displayImage();
            }
            default -> System.out.println("Unsupported media type: " + playerType);
        }
    }
}
