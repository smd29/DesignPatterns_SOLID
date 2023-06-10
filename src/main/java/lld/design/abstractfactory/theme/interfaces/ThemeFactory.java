package lld.design.abstractfactory.theme.interfaces;

import lld.design.abstractfactory.theme.models.Checkbox;
import lld.design.simplefactory.button.models.Button;

// Step 3: Create abstract factory interface
// Factory of factories
public interface ThemeFactory {
    // Factory methods
    public Button createButton(); 
    public Checkbox createCheckbox();
}
