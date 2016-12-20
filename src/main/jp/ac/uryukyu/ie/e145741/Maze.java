package jp.ac.uryukyu.ie.e145741;

/**
 * Created by e145741 on 2016/12/20.
 */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Maze {
    public void maze2(){

        String[] strarray = new String[1000];
        int i = 0;

        try{
            File file = new File("/Users/e145741/Ideaprojects/prog2-ex3/src/main/map.txt");

            if (checkBeforeReadfile(file)){
                BufferedReader br = new BufferedReader(new FileReader(file));

                String str;
                while((str = br.readLine()) != null){
                    System.out.println(str);

                    strarray[i]=str;
                    i = i +1;
                }

                br.close();
            }else{
                System.out.println("ファイルが見つからないか開けません");
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static boolean checkBeforeReadfile(File file){
        if (file.exists()){
            if (file.isFile() && file.canRead()){
                return true;
            }
        }

        return false;
    }
}
