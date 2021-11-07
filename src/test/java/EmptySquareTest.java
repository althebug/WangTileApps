import model.EmptySquare;
import model.EmptyTile;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptySquareTest {

  @Test
  void testGetTile(){
    assertThat(EmptySquare.EMPTY_SQUARE.getTile()).isEqualTo(EmptyTile.EMPTY_TILE);
  }

}
