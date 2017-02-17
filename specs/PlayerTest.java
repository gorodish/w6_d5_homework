import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import cardGame.Player;

public class PlayerTest {

  Player player1;
  Player player2;

  @Before
  public void before() {
    player1 = new Player("Chris");
    player2 = new Player("Murray");
  }

  @Test
  public void hasPlayer1() {
    assertEquals("Chris", player1.getName());
  }

  @Test
  public void hasPlayer2() {
    assertEquals("Murray", player2.getName());
  }
}