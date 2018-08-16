package com.observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * @program: First_Spring_application
 * @description: 男孩偷看女孩的主类
 * @author: XU Chang Heng
 * @create: 2018-08-16 10:27
 **/
public class BoyObserverGirl {
    private Girl girl=null;
    private ArrayList<Boy> boys=new ArrayList<Boy>();

    //无参构造方法
    public BoyObserverGirl() {

        girl=new Girl("MM");

        Boy boyA=new Boy("小A");
        Boy boyB=new Boy("小B");
        Boy boyC=new Boy("小C");
        Boy boyD=new Boy("小D");



        boys.add(boyA);
        boys.add(boyB);
        boys.add(boyC);
        boys.add(boyD);


        /**
         * 观察者模式的队列估计是堆栈的形式添加进去，出来的时候是倒叙？？？
         *
         * 加入对象，输出顺序反了。
         */
        girl.addObserver(boyA);
        girl.addObserver(boyB);
        girl.addObserver(boyC);
        girl.addObserver(boyD);

        girl.doSomething("脱衣服...");
        girl.doSomething("洗澡...");
        girl.doSomething("感觉有人偷看！？停止洗澡，穿上衣服，开始搜查...");

        girlSearchBadBoy();

        //搞定！继续洗澡
        girl.doSomething("再次脱衣服...");
        girl.doSomething("再次洗澡...");
    }

    private void girlSearchBadBoy()
    {
        Random rand=new Random();

        int unluckyNumber=rand.nextInt( girl.countObservers() );
        Boy unluckyBoy=boys.get(unluckyNumber);

        System.out.println(unluckyBoy.getName()+" 暴露，踢出去！");
        girl.deleteObserver(unluckyBoy);
    }


    public static void main(String[] args) {
        new BoyObserverGirl();
    }
}

