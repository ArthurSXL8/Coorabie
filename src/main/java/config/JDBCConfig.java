package config;

public class JDBCConfig implements Config {
  private final KeyValueConfig keyValueConfig;

  public JDBCConfig(String path) {
    keyValueConfig = new KeyValueConfig.Builder(path).build();
  }
}
