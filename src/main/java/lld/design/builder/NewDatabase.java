package lld.design.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NewDatabase {
    private String name;
    private String host; 
    private Integer port;
    private String password;
    private DatabaseType type;
}
