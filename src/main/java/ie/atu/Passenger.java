package ie.atu;

public class Passenger {
    String title;
    String name;
    int id;
    int phone;
    int age;

    public Passenger(String title, String name, int id, int phone, int age) {
        this.title = title(title);
        this.name = name(name);
        this.id = id(id);
        this.phone = phone(phone);
        this.age = age(age);
    }

    public static String title(String title) {
        char titleChar[] = title.toCharArray();
        if ("Mr".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title)) {
            //make sure all chars are in correct cases
            titleChar[0] = 'M';
            title = String.valueOf(titleChar);
            return title;
        } else
            throw new IllegalArgumentException("Can only be Mr, Ms or Mrs");
    }

    public static String name(String name) {
        if(name.length() < 3)
            throw new IllegalArgumentException("Name has to have a minimum of 3 characters");
        else
            return name;
    }

    public static int id(int s) {
        int count = 0;
        int n = s;
        while (n != 0)
        {
            n = n/10;
            count++;
        }
        if(count < 10)
            throw new IllegalArgumentException("ID has to have a minimum of 10 digits");
        else
            return s;
    }

    public static int phone(int s) {
        int count = 0;
        int n = s;
        while (n != 0)
        {
            n = n/10;
            count++;
        }
        if(count < 7)
            throw new IllegalArgumentException("Phone number has to have a minimum of 7 digits");
        else
            return s;
    }

    public static int age(int i)
    {
        if (i < 16)
            throw new IllegalArgumentException("Must be at least 16 years of age to fly");
        else
            return i;
    }



}
