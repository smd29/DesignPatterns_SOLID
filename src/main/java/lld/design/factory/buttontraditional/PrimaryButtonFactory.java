package lld.design.factory.buttontraditional;

import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.PrimaryButton;

// Concreate Factory class
public class PrimaryButtonFactory extends ButtonFactory{

    @Override
    public Button creaButton() {
        return new PrimaryButton();
    }
    
}
