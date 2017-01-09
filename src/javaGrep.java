import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Alliance on 10.01.2017.
 */
public class javaGrep {
        public static void main(String[] args) {
            try
            {
                BufferedReader br = new BufferedReader(new FileReader("D:\\example\\javaCoding.txt"));
                String s;
                while((s=br.readLine())!=null){
                    if (s.indexOf("Java")>=0)
                        System.out.println(s);
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
    }

