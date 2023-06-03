package oop.Bird;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Bird {
    private Integer weight;
    private String colour;
    private String size;
    private String beakType;
    private BirdType type;

    // public abstract void fly(); 
    // every class that extends bird has to implement fly method. but birds like penguin, can't fly
    // this is where Liskov is getting violated, that's why it's commented now.


}
