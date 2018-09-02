package com.lianggzone.lambdas;

import com.sun.deploy.util.StringUtils;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        String[] strs = convert("liang#gzone", s -> StringUtils.splitString(s, "#"));
        for(String s : strs){
            System.out.println(s);
        }

    }

    public static String[] convert(String str, Function<String, String[]> f) {
        return f.apply(str);
    }
}
