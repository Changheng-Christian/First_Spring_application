package com.observer;

/**
 * @program: First_Spring_application
 * @description: 主函数入口
 * @author: XU Chang Heng
 * @create: 2018-08-16 09:29
 **/
public class Main {
    public static void main(String[] args) {

        Antique house = new Antique(1222f);
        People p1 = new People("p1");
        People p2 = new People("p2");
        People p3 = new People("p3");
        p1.setName("p1");
        p2.setName("p2");
        p3.setName("p3");
        house.addObserver(p1);
        house.addObserver(p2);
        house.addObserver(p3);



//        p1.getName();


        // 输出价格
        System.out.println(house+"");
        house.setPrice(111f);
        // 输出价格
        System.out.println(house+"");
    }



/*    作者：無名小子的杂货铺
    链接：https://www.jianshu.com/p/109eb51accb9
    來源：简书
    简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。*/
}

