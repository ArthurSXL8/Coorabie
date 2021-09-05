package model.sinker;

import config.HttpConfig;

public class HttpSinker implements Sinker<String> {
  private HttpConfig httpConfig;

  public HttpSinker(String path) {
    httpConfig = new HttpConfig(path);
  }

  @Override
  public boolean sink(String content) {
    return true;
  }
}
