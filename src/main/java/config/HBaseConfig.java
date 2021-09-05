package config;

public class HBaseConfig {
  private ConfigMap configMap;
  private String start;
  private String end;
  private boolean isStartIncluded;
  private boolean isEndIncluded;

  public HBaseConfig(String path) {
    configMap = new ConfigMap(path);
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
