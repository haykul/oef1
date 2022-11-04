package be.intecbrussel;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String mediaType){
        if(mediaType.equals("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {

    }

}
