public class CenturyFromYear {

    public static int centuryFromYear(int year) {
        if (year % 100 == 0){
            return year/100;
        } else {
            return year/100 + 1;
        }
    }

    public static int centuryFromYear0(int year) {
        if (year > 100) {
            int century = year/100;
            int stepTwo = century * 100;
            int stepThree = year - stepTwo;
            if (stepThree >= 1) {
                return century + 1;
            } else {
                return century;
            }
        }
        return 1;
    }
}
