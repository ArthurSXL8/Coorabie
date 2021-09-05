package model.exception;

public class CoorabieException extends Throwable {
  private String msg;

  public CoorabieException(String msg) {
      this.msg = msg;
  }
}
