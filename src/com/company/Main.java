package com.company;

public class Main {

    public static void main(String[] args) {

        float f = 1.1f;  //1.1在编译中默认是double类型，赋值给float需要转换，由于使用频率高，只需在数字后面+f

        byte a = 0, b = 3;
        byte c = (byte) (a + b);   //  (a+b)默认值是int，赋值给byte还是需要强转


        short s = 23;
        s += 12;  // s+=12  short += 12


        short s1 = 23;
        // s1 = s1 + 12 ;   // 报错的int + short

        System.out.println(Byte.MAX_VALUE);  // 8位  7位 2^7-1=127
        System.out.println(Byte.MIN_VALUE);  //           -2^7=128

        System.out.println(Integer.MAX_VALUE);  // 2147483647 2^31-1
        System.out.println(Integer.MIN_VALUE);   // -2147483648

        System.out.println("" + 'a' + 1);  //字符串+任何其他内容 结果都是字符串
        System.out.println('a' + 1);     // 单个的字符本质是 数字 ASCII码

        int[] array = {'a', 'b', 1, 2}; //单个的字符本质是数字 ASCII码
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // 97 98 1 2

        }

        int x =1,y = 1;
        if(x++==2 & ++y==2) {  //错 对
            x=7; //没有执行
        }
        System.out.println("x="+x+",y=+y"); //2 2



        boolean d= true;
        if (d=false) { // ==判断是否相等 = 赋值  只有布尔类型赋值才可以写在条件判断里面
            System.out.println("a");
        }else if(d) {
            System.out.println(d);
        }else if(!d) {
            System.out.println("c");  // 只要一句话的时候{}可以省略，换句话说：没有{}的时候，就只有随后的的第一行代码是结构中的
        }
        else
            System.out.println("d");






















    }
}
