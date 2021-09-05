package config;

public class JDBCConfig {
  private final ConfigMap configMap;

  public JDBCConfig(String path) {
    configMap = new ConfigMap(path);
  }
}
