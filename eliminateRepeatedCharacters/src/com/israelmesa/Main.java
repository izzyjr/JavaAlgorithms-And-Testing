package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    String string = "eeeee";

	    eliminateRepeatedCharacters(string);
    }

    private static String eliminateRepeatedCharacters(String string) {

        int count = 0;
        List<String> myList = new ArrayList<String>(Arrays.asList(string.split("")));
        List<String> myListTwo = myList;

        for (int i = 0; i < myList.size(); i++) {

            for (int j = 0; j < myList.size(); j++) {

                if(i != j) {

                    if (myList.get(i).equals(myListTwo.get(j))) {

                            myList.remove(j);

                    }

                }

            }

        }

        for (int k = 0; k < myList.size(); k++) {

            System.out.println(myList.get(k));

        }

        return string;

    }
}
