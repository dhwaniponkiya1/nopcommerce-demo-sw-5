package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity","smoke"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.selectMenu("Computers");           //Click on computers
        Assert.assertEquals(computerPage.getComputerHeading(),"Computers");          //Verify heading
    }

    @Test(groups = {"regression","smoke"})
    public void  verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.selectMenu("Computers");           //Click on computers
        computerPage.clickOnDesktopLink();          //Click on desktops
        Assert.assertEquals(desktopPage.getDesktopHeading(),"Desktops");        //Verify desktop heading
    }

    @Test(groups = {"regression"}, dataProvider = "buildComData", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
        homePage.selectMenu("Computers");           //Click on computers
        computerPage.clickOnDesktopLink();          //Click on desktops
        desktopPage.clickOnBuildYourOwnCompLink();      //Click on 'Build your own computer'

        //selecting specifications
        buildYourOwnComputerPage.selectProcessorFromDropdown(processor);
        buildYourOwnComputerPage.selectRam(ram);
        buildYourOwnComputerPage.selectHddRadio(hdd);
        buildYourOwnComputerPage.selectOs(os);
        buildYourOwnComputerPage.selectCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCart();            //click on add to cart button
    }
}
