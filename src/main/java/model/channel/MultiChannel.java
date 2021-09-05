package model.channel;

import model.sinker.Sinker;
import model.source.Source;

public class MultiChannel<T> {
  private List<Source<T>> sourceList;
  private List<Sinker<T>> sinkerList;
  private int limit;

  public MultiChannel<T>(List<Source<T>> sources, List<Sinker<T>> sinkers, int len) {

  }
}
