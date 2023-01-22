package oop.ordering;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
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

    @Override
    public int compareTo(Person other) {
        if(getAge() > other.getAge())
            // 1 means this object is greater than other.
            return 1;
        else if(getAge() < other.getAge())
            // -1 means this object is less than other.
            return -1;
        else
            // 0 means this object is the same as other (for sorting).
            return 0;
    }

    @Override
    public String toString() {
        return String.format("<Name: %s, Age: %s>", getName(), getAge());
    }
}
