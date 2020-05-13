package br.com.narebastudio.blonde.personagem;

import br.com.narebastudio.blonde.core.Sprite;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.sql.Array;
import java.util.*;

public class BlondeJoseph extends Sprite {
    private AudioPlayback audioPlayback;
    private Random random;
    private Vector2 initialPos;
    private boolean isShaking = false;
    public BlondeJoseph(Texture blondeTexture, Vector2 posicao, float textureX, float textureY, float textureW, float textureH, int escalaX, int escalaY)   {
        super(blondeTexture, posicao, textureX, textureY, textureW, textureH, escalaX, escalaY);
        this.initialPos = posicao;
        this.audioPlayback = new AudioPlayback();
        this.random = new Random();
    }
    public void sendToBlonde(String newMsg)   {
        if (audioPlayback.getMusicList().size() == 0)   {
            //System.out.println(newMsg);
            newMsg = newMsg.replaceAll("[^a-z- ]","");
            String[] palavras = newMsg.split(" ");
            Set<String> filtroPalavras = new HashSet<String>(Arrays.asList(palavras));
            int tmpNumb;
            List<Music> sounds = new ArrayList<Music>();
            for (String carac : filtroPalavras)   {
                //System.out.println(carac);
                switch(carac)   {
                    case "beleza": case "tranquilo": case "de boa": case "sussa": case "firmeza": case "tranquilao": case "eai": case "eae":
                        sounds.add(BlondeSoundSource.louro_beleza_meu_querido);
                        sounds.add(BlondeSoundSource.louro_ta_legal_meu_querido);
                        if (!audioPlayback.checkMusicInList(sounds))   {
                            tmpNumb = random.nextInt(2);
                            switch (tmpNumb)   {
                                case 0:
                                    audioPlayback.addSound(BlondeSoundSource.louro_beleza_meu_querido);
                                    break;
                                case 1:
                                    audioPlayback.addSound(BlondeSoundSource.louro_ta_legal_meu_querido);
                                    break;
                            }
                        }
                        break;
                    case "canta": case "coral": case "cantor": case "cantar":
                        sounds.add(BlondeSoundSource.louro_cantando_macho_man);
                        sounds.add(BlondeSoundSource.louro_cantando_pinga_ni_mim);
                        sounds.add(BlondeSoundSource.louro_cantando_quero_ve_la_sorrir);
                        if (!audioPlayback.checkMusicInList(sounds))   {
                            tmpNumb = random.nextInt(3);
                            switch (tmpNumb)   {
                                case 0:
                                    audioPlayback.addSound(BlondeSoundSource.louro_cantando_macho_man);
                                    break;
                                case 1:
                                    audioPlayback.addSound(BlondeSoundSource.louro_cantando_pinga_ni_mim);
                                    break;
                                case 2:
                                    audioPlayback.addSound(BlondeSoundSource.louro_cantando_quero_ve_la_sorrir);
                                    break;
                            }
                        }
                        break;
                    case "vindo": case "chegando": case "run": case "matar": case "corre": case "demonio":
                        sounds.add(BlondeSoundSource.louro_gritando);
                        sounds.add(BlondeSoundSource.louro_gritando_desesperado);
                        sounds.add(BlondeSoundSource.louro_gritando_segura);
                        if (!audioPlayback.checkMusicInList(sounds))   {
                            tmpNumb = random.nextInt(3);
                            switch (tmpNumb)   {
                                case 0:
                                    audioPlayback.addSound(BlondeSoundSource.louro_gritando);
                                    tmpNumb = random.nextInt(4);
                                    if (tmpNumb == 1)   {
                                        audioPlayback.addSound(BlondeSoundSource.louro_capeta);
                                    }
                                    break;
                                case 1:
                                    audioPlayback.addSound(BlondeSoundSource.louro_gritando_desesperado);
                                    tmpNumb = random.nextInt(4);
                                    if (tmpNumb == 1)   {
                                        audioPlayback.addSound(BlondeSoundSource.louro_capeta);
                                    }
                                    break;
                                case 2:
                                    audioPlayback.addSound(BlondeSoundSource.louro_gritando_segura);
                                    break;
                            }
                        }
                        break;
                    case "verdade": case "sabendo": case "true": case "contaram": case "falaram":
                        sounds.add(BlondeSoundSource.louro_e_mentira_isso_ae);
                        if (!audioPlayback.checkMusicInList(sounds))   {
                            audioPlayback.addSound(BlondeSoundSource.louro_e_mentira_isso_ae);
                        }
                        break;
                    case "bora": case "vamos": case "vamo": case "vai":
                        sounds.add(BlondeSoundSource.louro_vai_tu);
                        if (!audioPlayback.checkMusicInList(sounds))   {
                            audioPlayback.addSound(BlondeSoundSource.louro_vai_tu);
                        }
                        break;
                    case "ama": case "gosta": case "curti":
                        sounds.add(BlondeSoundSource.louro_eu_amo_todo_mundo_cara);
                        if (!audioPlayback.checkMusicInList(sounds))   {
                            audioPlayback.addSound(BlondeSoundSource.louro_eu_amo_todo_mundo_cara);
                        }
                        break;
                    case "mae": case "ana": case "maria": case "dona": case "mamae":
                        sounds.add(BlondeSoundSource.louro_chamando_maria_braga);
                        sounds.add(BlondeSoundSource.louro_chamando_maria_braga_puto);
                        sounds.add(BlondeSoundSource.louro_maria_braga);
                        if (!audioPlayback.checkMusicInList(sounds))   {
                            tmpNumb = random.nextInt(3);
                            switch (tmpNumb)   {
                                case 0:
                                    audioPlayback.addSound(BlondeSoundSource.louro_chamando_maria_braga);
                                    break;
                                case 1:
                                    audioPlayback.addSound(BlondeSoundSource.louro_chamando_maria_braga_puto);
                                    break;
                                case 2:
                                    audioPlayback.addSound(BlondeSoundSource.louro_maria_braga);
                                    break;
                            }
                        }
                        break;
                }
            }
            if (audioPlayback.getMusicList().size() == 0)   {
                sounds.add(BlondeSoundSource.louro_eu_nao_posso_responder_isso_tbm);
                sounds.add(BlondeSoundSource.louro_eu_nao_vou_desenvolver_resposta);
                if (!audioPlayback.checkMusicInList(sounds))   {
                    tmpNumb = random.nextInt(2);
                    switch (tmpNumb)   {
                        case 0:
                            audioPlayback.addSound(BlondeSoundSource.louro_eu_nao_posso_responder_isso_tbm);
                            break;
                        case 1:
                            audioPlayback.addSound(BlondeSoundSource.louro_eu_nao_vou_desenvolver_resposta);
                            break;
                    }
                }
            }
            audioPlayback.start();
        }
    }
    public AudioPlayback getAudioPlayback()   {
        return this.audioPlayback;
    }
    public void update()   {
        if (isShaking)   {
            Vector2 tmpPos = new Vector2(initialPos.x, initialPos.y);
            tmpPos.x += (random.nextInt(4) - random.nextInt(4));
            tmpPos.y += (random.nextInt(4) - random.nextInt(4));
            posicao = tmpPos;
        }
    }
    public void startShakeBlonde()   {
        isShaking = true;
    }
    public void stopShakeBlonde()   {
        isShaking = false;
        posicao = initialPos;
    }
}
