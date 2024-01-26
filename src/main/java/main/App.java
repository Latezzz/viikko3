package main;
//import java.util.ArrayList;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna eläintarhalle nimi:");
        String zooName = sc.nextLine();
        Zoo newZoo = new Zoo(zooName);


        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int valinta = Integer.parseInt(sc.nextLine());

                switch (valinta) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        int age = Integer.parseInt(sc.nextLine());

                        newZoo.addAnimal(species, name, age);
                        break;                      
                  
                    case 2:
                        newZoo.zooInformation();
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int laps = Integer.parseInt(sc.nextLine());
                        newZoo.makeAnimalsRun(laps);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }

            }
        }

        sc.close();


    }
}
