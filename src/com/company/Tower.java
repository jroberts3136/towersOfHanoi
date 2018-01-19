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
    int count = 0;

    public Tower() {

    }

    public void solve(int disk, String source, String spare, String target){
        if (disk == 1){
            count++;
            System.out.println(count+": Move disk from Tower "+source+" to Tower "+target+".");
        }
        else{
            solve(disk-1, source, target, spare);
            count++;
            System.out.println(count+": Move disk from Tower "+source+" to Tower "+target+".");
            solve(disk-1, spare, source, target);
        }
    }
}
