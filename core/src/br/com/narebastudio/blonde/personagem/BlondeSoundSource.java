package br.com.narebastudio.blonde.personagem;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import static com.badlogic.gdx.Gdx.audio;

public class BlondeSoundSource {
    //Saudações
    public static Music louro_beleza_meu_querido;
    public static Music louro_ta_legal_meu_querido;
    //Musicas
    public static Music louro_cantando_macho_man;
    public static Music louro_cantando_pinga_ni_mim;
    public static Music louro_cantando_quero_ve_la_sorrir;
    //Gritos
    public static Music louro_gritando;
    public static Music louro_gritando_desesperado;
    public static Music louro_gritando_segura;
    public static Music louro_gritando_iaaa;
    public static Music louro_capeta;
    //Autoestima
    public static Music louro_eu_amo_todo_mundo_cara;
    public static Music louro_eu_sou_mo_legal;
    //Discordancia
    public static Music louro_e_mentira_isso_ae;
    public static Music louro_vai_tu;
    //Chamando ana maria
    public static Music louro_chamando_maria_braga;
    public static Music louro_chamando_maria_braga_puto;
    public static Music louro_maria_braga;
    //ELSE
    public static Music louro_eu_nao_vou_desenvolver_resposta;
    public static Music louro_eu_nao_posso_responder_isso_tbm;

    public static void loadSounds()   {
        //Load Saudações
        louro_beleza_meu_querido = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_beleza_meu_querido.wav"));
        louro_ta_legal_meu_querido = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_ta_legal_meu_quirido.wav"));
        //Load Music
        louro_cantando_macho_man = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_cantando_macho_man.wav"));
        louro_cantando_pinga_ni_mim = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_cantando_pinga_ni_mim.wav"));
        louro_cantando_quero_ve_la_sorrir = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_cantando_quero_ve_la_sorrir.wav"));
        //Gritos
        louro_gritando = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_gritando.wav"));
        louro_gritando_desesperado = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_gritando_desesperado.wav"));
        louro_gritando_segura = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_gritando_segura.wav"));
        louro_gritando_iaaa = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_gritando_iaaa.wav"));
        louro_capeta = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_capeta.wav"));
        //Autoestima
        louro_eu_amo_todo_mundo_cara = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_eu_amo_todo_mundo_cara.wav"));
        louro_eu_sou_mo_legal = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_eu_sou_mo_legal.wav"));
        //Discordancia
        louro_e_mentira_isso_ae = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_e_mentira_isso_ae.wav"));
        louro_vai_tu = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_vai_tu.wav"));
        //Chamando ana maria
        louro_chamando_maria_braga = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_chamando_maria_braga.wav"));
        louro_chamando_maria_braga_puto = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_chamando_maria_braga_puto.wav"));
        louro_maria_braga = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_maria_braga.wav"));
        //ELSE
        louro_eu_nao_vou_desenvolver_resposta = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_eu_nao_vou_desenvolver_resposta_porque_nao_posso_me_comprometer.wav"));
        louro_eu_nao_posso_responder_isso_tbm = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_desculpa_mas_nao_posso_responder_isso_tambem.wav"));
    }
}
