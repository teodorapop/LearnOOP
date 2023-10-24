package enumExample;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // these are enum constants
        // public static and final
        // since is final you can't create child enums
        // type is Week

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;

        for (Week day: Week.values()){
            System.out.println(day);
        }

        System.out.println(week);


    }
}
