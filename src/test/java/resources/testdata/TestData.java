package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "invalidCredentials")
    public Object[][] getInvalidCredentials() {
        Object[][] data = new Object[][]{
                {"test1@gmail.com", "test123"},
        };
        return data;
    }

    @DataProvider(name = "validCredentials")
    public Object[][] getValidCredentialsData() {
        Object[][] data = new Object[][]{
                {"prime12@gmail.com", "prime123"},
        };
        return data;
    }

    @DataProvider(name = "registrationData")
    public Object[][] getRegistrationData() {
        Object[][] data = new Object[][]{
                {"Female", "Prime", "testing", "23", "2", "2001", "ptesting01@gmail.com", "prime123", "prime123"},
        };
        return data;
    }

    @DataProvider(name = "buildComData")
    public Object[][] getBuildComData() {
        Object[][] data = new Object[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00]", "400 GB [+$100.00]", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]", "320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00]"},
        };
        return data;
    }

}
