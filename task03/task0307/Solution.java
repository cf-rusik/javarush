package task03.task0307;

/**
 * Created by Руслан on 08.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


       Zerg ZergName[] = new Zerg[10];
       for (int i = 0; i < 10; i++) {
            ZergName[i] = new Zerg();
            ZergName[i].name = "zerg" + (i + 1);
        }

        Protoss ProtossName[] = new Protoss[10];
       for (int i = 0; i < 5; i++) {
           ProtossName[i] = new Protoss();
           ProtossName[i].name = "protoss" + (i + 1);
       }

       Terran TerranName[] = new Terran[12];
       for (int i = 0; i < 12; i++) {
           TerranName[i] = new Terran();
           TerranName[i].name = "terran" + (i + 1);
       }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}