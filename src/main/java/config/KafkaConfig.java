package config;

public class KafkaConfig {
  private final ConfigMap configMap;

  public KafkaConfig(String path) {
    configMap = new ConfigMap(path);
  }
}
