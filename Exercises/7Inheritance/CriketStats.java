class CricketStats extends PlayerStats {
    private int runsScored;
    private int wicketsTaken;
    private int matchesPlayed;

    public CricketStats(String playerName, String teamName, int runsScored, int wicketsTaken, int matchesPlayed) {
        super(playerName, teamName);
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public void displayStats() {
        System.out.println("Cricket Stats for " + playerName + ": ");
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Wickets Taken: " + wicketsTaken);
        System.out.println("Matches Played: " + matchesPlayed);
    }

    // Additional cricket-specific method
    public void scoreRun(int runs) {
        runsScored += runs;
        System.out.println(playerName + " has scored " + runs + " runs! Total runs: " + runsScored);
    }

    public void takeWicket() {
        wicketsTaken++;
        System.out.println(playerName + " has taken a wicket! Total wickets: " + wicketsTaken);
    }
}
