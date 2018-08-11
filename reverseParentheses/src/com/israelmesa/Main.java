package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String one = "(abcde)";
        //Output: "a(cb)de"

        String two = "a(bcdefghijkl(mno)p)q";
        //Output: "apmnolkjihgfedcbq"


        reverseParentheses(one);

    }

    private static String reverseParentheses(String s) {

        int openPar = 0;
        int closePar = 0;
        String array[] = s.split("");
        List<String> stringList = new ArrayList<String>(Arrays.asList(s.split("")));
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < stringList.size(); i++) {

            if (stringList.get(i).equals("(")) {

                list.add(stringList.get(i));

            }

        }

        reverseAndClean(stringList);

        return s;

    }

    private static List<String> reverseAndClean(List<String> tobeReversed) {

        int count = 0;
        int increase = 0;
        int lastIndex = tobeReversed.size() - 1;

        while (count < tobeReversed.size()) {

            tobeReversed.add(increase, tobeReversed.get(lastIndex));
            tobeReversed.remove(lastIndex + 1);
            count++;
            increase++;

        }

        tobeReversed.remove(lastIndex);
        tobeReversed.remove(0);

        for (int j = 0; j < tobeReversed.size(); j++) {

            System.out.println(tobeReversed.get(j));

        }

        return tobeReversed;

    }

}



















































//    private static String reverseParentheses(String s) {
//
//        int openParCount = 0;
//        int closeParCount = 0;
//        int openIndex;
//        int closeIndex = 0;
//        int increase = 0;
//        int decrease;
//        int countParen = 0;
//        String array[] = s.split("");
////        List<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
//        List<String> list = new ArrayList<String>();
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i].equals("(")) {
//
//                openParCount++;
//                openIndex = i + 1;
//
//                for (int j = i + 1; j < array.length; j++) {
//
//                    if (array[j].equals("(")) {
//
//                        openParCount++;
//
//                    } else if (array[j].equals(")")) {
//
//                        closeParCount++;
//
//                    }
//
//                    if (openParCount == closeParCount && openParCount > 0 && closeParCount > 0) {
//
////                        System.out.println(openParCount +  " - " + closeParCount);
//
//                        closeIndex = j;
//                        decrease = j - 1;
//
//                        while (openIndex <= decrease) {
//
//                            list.add(array[decrease]);
//                            decrease--;
//                            openParCount = 0;
//                            closeParCount = 0;
//
//                        }
//
//                    }
//
//                }
//
//                i = closeIndex;
//
//            } else  {
//
//                list.add(array[i]);
//
//            }
//
//        }
//
//        for (int k = 0; k < list.size(); k++) {
//
//            System.out.println(list.get(k));
//
//        }
//
//
//
//        return s;
//
//    }

