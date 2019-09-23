package com.yyk.music;

public class Erhu extends Music{
    public Erhu(String name){
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.getName()+"使用二胡"+"演奏命运交响曲");
    }
}
