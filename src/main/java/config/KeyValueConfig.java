package config;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

class KeyValueConfig {
  private Map<String, String> conf = new ConcurrentHashMap<>();
  public KeyValueConfig(KeyValueConfig newConfig) {
    conf = newConfig.conf;
  }


  private KeyValueConfig(Builder builder) {
    conf = builder.conf;
  }



  public int getInt(String key) {
    return Integer.parseInt(conf.get(key));
  }

  public long getLong(String key) {
    return Long.parseLong(conf.get(key));
  }

  public double getDouble(String key) {
    return Double.parseDouble(conf.get(key));
  }

  @Override
  public String toString() {
    return conf.entrySet().stream().map(e -> e.getKey()
            + ":" + e.getValue()).collect(Collectors.joining(","));
  }

  public static class Builder {
    private final Map<String, String> conf;
    private String path;

    public Builder() {
      conf = new ConcurrentHashMap<>();
    }

    public Builder(String path) {
      this.path = path;
      conf = parse(path);
    }

    public Builder setKv(String key, String value) {
      conf.put(key, value);
      return this;
    }

    public KeyValueConfig build() {
      return new KeyValueConfig(this);
    }

    private Map<String, String> parse(String path) {
      // TODO
      return new HashMap<>();
    }
  }
}
