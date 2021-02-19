package com.logintegra;

public class StringUtils {

    public String getFirstLetter(String s) {

        if (s == null || s.equals("")) {
            return "";
        }

        return s.substring(0, 1);
    }

    public String getLastLetter (String s){
        if (s == null || s.equals("")) {
            return "";
        }
        return String.valueOf(s.charAt(s.length()-1));
//        return s.substring(s.length()-1);

    }
}
