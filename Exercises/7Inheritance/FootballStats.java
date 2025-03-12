class FootballStats extends PlayerStats {
    private int goalsScored;
    private int assists;
    private int matchesPlayed;

    public FootballStats(String playerName, String teamName, int goalsScored, int assists, int matchesPlayed) {
        super(playerName, teamName);
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public void displayStats() {
        System.out.println("Football Stats for " + playerName + ": ");
        System.out.println("Goals Scored: " + goalsScored);
        System.out.println("Assists: " + assists);
        System.out.println("Matches Played: " + matchesPlayed);
    }

    // Additional football-specific method
    public void scoreGoal() {
        goalsScored++;
        System.out.println(playerName + " has scored a goal! Total goals: " + goalsScored);
    }
}
