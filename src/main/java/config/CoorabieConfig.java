package config;

public final class CoorabieConfig implements Config {
  private volatile KeyValueConfig kvConfig;

  public CoorabieConfig(String path) {
    kvConfig = new KeyValueConfig.Builder(path).build();
  }

  public CoorabieConfig(KeyValueConfig kvConfig) {
    this.kvConfig = kvConfig;
  }

  @Override
  public boolean updateConfig(Config newConfig) {
    if (!(newConfig instanceof CoorabieConfig)) {
      return false;
    }
    CoorabieConfig newCoorabieConfig = (CoorabieConfig)newConfig;
    kvConfig = newCoorabieConfig.getKvConfig();
    return true;
  }

  public KeyValueConfig getKvConfig() {
    return kvConfig;
  }
}
