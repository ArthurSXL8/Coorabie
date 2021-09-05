package model.channel;

import model.sinker.Sinker;
import model.source.Source;

public class Channel<T> {
  private Source<T> source;
  private Sinker<T> sinker;
  private List<Filter<T>> filters;
  private RateLimiter rateLimiter;
  private long include;
  private long exclude;



  public Channel(Source<T> source, Sinker<T> sinker) {
    this.source = source;
    this.sinker = sinker;
  }

  public void setFilter(List<Filter<T>> filters) {

  }

  public boolean transfer() {
    try {
      while (source.hasNext()) {
        T t = source.next();
        sinker.sink(t);
      }
    } catch (Exception e) {
      return false;
    }
    return true;
  }

}
