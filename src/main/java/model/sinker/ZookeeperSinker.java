package model.sinker;

import config.ZookeeperConfig;

public class ZookeeperSinker<T> implements Sinker<T> {
  public ZookeeperSinker(ZookeeperConfig conf) {

  }

  @Override
  public boolean sink(T t) {
    // TODO
    return true;
  }

}
