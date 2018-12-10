package arraysList;

public class friend {
    private String name;
    private int age;
     
    public friend()
     {
      name = "";
      age  = 0;
     }
     public friend(String n, int a)
     {
      name = n;
      age  = a;
     }
     public String getName()
     {
      return name;
     }
     public int getAge()
     {
      return age;
     }
     
     public void setName(String n)
     {
      name = n;
     }
     public void setAge(int a)
     {
      age = a;
     }
}
