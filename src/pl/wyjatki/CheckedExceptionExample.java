package pl.wyjatki;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionExample {

    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionExample cee = new CheckedExceptionExample();
        //cee.urlTesterByTryCatch("gghttp://wszib.edu.plh");



        try {
            cee.urlTesterByThrows("gghttp://wszib.edu.plh");
        } catch (MalformedURLException e) {
            System.out.println("fffffffffffff++++++++++++++++++++");
            e.printStackTrace();
        }

    }

    public void urlTesterByTryCatch(String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Protokol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("++++++++++++++++++++");
            e.printStackTrace();
        }
    }

    public void urlTesterByThrows(String urlString) throws  MalformedURLException{
        URL url = new URL(urlString);
        System.out.println("Protokol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }

}
