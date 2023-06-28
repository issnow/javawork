package java1;

public class GirlFriendTest {
  public static void main(String[] args) {
    GirlFriend g1 = GirlFriend.getInstance();
    GirlFriend g2 = GirlFriend.getInstance();
    System.out.println(g1 == g2);

  }
}
class GirlFriend {
  private GirlFriend (){}
  private static GirlFriend instance = null;
  public static GirlFriend getInstance (){
    if(instance == null){
      instance = new GirlFriend();
    }
    return instance;
  }
}
