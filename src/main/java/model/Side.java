package model;

import javafx.scene.paint.Color;

import java.util.List;

public interface Side {
  Color color();
  List<Side> compatiblesSides(List<Side> sides);
  boolean accept(Side side);
}