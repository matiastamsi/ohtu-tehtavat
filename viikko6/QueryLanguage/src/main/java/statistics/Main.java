package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        //Ilmeisesti tilastot muuttuneet vs. mallilistat...
        //Kuitenkin tällä kyselyllä huomataan että homma toimii!!
        Statistics stats = new Statistics(new PlayerReaderImpl("https://nhlstatisticsforohtu.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();

        Matcher m1 = query.playsIn("PHI")
                .hasAtLeast(10, "assists")
                .hasFewerThan(5, "goals").build();
        System.out.println("m1");
        for (Player player : stats.matches(m1)) {
            System.out.println(player);
        }

        Matcher m2 = query.playsIn("PHI")
                .hasAtLeast(18, "points").build();
        System.out.println("m2");
        for (Player player : stats.matches(m2)) {
            System.out.println(player);
        }

        Matcher m = query.oneOf(m1, m2).build();
        System.out.println("m");
        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }

}
