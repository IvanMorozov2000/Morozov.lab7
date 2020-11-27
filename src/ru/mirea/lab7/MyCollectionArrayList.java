package ru.mirea.lab7;
import java.util.ArrayList;

public class MyCollectionArrayList {

    public static void main(String[] args) {

        ArrayList<String> GoldenGAME = new ArrayList<String>();
        GoldenGAME.add("Skyrim");
        GoldenGAME.add("GTA");
        GoldenGAME.add("TheElderScrolls");
        GoldenGAME.add("Minecraft");

        System.out.printf("В списке %d лучших игр. \n", GoldenGAME.size());
        for(String animals : GoldenGAME){
            System.out.println(animals);
        }

        GoldenGAME.add(0, "Yakuza");
        GoldenGAME.add(5, "Gover");

        System.out.printf("В список добавили новые игры. Теперь их %d. \n", GoldenGAME.size());
        for(String animals : GoldenGAME){
            System.out.println(animals);
        }

        GoldenGAME.add(6, "Oblivion");

        if(GoldenGAME.contains("Oblivion")){
            System.out.println("Также в списке есть Обливион. \n");
        }

        System.out.println(GoldenGAME.get(6));
        GoldenGAME.set(6, "Oblivion DLC");
        System.out.println("Эта игра с доп. контентом ‐ DLC. \n");

        GoldenGAME.remove(4);

        Object[] Game = GoldenGAME.toArray();
        for(Object Ga : Game){
            System.out.println(Game);
        }

    }

}
