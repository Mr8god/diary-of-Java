package cn.mr8god.example;

/**
 * @author
 * @date
 * @time
 */
public class ExTester {
    public static void main(String[] args) {
        //1
        Integer a=new Integer(123);
        Integer b=new Integer(123);
        System.out.println(a==b);//输出 false

        //2
        Integer c=123;
        Integer d=123;
        System.out.println(c==d);//输出 true

        //3
        Integer e=129;
        Integer f=129;
        System.out.println(e==f);//输出 false
        //4
        int g=59;
        Integer h=new Integer(59);
        System.out.println(g==h);//输出 true
    }
}
