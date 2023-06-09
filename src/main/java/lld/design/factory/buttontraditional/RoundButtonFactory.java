package lld.design.factory.buttontraditional;

import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.RoundButton;

public class RoundButtonFactory extends ButtonFactory{

    @Override
    public Button creaButton() {
        return new RoundButton();
    }
    
}
