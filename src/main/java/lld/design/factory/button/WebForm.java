package lld.design.factory.button;

import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.PrimaryButton;

// web ->primary
public class WebForm extends Form{

    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
    
}
