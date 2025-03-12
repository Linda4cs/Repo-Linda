class BasketballStats extends PlayerStats {
    private int pointsScored;
    private int assists;
    private int rebounds;

    public BasketballStats(String playerName, String teamName, int pointsScored, int assists, int rebounds) {
        super(playerName, teamName);
        this.pointsScored = pointsScored;
        this.assists = assists;
        this.rebounds = rebounds;
    }

    @Override
    public void displayStats() {
        System.out.println("Basketball Stats for " + playerName + ": ");
        System.out.println("Points Scored: " + pointsScored);
        System.out.println("Assists: " + assists);
        System.out.println("Rebounds: " + rebounds);
    }

    // Additional basketball-specific method
    public void scorePoints(int points) {
        pointsScored += points;
        System.out.println(playerName + " has scored " + points + " points! Total points: " + pointsScored);
    }
}
