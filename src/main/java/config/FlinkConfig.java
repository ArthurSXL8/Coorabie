package config;

public class FlinkConfig {
  private ConfigMap configMap;

  public FlinkConfig(String path) {
    configMap = new ConfigMap(path);
  }
}
