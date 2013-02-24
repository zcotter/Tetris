/**
 * Creates a HighScore for the purposes of writing data to the server
 * @author Zach Cotter
 */
public class HighScoreTester{
    /**
     * Resets the scores on the high score server to the defined values.
     * @param args
     */
    public static void main(String[] args){
        resetScores();
    }

    /**
     * overwrites new scores to the server.
     */
    private static void resetScores(){
        HighScore seeder = new HighScore("Player 10", 1);
        seeder.addListingIfEligible("Player 9", 2);
        seeder.addListingIfEligible("Player 8", 3);
        seeder.addListingIfEligible("Player 7", 4);
        seeder.addListingIfEligible("Player 6", 5);
        seeder.addListingIfEligible("Player 5", 6);
        seeder.addListingIfEligible("Player 4", 7);
        seeder.addListingIfEligible("Player 3", 8);
        seeder.addListingIfEligible("Player 2", 9);
        seeder.addListingIfEligible("Player 1", 10);
        seeder.save();
        HighScore tester = new HighScore();
        System.out.println(tester.toString());
    }
}
