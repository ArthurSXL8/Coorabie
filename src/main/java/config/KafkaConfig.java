package config;

public class KafkaConfig implements Config {
  private final KeyValueConfig keyValueConfig;

  public KafkaConfig(String path) {
    keyValueConfig = new KeyValueConfig.Builder(path).build();
  }
}
