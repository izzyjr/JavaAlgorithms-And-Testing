package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Method works - Codefights inspired self challenge

	    String stringOne = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
	    String stringTwo = "characters";
	    String stringThree = "aaaaaaaaaaaaaaaa";

	    eliminateRepeatedCharacters(stringOne);
    }

    private static String eliminateRepeatedCharacters(String string) {

        List<String> myList = new ArrayList<String>(Arrays.asList(string.split("")));

        for (int i = 0; i < myList.size(); i++) {

            for (int j = 0; j < myList.size(); j++) {

                if(i != j) {

                    if (myList.get(i).equals(myList.get(j))) {

                        myList.remove(j);
                        j = 0;

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
