package com.chapter2;

import org.springframework.stereotype.Component;

/**
 * @author lihaocheng
 * @create 2018-06-16 下午9:26
 **/
@Component
public class SgtPeppers implements CompactDisc {
    private String title="AAA";
    private String artist="";

    @Override
    public void paly() {
        System.out.println("name"+title);

    }
}
