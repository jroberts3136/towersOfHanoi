package com.company;

/**
 * Created by jroberts3136 on 1/16/18.
 */
public class Tower {
    /*
    int diskNum;
    String begin;
    String middle;
    String end;
    */

    public Tower() {

    }

    public void solve(int disk, String source, String spare, String target){
        if (disk == 1){
            System.out.println("Move disk from Tower "+source+" to Tower "+target+".");
        }
        else{
            solve(disk-1, source, target, spare);
            System.out.println("Move disk from Tower "+source+" to Tower "+target+".");
            solve(disk-1, spare, source, target);
        }
    }
}
