package Test8_23_2;

import java.util.HashSet;

public class Numlist {
    HashSet<Integer> hashSet=new HashSet<>(10);
    public HashSet getNumlist(){
      while (hashSet.size()<10){

          hashSet.add((int) ((Math.random()*20)+1));
      }
        return hashSet;
    }
}
