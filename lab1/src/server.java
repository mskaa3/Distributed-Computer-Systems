import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Vector;

public class server {
    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("Server starting.....");
        int port=8741;
        WebServer webServer= new WebServer(port);
        PropertyHandlerMapping mapper=new PropertyHandlerMapping();
        mapper.addHandler("SERVER",server.class);
        webServer.getXmlRpcServer().setHandlerMapping(mapper);
        webServer.start();
        System.out.println("Server started succesfully");
        System.out.println("Listening on port:"+port);
        System.out.println("Press Ctrl+C to stop");
    }

    public String echo(String str){
        System.out.println(str);
        return "PONG: " + str;
    }

    public Boolean echo2(boolean bool, int num ){
        System.out.println("....Your answer is ready to see on the client side! ");
            if (bool){
                if (num==1){
                    return true;
                }else{
                    return  false;
                }
            }
            return false;

    }

    public String echo3(String str, int myNum){
        System.out.println("....Your message is already on the client side! ");
        return str +" "+ myNum;
    }
}
