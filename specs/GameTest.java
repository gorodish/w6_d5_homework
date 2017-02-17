import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import cardGame.Game;
import cardGame.Player;

public class GameTest {
  Game game;
  Player player1;
  Player player2;

  @Before
  public void before() {
    game = new Game();
    player1 = new Player("Chris");
    player2 = new Player("Murray");

  }

  @Test
  public void hasPlayer1Name() {
    assertEquals("Chris", player1.getName());
  }

  @Test
  public void hasPlayer2Name() {
    assertEquals("Murray", player2.getName());
  }

}