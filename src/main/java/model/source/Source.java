package model.source;

public interface Source<T> extends Iterable<T> {
  T read();
  boolean updateConfig()
}
