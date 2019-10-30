import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            arrList.add("open");

        }

        int n = 1;
        int m = 2;
        while (n<100) {
            for (int j = n; j < 100; j += m) {
                if (arrList.get(j).equalsIgnoreCase("open")) {
                    arrList.set(j, "close");
                } else {
                    arrList.set(j, "open");
                }
            }
            n+=1;
            m+=1;
        }
       for(int x=0;x<100;x++) {
           if(arrList.get(x).equalsIgnoreCase("open")){
               System.out.println(x+1);
           }
       }

    }
}
