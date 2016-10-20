package app.donation.model;

public class Token
{
  public boolean success;
  public String token;

  public Token(boolean success, String token)
  {
    this.success = success;
    this.token = token;
  }
}
