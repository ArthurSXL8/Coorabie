package model.sinker;

import model.exception.CoorabieException;

import java.util.List;

public interface Sinker<T> {
  boolean sink(T message);
  boolean batchSink(List<T> messages);
}
