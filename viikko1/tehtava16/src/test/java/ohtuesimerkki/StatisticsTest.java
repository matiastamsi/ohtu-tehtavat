
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author tamsi
 */
public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }
    
    @Test
    public void searchPlayerThatExists() {
        Player p = stats.search("Kurri");
        assertEquals("Kurri", p.getName());
    }
    
    @Test
    public void searchPlayerThatNotExists() {
        assertEquals(null, stats.search("Tamsi"));
    }
    
    @Test
    public void listingTeamMembersWorks() {
        assertEquals(3, stats.team("EDM").size());
    }
    
    @Test
    public void topScoresGivesRightAmountOfScores() {
        assertEquals(4, stats.topScorers(4).size());
    }
}
