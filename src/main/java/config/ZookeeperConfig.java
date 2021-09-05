package config;

public class ZookeeperConfig {
  private ConfigMap configMap;

  public ZookeeperConfig(String path) {
    configMap = new ConfigMap(path);
  }
}
