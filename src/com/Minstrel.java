package com;

import java.io.PrintStream;

/**
 * @author lihaocheng
 * @create 2018-03-16 下午8:27
 **/



public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream=stream;
    }

    public void singBeforeQuest(){
        stream.println("the knight is brave!");

    }
    public void singAfterQuest(){
        stream.println("the knight slay the dargon");
    }

}
