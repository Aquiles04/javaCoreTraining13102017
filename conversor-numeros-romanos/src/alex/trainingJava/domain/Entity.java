package alex.trainingJava.domain;

public class Entity {

    private String name;

    public Entity() {
    }

    public Entity(String name) {
        this.name = name;
    }



    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                '}';
    }

}
