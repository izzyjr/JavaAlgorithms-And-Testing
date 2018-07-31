package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] arrayPerfect = {10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 10, 10};

        int[] arrayTest = {1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 0, 1, 7, 3, 6, 4, 10, 0, 2, 8, 6};

        bowlingScore(arrayTest);

    }

    private static int bowlingScore(int[] frames) {

        int score = 0;

        for (int i = 0; i < frames.length; i++) {

            if ((i + 1) < frames.length - 1) {

                if (frames[i] + frames[i + 1] < 10) {

                    score += frames[i] + frames[i + 1];
                    System.out.println("Frames[i]: " + frames[i] + " Frames[i + 1]: " + frames[i + 1] + " - Score: " + score);

                }
                else if (frames[i] < 10 && frames[i + 1] < 10) {

                    score += frames[i] + frames[i + 1] + frames[i + 2];
                    System.out.println("Frames[i]: " + frames[i] + " Frames[i + 1]: " + frames[i + 1] + " Frames[i + 2]: " + frames[i + 2] + "  - Score: " + score);


                } else if (frames[i] == 10 || frames[i + 1] == 10) {

                    score += frames[i] + frames[i + 1] + frames[i + 2] + frames[i + 3];
                    System.out.println("Frames[i]: " + frames[i] + " Frames[i + 1]: " + frames[i + 1] + " Frames[i + 2]: " + frames[i + 2] + " Frames[i + 3]: " + frames[i + 3] + "  - Score: " + score);

                }

                i++;

            }

        }

        System.out.println(score);

        return score;

    }
}
