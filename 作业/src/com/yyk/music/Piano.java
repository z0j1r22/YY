package com.yyk.music;

public class Piano extends Music {
    public Piano(String name){
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.getName()+"使用钢琴："+"演奏交响曲");
    }
}
