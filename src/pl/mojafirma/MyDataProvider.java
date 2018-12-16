package pl.mojafirma;

import java.util.Random;

public class MyDataProvider implements DataProvider{
    @Override
    public String getData() {
        Random r = new Random();
        return  "losowo" + String .valueOf(r.nextGaussian());
    }
}
