package main;
import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }


    public void addAnimal(String animalSpecies, String animalName, int animalAge) {
        animals.add(new Animal(animalSpecies, animalName, animalAge));
    }

    public void zooInformation() {
        System.out.println(name + " pitää sisällään seuraavat eläimet:");
        for (Animal animal : animals) {
            animal.getImformation();
        }
    }

    public void makeAnimalsRun(int laps) {
        for (Animal animal : animals) {
            animal.run(laps);          
        } 
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
