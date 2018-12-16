import pl.edu.wszib.podyplomowe.PackagePresenter;

public class Test {

    public static void main(String[] args) {

        pl.edu.wszib.java.PackagePresenter javaPackagePresenter = new pl.edu.wszib.java.PackagePresenter();
        PackagePresenter podyplomowePackagePresenter = new PackagePresenter();

        Test test = new Test();

        System.out.println("Pakiet klasy test " + test.getClass().getPackage());

        javaPackagePresenter.showPackage();
        podyplomowePackagePresenter.showPackage();


    }

}


