package config;

public class FlinkConfig implements Config {
  private volatile KeyValueConfig kvConfig;

  public FlinkConfig(String path) {
    kvConfig = new KeyValueConfig.Builder(path).build();
  }

  public boolean updateConfig(Config config) {
    if (!(config instanceof FlinkConfig))
  }
}
