package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        boolean b = (year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0));
        int checkLeap;
        String checkMonth = null;
        if (year <= 0 || month > 12 || month <= 0) {
            checkMonth = "invalid date";
            System.out.println(checkMonth);
        } else {

            if (b == true) {
                checkLeap = 1;
            } else {
                checkLeap = 0;
            }
            switch (checkLeap) {
                case (1):
                    checkMonth = "leap";
                    break;
                case (0):
                    checkMonth = "not leap";
                    break;
            }
            if (checkMonth.equals("leap")) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(31);
                        break;
                    case 2:
                        System.out.println(29);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(30);
                        break;
                }
            } else if (checkMonth.equals("not leap")) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(31);
                        break;
                    case 2:
                        System.out.println(28);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(30);
                        break;
                }
            } else {
                System.out.println("invalid date");
            }

        }
    }
}
