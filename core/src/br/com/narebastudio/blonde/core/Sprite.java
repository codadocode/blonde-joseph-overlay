package br.com.narebastudio.blonde.core;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Sprite {
    protected Texture textura;
    protected Vector2 posicao;
    protected float textureX;
    protected float textureY;
    protected float textureW;
    protected float textureH;
    protected float largura;
    protected float altura;
    protected boolean flipLargura = false;
    protected boolean flipAltura = false;
    protected float rotacao = 0;
    public Sprite(Texture textura, Vector2 posicao, float textureX, float textureY, float textureW, float textureH, int escalaX, int escalaY)   {
        this.textura = textura;
        this.posicao = posicao;
        this.textureX = textureX;
        this.textureY = textureY;
        this.textureW = textureW;
        this.textureH = textureH;
        this.largura = escalaX;
        this.altura = escalaY;
    }
    public void desenhar(SpriteBatch pincel)   {
        //pincel.draw(textura, (posicao.x - (textureW/2)), (posicao.y - (textureH/2)), textureW/2, textureH/2, textureW, textureH, largura, altura, rotacao, (int)textureX, (int)textureX, (int)textureW, (int)textureH, flipLargura, flipAltura);
        pincel.draw(textura, (posicao.x - (textureW*(largura/2))), (posicao.y - (textureH*(altura/2))), 0, 0, textureW, textureH, largura, altura, rotacao, (int)textureX, (int)textureY, (int)textureW, (int)textureH, flipLargura, flipAltura);
    }
    public void setPosicao(Vector2 pos)   {
        this.posicao = pos;
    }
    public Vector2 getPosicao()   {
        return this.posicao;
    }
    public Texture getTextura()   {
        return this.textura;
    }
    public float getLargura()   {
        return this.largura;
    }
    public float getAltura()   {
        return this.altura;
    }
    public void SetFlipLargura(boolean flip)   {
        this.flipLargura = flip;
    }
    public boolean getFlipLargura()   {
        return this.flipLargura;
    }
    public void flipAltura(boolean flip)   {
        this.flipAltura = flip;
    }
}
