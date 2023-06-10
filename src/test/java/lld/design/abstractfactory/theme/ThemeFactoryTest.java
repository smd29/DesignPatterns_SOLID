package lld.design.abstractfactory.theme;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import lld.design.abstractfactory.theme.interfaces.ThemeFactory;
import lld.design.abstractfactory.theme.models.Checkbox;
import lld.design.abstractfactory.theme.models.DarkCheckbox;
import lld.design.abstractfactory.theme.models.LightCheckbox;
import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.PrimaryButton;
import lld.design.simplefactory.button.models.RoundButton;

public class ThemeFactoryTest {
    
    ThemeFactory darkThemeFactory;
    ThemeFactory lightThemeFactory;


    @Before
    public void setUp(){
        darkThemeFactory = new DarkThemeFactory();
        lightThemeFactory = new LightThemeFactory();
    }

    @Test
    public void testDarkTheme(){
        Button roundButton = darkThemeFactory.createButton();
        Checkbox darkCheckbox = darkThemeFactory.createCheckbox();

        assertNotNull("If factory is called, object shouldn't be null", darkCheckbox);
        assertNotNull("If factory is called, object shouldn't be null", roundButton);

        assertTrue("If instance is of dark theme, button should be of round", roundButton instanceof RoundButton);
        assertTrue("If button is round, instance should be of dark theme", darkCheckbox instanceof DarkCheckbox);
    }

    @Test
    public void testLightTheme(){
        Button primaryButton = lightThemeFactory.createButton();
        Checkbox lightCheckbox = lightThemeFactory.createCheckbox();

        assertNotNull("If factory is called, object shouldn't be null", lightCheckbox);
        assertNotNull("If factory is called, object shouldn't be null", primaryButton);

        assertTrue("If instance is of dark theme, button should be of round", primaryButton instanceof PrimaryButton);
        assertTrue("If button is round, instance should be of dark theme", lightCheckbox instanceof LightCheckbox);
    }

}

// Here if we use same instance, for two diff test cases, then after first test case, the instance will be modified
// setUp and Teardown approach
// That's why we need setUp and tearDown