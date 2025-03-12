abstract class PlayerStats {
    protected String playerName;
    protected String teamName;

    public PlayerStats(String playerName, String teamName) {
        this.playerName = playerName;
        this.teamName = teamName;
    }

    // Common method to display general information
    public void displayInfo() {
        System.out.println("Player: " + playerName + ", Team: " + teamName);
    }

    // Abstract method that must be implemented by subclasses
    public abstract void displayStats();
}
