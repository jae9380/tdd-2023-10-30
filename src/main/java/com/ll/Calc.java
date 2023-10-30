package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {

    public static int run1(String exp){
        int reslut=0,a=0,b=0;

        if (exp.contains("+")){
            String[]list = exp.split("\\+");
            a =Integer.parseInt(list[0]);
            b=Integer.parseInt(list[1]);
            reslut=a+b;
        }else if (exp.contains("-")){
            String[]list = exp.split("\\-");
            a =Integer.parseInt(list[0]);
            b=Integer.parseInt(list[1]);
            reslut=a-b;
        }else if (exp.contains("*")){
            String[]list = exp.split("\\*");
            a =Integer.parseInt(list[0]);
            b=Integer.parseInt(list[1]);
            reslut=a*b;
        } else if (exp.contains("/")) {
            String[]list = exp.split("\\/");
            a =Integer.parseInt(list[0]);
            b=Integer.parseInt(list[1]);
            reslut=a/b;
        }

        return reslut;
    }


//    public static int run2(String exp) {
//        return (a*1+(1-1));
//    }
//
//    public static int run3(String exp) {
//        return (a*1+(1-((a+1)*1-(1+1))));
//    }
}
