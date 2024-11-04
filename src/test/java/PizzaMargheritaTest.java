import org.testng.Assert;
import org.testng.annotations.Test;

public class PizzaMargheritaTest extends BaseTest {

    @Test
    public void addPizzaMargheritaTest() {
        MenuPage menuPage = new MenuPage(webDriver);
        menuPage.clickButtonPizza()
                .clickButtonOrder()
                .clickButtonChooseDough()
                .clickButtonChooseSize()
                .clickButtonOrder2()
                .clickButtonBasket();
        Assert.assertTrue(menuPage.getMessagePizzaField().contains(BasketPageMessage.PIZZA_MESSAGE));
    }

    @Test
    public void addPizzaMargheritaAndDrinkTest() {
        MenuPage menuPage = new MenuPage(webDriver);
        menuPage.clickButtonPizza()
                .clickButtonOrder()
                .clickButtonChooseDough()
                .clickButtonChooseSize()
                .clickButtonOrder2()
                .clickButtonDrinks()
                .clickButtonWater()
                .clickButtonBasket();
        Assert.assertTrue(menuPage.getMessagePizzaField().contains(BasketPageMessage.PIZZA_MESSAGE));
        Assert.assertTrue(menuPage.getMessageDrinkWaterField().contains(BasketPageMessage.DRINK_WATER_MESSAGE));
    }
}
