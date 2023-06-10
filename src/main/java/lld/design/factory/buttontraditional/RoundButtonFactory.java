package lld.design.factory.buttontraditional;

import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.RoundButton;

// Concreate Factory class
public class RoundButtonFactory extends ButtonFactory{

    @Override
    public Button creaButton() {
        return new RoundButton();
    }
    
}
