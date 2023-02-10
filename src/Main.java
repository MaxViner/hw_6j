import java.util.HashMap;

public class Main {

    public static HashMap<Integer, Integer
            > map = new HashMap<>();

    public static int i=0;

    public static void main(String[] args) {

        for (int i=0;i<10; i++){
            add((int) (Math.random()*100));

        }

        viev(map);

    }

    public static boolean add (Integer value){
        try {
            map.put((i+1),value);
            i++;
            return true;
        }
        catch (Exception e){System.out.println("wrong");
        return false;}

    }
    public static String toStr(HashMap<Integer, Integer> map){
        return Main.map.keySet().toString();
    }

    public static boolean viev (HashMap<Integer, Integer> map){
        for (Integer key: map.keySet())
            System.out.println(key+" = "+map.get(key));

        return true;
    }

}