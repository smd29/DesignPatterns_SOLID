package lld.design.builder;

import javax.management.RuntimeErrorException;

import lombok.Getter;

@Getter
public class Database {
    private String name;
    private String host; 
    private Integer port;
    private String password;
    private DatabaseType type;

    // Builder pattern
    // Step 1: Hide constructor
    private Database(){}

    // Utility method 
    public static DatabaseBuilder builder() {
        return new DatabaseBuilder();
    }

    // Step2: Create an inner class with same fields as outer class
    public static class DatabaseBuilder{
        // Step3: Copy all fileds from outer 
        private String name;
        private String host; 
        private Integer port;
        private String password;
        private DatabaseType type;
    
        // Step 4: Create setters Fluent interfaces
        
        public DatabaseBuilder withName(String name){
            this.name = name;
            return this;
        }

        public DatabaseBuilder withUrl(String host, Integer port){
            this.host = host;
            this.port = port;
            return this;
        }

        public DatabaseBuilder withPassword(String password){
            this.password = password;
            return this;
        }

        public DatabaseBuilder hana(){
            this.type = DatabaseType.HANA; 
            return this;
        }

        // Step 5: Create build method
        public Database build(){
            if (!isValid()){
                throw new RuntimeException("Invalid name");
            }
            Database database = new Database();
            database.name = this.name;
            database.host = this.host;
            database.port = this.port;
            database.password = this.password;
            database.type = this.type;

            return database;
        }

        // Validate
        public Boolean isValid(){
            if (name != null){
                return true;
            }
            return false;
        }

    }
}
