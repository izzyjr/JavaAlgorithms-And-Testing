package com.israelmesa;

public class Main {

    public static void main(String[] args) {


        int[] one = {50, 60, 60, 45, 70};
        //Output [180, 105]

        alternatingSums(one);


    }

    private static int[] alternatingSums(int[] arrayOfWeights) {

        int[] weightsAdded = new int[2];

        for (int i = 0; i < arrayOfWeights.length; i++) {

            if (i % 2 == 0) {

                weightsAdded[0] += arrayOfWeights[i];

            } else if (i % 2 == 1) {

                weightsAdded[1] += arrayOfWeights[i];

            }

        }

        for (int j = 0; j < weightsAdded.length; j++) {

            System.out.println(weightsAdded[j]);

        }

        return weightsAdded;

    }

}
