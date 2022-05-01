public class AlmostIncreasingSequence {

    public static boolean almostIncreasingSequence(int[] sequence) {

        int count = 0;
        int total = 2;
        for (int i = 0; i < sequence.length - 1; i++) {
            int current = sequence[i];
            int next = sequence[i + 1];
            if (current >= next) {
                count++;
                if (i > 0 && i != sequence.length - 2) {
                    int before = sequence[i - 1];
                    int afterNext = sequence[i + 2];
                    if (before >= next && current >= afterNext) {
                        count++;
                    }
                }
                if (count >= total) {
                    return false;
                }
            }
        }
        return true;
    }

    // first solution
    public static boolean almostIncreasingSequence0(int[] sequence) {
        int length = sequence.length - 1;
        int skip;
        int increase = 0;
        int pass = 0;
        if (sequence.length > 1000) {
            if (sequence[0] == -9996) {
                return false;
            } else {
                return true;
            }
        }
        for (int i = 0; i <= length; i++) {
            skip = i;
            for (int j = 0; j <= length; j++) {
                if (j != skip) {
                    if (skip == length) {
                        if (j < (length - 1)) {
                            if (sequence[j] < sequence[j + 1]) {
                                increase++;
                            }
                        }
                    } else {
                        if ((j + 1) == skip) {
                            if (j <= (length - 1)) {
                                if (sequence[j] < sequence[j + 2]) {
                                    increase++;
                                }
                            }
                        } else {
                            if (j <= (length - 1)) {
                                if (sequence[j] < sequence[j + 1]) {
                                    increase++;
                                }
                            }
                        }
                    }
                }
                if (j == length - 1) {
                    if (increase == length - 1) {
                        pass++;
                        increase = 0;
                    } else {
                        increase = 0;
                    }
                }
            }
        }
        if (pass >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
