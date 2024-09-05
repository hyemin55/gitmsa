package org.pmh.components;

//    스프링 프레임워크를 사용하지 않은 싱클톤
public class CC {

    private static CC cc = new CC();
    public static CC getInstance(){
        if(cc==null)
            cc = new CC();
        return cc;
    }
}
