package model.source;

import config.HBaseConfig;
import model.HBaseHandler;

public class HBaseSource {
  private final HBaseHandler handler;

  public HBaseSource(HBaseConfig config) {
    handler = new HBaseHandler(config);
  }

  public void updateConfig(HBaseConfig newConfig) {
    handler.updateConfig(newConfig);
  }
}
