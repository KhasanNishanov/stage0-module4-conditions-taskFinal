package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        int toBeAssigned = switch (monthNumber) {
            case 1-> {
                System.out.println("Winter");
                yield 1;
            }
            case 2-> {
                System.out.println("Winter");
                yield 2;
            }
            case 3-> {
                System.out.println("Spring");
                yield 3;
            }
            case 4-> {
                System.out.println("Spring");
                yield 4;
            }
            case 5-> {
                System.out.println("Spring");
                yield 5;
            }
            case 6-> {
                System.out.println("Summer");
                yield 6;
            }
            case 7-> {
                System.out.println("Summer");
                yield 7;
            }
            case 8-> {
                System.out.println("Summer");
                yield 8;
            }
            case 9-> {
                System.out.println("Autumn");
                yield 9;
            }
            case 10-> {
                System.out.println("Autumn");
                yield 10;
            }
            case 11-> {
                System.out.println("Autumn");
                yield 11;
            }
            case 12-> {
                System.out.println("Winter");
                yield 12;
            }

            default-> {
                System.out.println("Wrong month number");
                yield 0;
            }
        };
    }


}
