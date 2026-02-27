package util;
import java.awt.Desktop;
import java.io.File;
import java.net.URI;

public class VideoUtil {

    public static String getThumbnail(String youtubeUrl){
        try{
            String id=youtubeUrl.split("v=")[1];
            int amp=id.indexOf("&");
            if(amp!=-1) id=id.substring(0,amp);
            return "https://img.youtube.com/vi/"+id+"/0.jpg";
        }catch(Exception e){
            return "";
        }
    }

    public static void openLink(String link){
        try{
            Desktop.getDesktop().browse(new URI(link));
        }catch(Exception e){ e.printStackTrace();}
    }

    public static void openVideo(String path){
        try{
            Desktop.getDesktop().open(new File(path));
        }catch(Exception e){ e.printStackTrace();}
    }
}