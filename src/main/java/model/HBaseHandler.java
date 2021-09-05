package model;

import config.HBaseConfig;

public class HBaseHandler {
  private volatile HBaseConfig config;

  public HBaseHandler(HBaseConfig config) {
    this.config = config;
  }

  public void updateConfig(HBaseConfig newConfig) {
    config = newConfig;
  }
}
