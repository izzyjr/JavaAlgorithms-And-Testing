package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String one = "a(bc)de";
        //Output: "a(cb)de"

        String two = "a(bcdefghijkl(mno)p)q";
        //Output: "apmnolkjihgfedcbq"


        reverseParentheses(one);

    }

    private static String reverseParentheses(String s) {

        boolean noParLeft = false;
        String array[] = s.split("");
        List<String> stringList = new ArrayList<String>(Arrays.asList(s.split("")));
        List<String> listToManipulate = new ArrayList<String>();
        int[] parArray = startFinishPar(stringList);


        while (!noParLeft) {

            for (int j = 0; j < stringList.size(); j++) {

                if (stringList.get(j).equals("(") || stringList.get(j).equals(")")) {

                    noParLeft = false;
                    System.out.println("hello");

                } else {

                    noParLeft = true;


                }

            }

            for (int k = parArray[0]; k <= parArray[1]; k++) {

                listToManipulate.add(stringList.get(k));

            }

            reverseAndClean(listToManipulate);

            for (int m = 0; m < listToManipulate.size(); m++) {

                stringList.add(parArray[0], listToManipulate.get(m));

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

            tobeReversed.add(increase, tobeReversed.get(lastIndex));
            tobeReversed.remove(lastIndex + 1);
            count++;
            increase++;

        }

        tobeReversed.remove(lastIndex);
        tobeReversed.remove(0);

        for (int j = 0; j < tobeReversed.size(); j++) {

//            System.out.println(tobeReversed.get(j));

        }

        return tobeReversed;

    }

    private static int[] startFinishPar(List<String> toBeReversed) {

        int openParCount = 0;
        int closeParCount = 0;

        int[] startFinish = new int[2];

        for (int i = 0; i < toBeReversed.size(); i++) {

            if (toBeReversed.get(i).equals("(")) {

                openParCount++;

                if (openParCount == 1) {

                    startFinish[0] = i;
//                    System.out.println(startFinish[0]);

                }

            } else if (toBeReversed.get(i).equals(")")) {

                closeParCount++;

                if (closeParCount == openParCount) {

                    startFinish[1] = i;
//                    System.out.println(startFinish[1]);

                }

            }

        }

        return startFinish;
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

