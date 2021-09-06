package config;

public class HBaseConfig implements Config {
  private KeyValueConfig keyValueConfig;
  private String start;
  private String end;
  private boolean isStartIncluded;
  private boolean isEndIncluded;

  public HBaseConfig(String path) {
    keyValueConfig = new KeyValueConfig.Builder(path).build();
  }

  @Override
  public boolean updateConfig(Config newConfig) {
    if (!(newConfig instanceof HBaseConfig)) {
      return false;
    }
    HBaseConfig newHBaseConfig = (HBaseConfig) newConfig;
    keyValueConfig = newHBaseConfig.keyValueConfig;
    return true;
  }

  public String getStartRow() {
    return start;
  }

  public String getEndRow() {
    return end;
  }

  public boolean isStartIncluded() {
    return isStartIncluded;
  }

  public boolean isEndIncluded() {
    return isEndIncluded;
  }
}
