package br.com.narebastudio.blonde.core.module;

import com.badlogic.gdx.Gdx;

public class Timer {
    private float targetTime;
    private float actualTime;
    private boolean isStarted;
    private boolean isPaused;
    private boolean isFinished;
    public Timer(float targetTime)   {
        this.targetTime = targetTime;
        actualTime = 0;
        isStarted = false;
        isPaused = false;
        isFinished = false;
    }
    public Timer()   {
        this.targetTime = 0;
        actualTime = 0;
        isStarted = false;
        isPaused = false;
        isFinished = false;
    }
    public void startTimer()   {
        if (!isStarted && targetTime > 0)   {
            isStarted = true;
        }
    }
    public void pauseTimer()   {
        if (isStarted)   {
            if (isPaused)   {
                isPaused = false;
            }else  {
                isPaused = true;
            }
        }
    }
    public void stopTimer()   {
        isStarted = false;
        isPaused = false;
        isFinished = false;
        actualTime = 0;
    }
    public void update()   {
        if (isStarted && !isPaused && !isFinished)   {
            if (actualTime < targetTime)   {
                actualTime += Gdx.graphics.getDeltaTime();
            }else   {
                if (!isFinished)   {
                    isFinished = true;
                }
            }
        }
    }
    public boolean checkFinished()   {
        if (isStarted && isFinished)   {
            return true;
        }
        return false;
    }
    public float getActualTime()   {
        return this.actualTime;
    }
    public void setTargetTime(float targetTime)   {
        this.targetTime = targetTime;
    }
}
