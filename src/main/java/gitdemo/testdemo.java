package gitdemo;

public class testdemo {
    Integer id;
    String name;
    public  void print()
    {
        System.out.println("hello git");
        System.out.println("hello git4");
        System.out.println("hello git6");
    }
    public testdemo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public testdemo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
