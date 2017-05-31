package com.example.wyj.javalib.pattern;

/**
 * Created by WangYajun on 2017/4/28 0028.
 */

public class OffState implements TvState {

    @Override
    public void turnOn() {
        System.out.println("turn On");
    }

    @Override
    public void voiceUp() {

    }

    @Override
    public void voiceDown() {

    }

    @Override
    public void channelPrefer() {

    }

    @Override
    public void channelBehind() {

    }

    @Override
    public void turnOff() {

    }
}
