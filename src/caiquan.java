

import java.util.Random;
import java.util.Scanner;


                 public class caiquan {
                    public class Welcome {
                        public void  sayHello() {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("你叫什么");
                            String name = scanner.next();
                            System.out.println( name + "，欢迎你");

                            System.out.println("*******************");
                            System.out.println("*** 猜拳 ，开始  ***");
                            System.out.println("********************");
                            System.out.println("出拳规则 ： 1.剪刀  2.石头  3.布");
                            System.out.println("请选择对方角色 （1.刘备 2.孙权 3.曹操）：" );

                            int num = scanner.nextInt();
                            switch (num) {
                                case 1:
                                    System.out.println("你选择了刘备对战");
                                    break;
                                case 2:
                                    System.out.println("你选择了孙权对战");
                                    break;
                                case 3:
                                    System.out.println("你选择了曹操对战");
                                    break;

                            }
                            System.out.println("要开始嘛（y/n）");
                            String shifou = scanner.next();
            }
            }


        }


