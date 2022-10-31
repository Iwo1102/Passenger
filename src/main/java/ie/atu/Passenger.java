package ie.atu;

public class Passenger {
    String title;
    String name;
    int id;
    int phone;
    int age;

    public Passenger(String title, String name, int id, int phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public static String Title(String title) {
        char titleChar[] = title.toCharArray();
        if ("Mr".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title)) {
            //make sure all chars are in correct cases
            titleChar[0] = 'M';
            title = String.valueOf(titleChar);
            return title;
        } else {
            throw new IllegalArgumentException("Can only be Mr, Ms or Mrs");
        }
    }
}
