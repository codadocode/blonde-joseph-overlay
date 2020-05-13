package br.com.narebastudio.blonde.personagem;

import br.com.narebastudio.blonde.controller.Controller;
import com.badlogic.gdx.audio.Music;
import java.util.ArrayList;
import java.util.List;

public class AudioPlayback {
    private List<Music> musicList;
    private boolean isStarted;
    public AudioPlayback()   {
        this.musicList = new ArrayList<Music>();
    }
    public void start()   {
        if (musicList.size() > 0)   {
            Music actualSound = musicList.get(0);
            actualSound.play();
            Controller.blonde.startShakeBlonde();
            actualSound.setOnCompletionListener(new Music.OnCompletionListener() {
                @Override
                public void onCompletion(Music music) {
                    Controller.blonde.stopShakeBlonde();
                    musicList.remove(0);
                    start();
                }
            });
        }
    }
    public void addSound(Music newMusic)   {
        musicList.add(newMusic);
    }
    public List<Music> getMusicList()   {
        return this.musicList;
    }
    public boolean checkMusicInList(List<Music> sounds)   {
        for (Music tmpMusic : sounds) {
            if (this.musicList.contains(tmpMusic))   {
                return true;
            }
        }
        return false;
    }
}
