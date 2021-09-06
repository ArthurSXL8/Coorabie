package config;

public class HttpConfig implements Config {
  private KeyValueConfig keyValueConfig;

  public HttpConfig(String path) {
    keyValueConfig = new KeyValueConfig.Builder(path).build();
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
