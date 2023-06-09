package lld.design.simplefactory.button;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.ButtonType;
import lld.design.simplefactory.button.models.PrimaryButton;

public class ButtonTest {
    
    @Test
    public void testSimpleFactory(){
        Button primary = ButtonFactory.createButton(ButtonType.PRIMARY);
        assertNotNull("If type is valid, it should not be null", primary);

        assertTrue("If type is primary, button should be of primary", primary instanceof PrimaryButton);
    }
}
