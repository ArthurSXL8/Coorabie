package model.sinker;

import config.KafkaConfig;

public class KafkaSinker<T> implements Sinker<T> {
  private KafkaConfig config;

  public KafkaSinker(KafkaConfig config) {
    this.config = config;
  }

  @Override
  public boolean sink(T t) {
    return true;
  }
}
