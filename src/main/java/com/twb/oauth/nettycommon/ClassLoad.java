package com.twb.oauth.nettycommon;

public class ClassLoad {
    public static void main(String[] args) {

        try {
            Class cls = Class.forName("com.twb.oauth.nettycommon.ClassLoad");
            System.out.println("Class = " + cls.getName());

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
}