public class PlayerStatsDriver {
    public static void main(String[] args) {
        // Creating football player stats
        FootballStats footballPlayer = new FootballStats("James Brown", "Manchester United", 20, 15, 30);
        footballPlayer.displayInfo();
        footballPlayer.displayStats();
        footballPlayer.scoreGoal(); // Simulate scoring a goal

        System.out.println("\n");

        // Creating cricket player stats
        CricketStats cricketPlayer = new CricketStats("Charles Dike", "Super Eagles", 900, 48, 10);
        cricketPlayer.displayInfo();
        cricketPlayer.displayStats();
        cricketPlayer.scoreRun(3);  // Simulate scoring runs
        cricketPlayer.takeWicket(); // Simulate taking a wicket

        System.out.println("\n");

        // Creating basketball player stats
        BasketballStats basketballPlayer = new BasketballStats("Linda Dike", "Leeds United", 3000, 1500, 500);
        basketballPlayer.displayInfo();
        basketballPlayer.displayStats();
        basketballPlayer.scorePoints(3);  // Simulate scoring points
    }
}
