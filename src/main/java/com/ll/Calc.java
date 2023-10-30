package com.ll;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {

    public static int run1(String exp){
        int result=0,a=0,b=0,option1=0;
        String sign="\\+";
        if (exp.contains("-")){
            option1=1;
            sign="-";
        } else if (exp.contains("*")) {
            option1=2;
            sign="\\*";
        } else if (exp.contains("/")) {
            option1=3;
            sign="/";
        }
        String[]list=exp.split(sign);
        a= Integer.parseInt(list[0]);b=Integer.parseInt(list[1]);
        switch (option1){
            case 0: result=a+b;
                break;
            case 1: result=a-b;
                break;
            case 2: result=a*b;
                break;
            case 3: result=a/b;
                break;
        }
//
//        if (exp.contains("+")){
//            String[]list = exp.split("\\+");
//            a =Integer.parseInt(list[0]);
//            b=Integer.parseInt(list[1]);
//            reslut=a+b;
//        }else if (exp.contains("-")){
//            String[]list = exp.split("\\-");
//            a =Integer.parseInt(list[0]);
//            b=Integer.parseInt(list[1]);
//            reslut=a-b;
//        }else if (exp.contains("*")){
//            String[]list = exp.split("\\*");
//            a =Integer.parseInt(list[0]);
//            b=Integer.parseInt(list[1]);
//            reslut=a*b;
//        } else if (exp.contains("/")) {
//            String[]list = exp.split("\\/");
//            a =Integer.parseInt(list[0]);
//            b=Integer.parseInt(list[1]);
//            reslut=a/b;
//        }
        return result;
    }


    public static int run2(String exp){
        int result =0;

        return result;
    }

}
