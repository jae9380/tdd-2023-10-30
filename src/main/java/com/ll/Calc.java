package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {

    public static int run1(String exp){
        int reslut=0;
        if (exp.contains("-")){
            String[]list=exp.split("-");
            reslut= Integer.parseInt(list[0])-Integer.parseInt(list[1]);
        }else if (exp.contains("+")){
            String[]list =exp.split("\\+");
            reslut= Integer.parseInt(list[0])+Integer.parseInt(list[1]);
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
