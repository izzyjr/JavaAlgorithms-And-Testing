package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String one = "a(bc)de";
        //Output: "acbde"

        String two = "a(bcdefghijkl(mno)p)q";
        //Output: "apmnolkjihgfedcbq"


        reverseParentheses(one);

    }

    private static String reverseParentheses(String s) {

        int openParCount = 0;
        int closeParCount = 0;
        int openIndex = 0;
        int closeIndex = 0;
        int increase = 0;
        int decrease = 0;
        int countParen = 0;
        String array[] = s.split("");
//        List<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals("(")) {

                openParCount++;
                openIndex = i + 1;

                for (int j = i; j < array.length; j++) {

                    if (array[j].equals("(") || array[j].equals(")")) {

                        openParCount++;
                        closeParCount++;

                        if (openParCount == closeParCount) {

                            closeIndex = j - 1;
                            while (openIndex < closeIndex) {

                                list.add(array[closeIndex]);
                                closeIndex--;

                            }


                        }


                    }

                }


            } else  {

                list.add(array[i]);

            }

        }

        for (int k = 0; k < list.size(); k++) {

            System.out.println(list.get(k));

        }



        return s;

    }
}
