package advancedJava.ReflectionApi1;

@Author(name = "Sasha", dateOfCreation = 2019)
public class PersonForRefl {
  private int id;
  private String name;

  public PersonForRefl() {
    this.id = -1;
    this.name = "No name";
  }

  public void sayHello() {
    System.out.println("Person with id: " + id + " and");
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
