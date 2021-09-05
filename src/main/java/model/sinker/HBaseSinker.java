package model.sinker;

import config.HBaseConfig;
import model.HBaseHandler;

public class HBaseSinker {
  private HBaseHandler handler;

  public HBaseSinker(HBaseConfig config) {
    handler = new HBaseHandler(config);
  }

}
