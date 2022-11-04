package be.intecbrussel;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Play audiotype : " + audioType + ", filename : " + fileName);
        if(audioType.equals("mp3")){

            // case "mp3"

        }else if(audioType.equals("vlc") || audioType.equals("mp4")){

            // case "vlc": case "mp4":

        } else {

            // default

        }
    }
}

