package common;

public class Person {

    private final String hairColor;
    private final String name;
    private final String favoriteColor;

    public Person(String hairColor, String name, String favoriteColor) {
        this.hairColor = hairColor;
        this.name = name;
        this.favoriteColor = favoriteColor;
    }

    public Person(Person person) {
        this.hairColor = person.getHairColor();
        this.name = person.getName();
        this.favoriteColor = person.getFavoriteColor();
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hairColor='" + hairColor + '\'' +
                ", name='" + name + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }
}
