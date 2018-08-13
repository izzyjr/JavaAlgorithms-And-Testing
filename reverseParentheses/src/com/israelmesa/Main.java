package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String one = "a(bc)de";
        //Output: acbde

        String two = "a(bcdefghijkl(mno)p)q";
        //Output: apmnolkjihgfedcbq"

        String three = "co(de(fight)s)";
        //Output: cosfighted

        String four = "The ((quick (brown) (fox) jumps over the lazy) dog)";
        //Output: The god quick nworb xof jumps over the lazy

        reverseParentheses(four);

    }

    private static String reverseParentheses(String s) {

        boolean passes = false;
        int parenthesisCount;

        List<String> stringList = new ArrayList<String>(Arrays.asList(s.split("")));

        while (!passes) {

            parenthesisCount = parenthesisCount(stringList);

            if (parenthesisCount > 0) {

                copyToBeProcessed(stringList);

                if (parenthesisCount == 0) {

                    passes = true;

                }

            } else if (parenthesisCount == 0) {

                passes = true;

            }

        }

        for (int n = 0; n < stringList.size(); n++) {

            System.out.println(stringList.get(n));

        }

        return s;

    }

    private static List<String> reverseAndClean(List<String> tobeReversed) {

        int count = 0;
        int increase = 0;
        int lastIndex = tobeReversed.size() - 1;

        while (count < tobeReversed.size()) {

            if (tobeReversed.get(lastIndex).equals("(")) {

                String endPar = ")";
                tobeReversed.add(lastIndex, endPar);
                tobeReversed.remove(lastIndex + 1);

            } else if (tobeReversed.get(lastIndex).equals(")")) {

                String endPar = "(";
                tobeReversed.add(lastIndex, endPar);
                tobeReversed.remove(lastIndex + 1);

            }

            tobeReversed.add(increase, tobeReversed.get(lastIndex));
            tobeReversed.remove(lastIndex + 1);
            count++;
            increase++;

        }

        tobeReversed.remove(lastIndex);
        tobeReversed.remove(0);

//        for (int j = 0; j < tobeReversed.size(); j++) {
//
//            System.out.println(tobeReversed.get(j));
//
//        }

        return tobeReversed;

    }

    private static List<String> copyToBeProcessed(List<String> toBeReversed) {

        List<String> listToProcess = new ArrayList<String>();
        int openParCount = 0;
        int closeParCount = 0;
        int start = 0;
        int finish = 0;

        for (int i = 0; i < toBeReversed.size(); i++) {

            if (toBeReversed.get(i).equals("(")) {

                openParCount++;

                if (openParCount == 1) {

                    start = i;

                }

            } else if (toBeReversed.get(i).equals(")")) {

                closeParCount++;

                if (closeParCount == openParCount) {

                    finish = i;

                }

            }

            if (closeParCount == 1 && openParCount == 1) {

                finish = i;
                break;

            }

        }

        for (int k = finish; k >= start; k--) {

            listToProcess.add(0, toBeReversed.get(k));
            toBeReversed.remove(k);

        }

        reverseAndClean(listToProcess);

        for (int m = listToProcess.size() - 1; m >= 0 ; m--) {

        toBeReversed.add(start, listToProcess.get(m));

        }


        return toBeReversed;
    }


    private static int parenthesisCount(List<String> toBeReversed) {

        int parCount = 0;

        for (int i = 0; i < toBeReversed.size(); i++) {

            if (toBeReversed.get(i).equals("(") || toBeReversed.get(i).equals(")")) {

                parCount++;

            }

        }

//        System.out.println("parCount: " + parCount);
        return parCount;

    }

}










































//while (!passes) {
//
//        for (int j = 0; j < stringList.size(); j++) {
//
//        if (stringList.get(j).equals("(") || stringList.get(j).equals(")")) {
//
//        parCount++;
//
//        }
//
//        }
//
//        if (parCount > 0) {
//
//        int[] parArray = startFinishPar(stringList);
//
//        for (int k = parArray[1]; k >= parArray[0]; k--) {
//
//        listToManipulate.add(0, stringList.get(k));
//        stringList.remove(k);
//
//        }
//
//        reverseAndClean(listToManipulate);
//        parCount = parCount - 2;
//
//        for (int m = listToManipulate.size() - 1; m >= 0 ; m--) {
//
//        stringList.add(parArray[0], listToManipulate.get(m));
//
//        }
//
//        if (parCount == 2) {
//
//        parArray = startFinishPar(stringList);
//        System.out.println(parArray[0] + " - " + parArray[1]);
//        passes = true;
//
//        }
//
//
//        } else if (parCount == 2){
//
//        passes = true;
//
//        }
//
//        }








