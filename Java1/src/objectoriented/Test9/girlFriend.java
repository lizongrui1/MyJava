package objectoriented.Test9;

public class girlFriend {
    private String name;
    private int age;
    private String sex;
    private String favourite;

    public girlFriend() {
    }

    public girlFriend(String name, int age, String sex, String favourite) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.favourite = favourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }
}
