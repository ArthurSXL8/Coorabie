package model.source;

import model.KafkaHandler;
import model.sinker.KafkaSinker;

public class KafkaSource<T> implements Source<T> {
  public KafkaHandler<T> handler;
}
