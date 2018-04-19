import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            File file = new File("words.txt");
            File file1 = new File("alpha.txt");
            Scanner fscan = new Scanner(file);
            Scanner fscan1 = new Scanner(file1);
            ArrayList<String> list= new ArrayList<>();
            ArrayList<String> list1= new ArrayList<>();
            while(fscan.hasNextLine()){
                String word= fscan.next();
                list.add(word);
            }
            while(fscan1.hasNextLine()){
                String word= fscan1.next();
                list1.add(word);
            }
            System.out.println(list);
            int points=0;
            for(int i=0;i<list.size();i++){
                String word=list.get(i);
                for(int j=0;j<word.length();j++){
                    String ch= String.valueOf(word.charAt(j));
                    list1.indexOf(ch);
                    if(Character.isUpperCase(ch.charAt(0))) {
                        ch.toLowerCase();
                        if (ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("e")||ch.equalsIgnoreCase("i")
                                ||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("u"))
                            points+=2;
                        else {
                                System.out.println(ch.toLowerCase());
                                points += list1.indexOf(ch.toLowerCase())*2;
                        }
                    }else{
                        if (ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("e")||ch.equalsIgnoreCase("i")
                                ||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("u"))
                            points++;
                        else {
                            if(list1.indexOf(ch) != -1)
                                points += list1.indexOf(ch);
                        }
                    }
                }
            }
            System.out.println(points);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
