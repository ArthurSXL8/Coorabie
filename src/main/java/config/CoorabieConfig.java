package config;

public final class CoorabieConfig {
  private ConfigMap configMap;

  public CoorabieConfig(String path) {
    configMap = new ConfigMap(path);
  }
}
