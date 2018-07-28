package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Will only work if a character is repeated less than 5 times - in progress

	    String stringOne = "charactersaaa";
	    String stringTwo = "charactersa";

	    eliminateRepeatedCharacters(stringTwo);
    }

    private static String eliminateRepeatedCharacters(String string) {

        int count = 0;
        List<String> myList = new ArrayList<String>(Arrays.asList(string.split("")));
        List<String> myListTwo = myList;

        for (int i = 0; i < myList.size(); i++) {

            for (int j = 0; j < myList.size(); j++) {

                if(i != j) {

                    if (myList.get(i).equals(myList.get(j))) {

                        myListTwo.remove(j);

                    }
                }

            }

        }

        for (int k = 0; k < myListTwo.size(); k++) {

            System.out.println(myListTwo.get(k));

        }

        return string;

    }
}
