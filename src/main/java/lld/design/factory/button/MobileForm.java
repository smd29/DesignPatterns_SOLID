package lld.design.factory.button;

import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.RoundButton;

// Mobile -> round button
public class MobileForm extends Form{

    @Override
    public Button createButton() {
        return new RoundButton();
    }
    
}
