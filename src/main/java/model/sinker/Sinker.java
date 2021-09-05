package model.sinker;

import model.exception.CoorabieException;

public interface Sinker<T> extends Iterable<T> {
  boolean sink(T t);
}
