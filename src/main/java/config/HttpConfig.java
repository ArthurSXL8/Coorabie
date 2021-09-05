package config;

public class HttpConfig {
  private ConfigMap configMap;

  public HttpConfig(String path) {
    configMap = new ConfigMap(path);
  }

  public int getSocketTimeoutMillis() {
    return 0;
  }

  public int getConnectTimeoutMillis() {
    return 0;
  }

  public int getReadTimeout() {
    return 0;
  }

  public int getWriteTimeout() {
    return 0;
  }

}
