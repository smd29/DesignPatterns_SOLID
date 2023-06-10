package lld.design.abstractfactory.theme;

import lld.design.abstractfactory.theme.interfaces.ThemeFactory;
import lld.design.abstractfactory.theme.models.Checkbox;
import lld.design.abstractfactory.theme.models.LightCheckbox;
import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.PrimaryButton;

public class LightThemeFactory implements ThemeFactory{

    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
    
}
