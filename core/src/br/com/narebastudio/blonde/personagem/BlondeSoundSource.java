package br.com.narebastudio.blonde.personagem;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import static com.badlogic.gdx.Gdx.audio;

public class BlondeSoundSource {
    public static boolean is2077 = false;
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
    public static Music louro_capeta;
    //Autoestima
    public static Music louro_eu_amo_todo_mundo_cara;
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
        if (!is2077)   {
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
            louro_capeta = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_capeta.wav"));
            //Autoestima
            louro_eu_amo_todo_mundo_cara = audio.newMusic(Gdx.files.internal("sounds/blonde/louro_eu_amo_todo_mundo_cara.wav"));
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
        }else   {
            //Load Saudações
            louro_beleza_meu_querido = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_beleza_meu_querido_2077.wav"));
            louro_ta_legal_meu_querido = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_ta_legal_meu_quirido_2077.wav"));
            //Load Music
            louro_cantando_macho_man = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_cantando_macho_man_2077.wav"));
            louro_cantando_pinga_ni_mim = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_cantando_pinga_ni_mim_2077.wav"));
            louro_cantando_quero_ve_la_sorrir = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_cantando_quero_ve_la_sorrir_2077.wav"));
            //Gritos
            louro_gritando = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_gritando_2077.wav"));
            louro_gritando_desesperado = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_gritando_desesperado_2077.wav"));
            louro_gritando_segura = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_gritando_segura_2077.wav"));
            louro_capeta = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_capeta_2077.wav"));
            //Autoestima
            louro_eu_amo_todo_mundo_cara = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_eu_amo_todo_mundo_cara_2077.wav"));
            //Discordancia
            louro_e_mentira_isso_ae = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_e_mentira_isso_ae_2077.wav"));
            louro_vai_tu = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_vai_tu_2077.wav"));
            //Chamando ana maria
            louro_chamando_maria_braga = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_chamando_maria_braga_2077.wav"));
            louro_chamando_maria_braga_puto = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_chamando_maria_braga_puto_2077.wav"));
            louro_maria_braga = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_maria_braga_2077.wav"));
            //ELSE
            louro_eu_nao_vou_desenvolver_resposta = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_eu_nao_vou_desenvolver_resposta_porque_nao_posso_me_comprometer_2077.wav"));
            louro_eu_nao_posso_responder_isso_tbm = audio.newMusic(Gdx.files.internal("sounds/blonde2077/louro_desculpa_mas_nao_posso_responder_isso_tambem_2077.wav"));
        }
    }
}
