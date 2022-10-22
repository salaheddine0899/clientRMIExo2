package inter;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {
    public static void main(String[] args) {
        try {
            InterService is=(InterService) Naming.lookup("rmi://localhost:1099/is");
            System.out.println("the sum of digits of 111 is:"+is.addDigit(111));
            System.out.println("the number of occurrence of c in crocodile is:"+is.counter('c',"crocodile"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
