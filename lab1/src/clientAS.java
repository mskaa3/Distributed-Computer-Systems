import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.client.AsyncCallback;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class clientAS {
        public static void main(String[] args) throws XmlRpcException, MalformedURLException, InterruptedException {
            XmlRpcClientConfigImpl configuration=new XmlRpcClientConfigImpl();
            configuration.setServerURL(new URL("http://localhost:8741"));
            XmlRpcClient rClient=new XmlRpcClient();
            rClient.setConfig(configuration);
            for(int i=0;i<50;i++) {
                AsyncCallback ac=new AsyncCallback() {
                    @Override
                    public void handleResult(XmlRpcRequest xmlRpcRequest, Object o) {
                        System.out.println((String) o);
                    }

                    @Override
                    public void handleError(XmlRpcRequest xmlRpcRequest, Throwable throwable) {

                    }
                };

                 rClient.executeAsync("SERVER.echo", Collections.singletonList("Hello XMLRPC- response num "+i),ac);
            }
            Thread.sleep(10000);
        }
    }

