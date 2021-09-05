package config;

class ConfigMap {
  private Map<String, String> conf = new ConcurrentHashMap<>();

  public ConfigMap(String path) {

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
}
