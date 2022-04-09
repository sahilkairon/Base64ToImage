package demo;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import demo.*;


public class image1 {


    public static void main(String[] args) throws IOException {
        blob obj = new blob();


        File f = new File("EnterFileNameHere");
        f.createNewFile();
        FileOutputStream out = new FileOutputStream(f);
        BufferedOutputStream buffout = new BufferedOutputStream(out);
        buffout.write(obj.deb);
        buffout.flush();



    }


}
