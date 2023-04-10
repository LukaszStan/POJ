package zad4;

public class Person {
    String first_name;
    String last_name;
    int age;
    String gender;
    String nationality;

    public Person(String first_name, String last_name, int age, String gender, String nationality) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    @Override
    public String toString(){
        return (this.first_name + " " + this.last_name + " " + this.age + " " + this.gender + " " + this.nationality);
    }
}
