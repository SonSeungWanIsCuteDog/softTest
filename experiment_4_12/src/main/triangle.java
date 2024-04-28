package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author youyujie
 * @Date 2024/4/12 - 13:59
 */
public class triangle {
    public static int a;
    public static int b;
    public static int c;
    public static int max;
    public static int middle;
    public static int min;

    //验证三角形程序
    public static void verifyTriangle(int edg1,int edg2,int edg3){
        //传进来的三条边长从小到大排序
        if(edg1+edg2>edg3){
            //能总成三角形
            if(edg1==edg2 && edg2!=edg3  || edg1==edg3 && edg3!=edg2 || edg2==edg3 && edg3!=edg1){
                if (edg1*edg1+edg2*edg2==edg3*edg3){
                    System.out.println("此三角形为等腰直角三角形");
                }else {
                    System.out.println("此三角形为等腰三角形");
                }
            }else if (edg1==edg2 && edg2==edg3){
                System.out.println("此三角形为等边三角形");
            }else {
                if(edg1*edg1+edg2*edg2==edg3*edg3){
                    System.out.println("此三角形为直角三角形");
                }else {
                    System.out.println("此三角形为普通三角形");
                }
            }
        }else {
            System.out.println("输入的三条边不能组成三角形");
        }
    }

    public static void main(String[] args) {
        while (true){
            //读入代表三角形边长的3个整数
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入代表三角形边长的3个整数");
            try {
                a=scanner.nextInt();
                b=scanner.nextInt();
                c=scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("输入的数据不为整型,请重新输入！");
                continue;
            }
            //判断输入的数据是否为负数
            if (a<=0 || b<=0 ||c<=0){
                System.out.println("输入的数据不能复数，请重新输入！");
                continue;
            }
            //对三个数进行排序操作
            if(a>b){
                if (a>c){
                    max=a;
                    if(b>c){
                        middle=b;
                        min=c;
                    }else {
                        middle=c;
                        min=b;
                    }
                } else {
                    max=c;
                    middle=a;
                    min=b;
                }
            }else {
                if(b>c){
                    max=b;
                    if (a>c){
                        middle=a;
                        min=c;
                    }else {
                        middle=c;
                        min=a;
                    }
                }else {
                    max=c;
                    middle=b;
                    min=a;
                }
            }
            //验证
            verifyTriangle(min,middle,max);
        }

    }
}
