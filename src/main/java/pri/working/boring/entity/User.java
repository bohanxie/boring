package pri.working.boring.entity;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020年10月12日 16:08:00
 */
public class User {
    private String name;

    private String age;

    private String id;

    public User(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
