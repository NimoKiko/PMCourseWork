package sspu.ctq.pojo;

public class admin2 {
    private String name;
    private Integer id;

    public admin2() {
    }

    public admin2(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "admin2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
