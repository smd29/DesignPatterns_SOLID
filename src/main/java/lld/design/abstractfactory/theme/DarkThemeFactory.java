package lld.design.abstractfactory.theme;

import lld.design.abstractfactory.theme.interfaces.ThemeFactory;
import lld.design.abstractfactory.theme.models.Checkbox;
import lld.design.abstractfactory.theme.models.DarkCheckbox;
import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.RoundButton;

// Step 4: Implement concrete factories
public class DarkThemeFactory implements ThemeFactory{

    @Override
    public Button createButton() {
        return new RoundButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
        
}
