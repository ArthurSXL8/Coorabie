package config;

public class ZookeeperConfig implements Config {
  private volatile KeyValueConfig keyValueConfig;

  public ZookeeperConfig(String path) {
    keyValueConfig = new KeyValueConfig.Builder(path).build();
  }

  public boolean updateConfig(Config config) {
    if (!(config instanceof ZookeeperConfig)) {
      return false;
    }
    ZookeeperConfig zkConfig = (ZookeeperConfig) config;
    keyValueConfig = zkConfig.keyValueConfig;
    return true;
  }
}
