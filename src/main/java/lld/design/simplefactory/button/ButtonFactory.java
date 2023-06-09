package lld.design.simplefactory.button;

import lld.design.simplefactory.button.models.Button;
import lld.design.simplefactory.button.models.ButtonType;
import lld.design.simplefactory.button.models.PrimaryButton;
import lld.design.simplefactory.button.models.RoundButton;

// Step 3: Create concreate factory class
public class ButtonFactory {
    
    // Create static method to construct diff instances
    public static Button createButton(ButtonType type){
        switch(type){
            case LINK:
                // break;
            case PRIMARY:
                return new PrimaryButton();
            case ROUND:
                return new RoundButton();
        }

        throw new IllegalArgumentException("Invalid button type" + type);
    }
}
