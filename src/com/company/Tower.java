package com.company;

/**
 * Created by jroberts3136 on 1/16/18.
 */
public class Tower {
    int diskNum;
    int [] source;
    int [] spare;
    int [] target;

    public Tower(int disk){
        diskNum = disk;
        source = new int[diskNum];
        spare = new int [diskNum];
        target = new int[diskNum];

        for (int i = 0; i < diskNum; i++){
            source[i] = i+1;
        }
    }

    public void move(){

    }

    public void sove(){
        
    }
}
