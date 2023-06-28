package exer1.test1;

public class NoLifeValueException extends RuntimeException{
  static final long serialVersionUID = -7034897145766939234L;
  public NoLifeValueException() {
  }

  public NoLifeValueException(String message) {
    super(message);
  }

  public NoLifeValueException(String message, Throwable cause) {
    super(message, cause);
  }
}
