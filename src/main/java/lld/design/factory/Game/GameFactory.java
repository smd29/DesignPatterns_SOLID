package lld.design.factory.Game;


import lld.design.prototype.Game.BackgroundObject;
import lld.design.prototype.Game.BackgroundObjectType;
import lld.design.prototype.Game.ForegroundObject;
import lld.design.prototype.Game.GraphicalObject;

public class GameFactory {
    
    // Method to create instances
    public static GraphicalObject createInstance(BackgroundObjectType type){
        switch(type){
            case BACK_GROUND:
                return new BackgroundObject();
            case FORE_GROUND:
                return new ForegroundObject();
        }
        throw new RuntimeException("Invalid type!!!"+type);
    }
}

// This violates Open Closed principle, due to switch case
// This violates SRP also, as if we need to change logic for background, then we need to open the backgrounobject()