package com.israelmesa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String string = "characters";
        String btring = "characters";
	    eliminateRepeatedCharacters(string);
    }

    private static String eliminateRepeatedCharacters(String string) {

        ArrayList<String> list = new ArrayList<String>();

        String[] array = string.split("");

        int count = 0;
        int increase = 0;

        for (int i = 0; i < array.length; i++) {

            list.add(array[i]);

        }

        for (int j = 0; j < list.size(); j++) {

            for (int m = 0; m < list.size(); m++) {

                if (list.get(j).equals(array[m])) {

                    increase++;
                    if (increase > 1) {

                        list.remove(j);
                        count++;

                    }

                }

            }

            increase = 0;

        }

        String arrayTwo[] = new String[array.length];

        for(int k = 0; k < list.size(); k++) {

            System.out.println(list.get(k));

        }

//        String wow = arrayTwo.toString();
//
//        System.out.println(wow);
//
//        return wow;

        return string;

    }
}
