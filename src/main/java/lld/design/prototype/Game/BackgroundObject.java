package lld.design.prototype.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Step 2: Create subclasses
@Getter
@NoArgsConstructor
@Setter
public class BackgroundObject implements GraphicalObject{
    private Integer height;
    private Integer width;
    private Integer depth;
    private BackgroundObjectType type;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Integer> pixel = new ArrayList<>();

    // Create a constructor instead of Allargsconstructor, because we don't wan't to expose pixels
    public BackgroundObject(Integer height, Integer width, Integer depth, BackgroundObjectType type){
        this.height = height;
        this.type = type;
        this.width = width;
        this.depth = depth;

        this.pixel = helperHiddenMethod();
    }

    private List<Integer> helperHiddenMethod() {
        return Collections.emptyList();
    }

    // Step 3: Implement the clone method
    @Override
    public BackgroundObject clone(){
        BackgroundObject clone = new BackgroundObject();
        clone.height = this.height;
        clone.width = this.width;
        clone.depth = this.depth;
        clone.type = this.type;
        clone.pixel = this.pixel;

        return clone;
    } 
}
