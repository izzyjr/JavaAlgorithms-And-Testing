package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] arrayPerfect = {10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 10, 10};
        //300

        int[] arrayTest = {1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 0, 1, 7, 3, 6, 4, 10, 0, 2, 8, 6};
        // 133

        bowlingScore(arrayPerfect);

    }

    private static int bowlingScore(int[] frames) {

        int frame = 1;
        int score = 0;
        int increase = 0;
        int extraThrows = 0;

        for (int i = 0; i < frames.length; i++) {

            if ((i + 1) < frames.length - 1) {

                if (frames[i] + frames[i + 1] < 10) {

                    score += frames[i] + frames[i + 1];
                    System.out.println("Frame:" + frame + " - First: " + frames[i] + " Second: " + frames[i + 1] + " - Score: " + score);

                }
                else if (frames[i] < 10 && frames[i + 1] < 10) {

                    score += frames[i] + frames[i + 1] + frames[i + 2];
                    System.out.println("Frame:" + frame + " - First: " + frames[i] + " Second: " + frames[i + 1] + " - Bonus: " + frames[i + 2] + "  - Score: " + score);


                } else if (frames[i] == 10 || frames[i + 1] == 10) {

                    score += frames[i] + frames[i + 1];
                    System.out.println("Frame:" + frame + " - Strike: " + frames[i] + " Or " + frames[i + 1] + " - Score: " + score);

                    //int[] arrayTest = {1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 0, 1, 7, 3, 6, 4, 10, 0, 2, 8, 6};

                    //int[] arrayPerfect = {10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 10, 10};

                    while (extraThrows != 2) {

                        if (frames[i + 1 + increase] == 10 || frames[i + 2 + increase] == 10) {

                            score += frames[i + 1 + increase] + frames[i + 2 + increase];
                            increase++;
                            extraThrows++;
                            System.out.println("Frame:" + frame + " Bonus: " + frames[i + 1 + increase] + " Or " + frames[i + 2 + increase] + " - Score: " + score);

                        } else {

                            while (extraThrows != 2) {

                                increase++;
                                extraThrows++;
                                score += frames[i + 1 + increase];
                                System.out.println("Frame:" + frame + " Bonus" + increase + ": " + frames[i + 1 + increase] + " - Score: " + score);

                            }

                        }

                    }

                }

                increase = 0;
                extraThrows = 0;
                i++;
                frame++;

            }

        }

        System.out.println(score);
        return score;

    }
}






















//                        if (frames[i + bonus] == 0) {
//
//                            score += frames[i + bonus];
//                            extraThrows++;
//                            bonus++;
//                            System.out.println(frames[i + bonus]);
//
//                            if (frames[i + 1 + bonus] == 10 || frames[i + 2 + bonus] == 10) {
//
//                                extraThrows--;
//
//                            } else {
//
//                                extraThrows++;
//
//                            }
//
//                        } else {
//
//                            score += frames[i + bonus];
//                            extraThrows++;
//                            bonus++;
//                            System.out.println(frames[i + bonus]);
//
//                        }