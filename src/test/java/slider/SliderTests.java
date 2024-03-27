package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

   @Test
    public void testSlider() {
       var sliderPage = homePage.horizontalSliderPage();
       sliderPage.enterNumber();
       assertEquals(sliderPage.getSliderResult(), "4", "Incorrect slider number");

    }
}
