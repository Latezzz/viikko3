package main;

public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }
    public void getImformation() {
        System.out.println(species + ": " + name + ", " + age + " vuotta");    
    }

    public void animalInformation() {
        System.out.println();
    }

    public void run(int laps) {
        int i;
        for (i=1; i <= laps; i++) {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }
}
