import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class client {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException, InterruptedException {
        XmlRpcClientConfigImpl configuration = new XmlRpcClientConfigImpl();
        configuration.setServerURL(new URL("http://localhost:8741"));
        XmlRpcClient rClient = new XmlRpcClient();
        rClient.setConfig(configuration);
//=======================================================================================================
        //first method
//        System.out.println("Add your message to a random number or type 'end' to finish");
//        Scanner scanner = new Scanner(System.in);
//        Object[] params = new Object[2];
//        Random r = new Random();
//        int low = 10;
//        int high = 100;
//        int myVal = r.nextInt(high - low) + low;
//        params[1] = myVal;
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            params[0] = (String)line;
//
//            Object result = rClient.execute("SERVER.echo3", params);
//            String wynik = ((String) result).toString();
//            System.out.println(wynik);
//            if (Objects.equals(line.toLowerCase(), "end")){
//                break;
//            }
//        }
//        scanner.close();
//=======================================================================================================
        //second method
        System.out.println("Boolean AND logic Calculator");
        System.out.println("Type 0 or 1");
        Scanner scanner = new Scanner(System.in);
        Object[] params = new Object[2];
        Random r = new Random();
        boolean bool = r.nextBoolean();
        params[0] = bool;
        while (scanner.hasNextLine()) {
            int num = scanner.nextInt();
            if (Objects.equals(num, 1)||Objects.equals(num, 0)) {
                params[1] = num;
                Object result = rClient.execute("SERVER.echo2", params);
                String s1=String.valueOf(result);

                System.out.println("Logic AND result for (" + params[0] + ", " + params[1] + ") is " + s1);

            }else{
                System.out.println("JUSTA 1 or 0, no other options ;)");
            }
            break;
        }

        scanner.close();





        //=======================================================================================================
        //third method
//        for(int i=0;i<50;i++) {
//            String result = (String) rClient.execute("SERVER.echo", Collections.singletonList("Hello XMLRPC-response num:"+i));
//            System.out.println(result);
//        } Thread.sleep(10000);
        }
    }

