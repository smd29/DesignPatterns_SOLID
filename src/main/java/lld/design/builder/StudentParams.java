package lld.design.builder;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentParams {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

}   
