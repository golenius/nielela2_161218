package pl.mojafirma;

public class Test {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new SimpleDataProvider();

        DataProvider[] dataProviders = new DataProvider[10];
        dataProviders[0] = new SimpleDataProvider();
        dataProviders[1] = new MyDataProvider();
        dataProviders[2] = new FileDataProvider();
        dataProviders[3] = new FileDataProvider();
        dataProviders[4] = new MyDataProvider();
        dataProviders[5] = new FileDataProvider();
        dataProviders[6] = new FileDataProvider();
        dataProviders[7] = new SimpleDataProvider();
        dataProviders[8] = new FileDataProvider();
        dataProviders[9] = new FileDataProvider();

        for (DataProvider dp:dataProviders) {
            dataPresenter.showData(dp);
        }



    }

}
