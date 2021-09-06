package model.sinker;

import config.HBaseConfig;
import model.HBaseHandler;

public class HBaseSinker<T> implements Sinker<T> {
  private HBaseHandler handler;

  public HBaseSinker(HBaseConfig config) {
    handler = new HBaseHandler(config);
  }

  @Override
  public boolean sink(T t) {
    // TODO
    return true;
  }

}
