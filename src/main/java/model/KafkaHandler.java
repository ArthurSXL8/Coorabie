package model;

import config.KafkaConfig;

public class KafkaHandler<T> {
  private KafkaConfig kafkaConfig;

  public KafkaHandler(KafkaConfig kafkaConfig) {
    this.kafkaConfig = kafkaConfig;
  }
}
