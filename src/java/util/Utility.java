package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.time.LocalDateTime;


public class Utility {
    public static String generateFileName(String fileName) {
        String file_ext=fileName.substring(fileName.lastIndexOf("."));
        String datetime=LocalDateTime.now().toString().replace(":","-").replace(".","-");
        return datetime+file_ext;
    }
    public static boolean saveFile(String fileName ,String path, InputStream stream)
    {
        File file=new File(path);
        if(!file.exists())
            file.mkdir();
        File fileoutput=new File(file,fileName);
        try(FileOutputStream fos=new FileOutputStream(fileoutput)){
                int n=stream.read();
                while(n!=-1)
                {
                    fos.write(n);
                    n=stream.read();
                }
                fos.flush();
        }
        catch(Exception e){
            if(!fileoutput.exists())
                fileoutput.delete();
            return false;
        }
        return true;
    }
}
