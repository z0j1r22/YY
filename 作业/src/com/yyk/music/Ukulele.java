package com.yyk.music;

import com.yyk.music.Music;

public class Ukulele extends Music {
    public Ukulele(String name){
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.getName()+"使用尤克里里："+"演奏交响曲");
    }
}
