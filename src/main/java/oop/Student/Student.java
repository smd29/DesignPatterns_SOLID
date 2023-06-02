package oop.Student;

public class Student {
    private String name;
    private String email;
    private String batchName;
    private Integer score;

    // Define Constructor
    public Student(String name, String email, String batchName, Integer score){
        this.name = name;
        this.batchName = batchName;
        this.score = score;
        this.email = email;
    }
    
    public void changeBatch(String batchName){
        this.batchName = batchName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getBatchName(){
        return this.batchName;
    }

    public void setBatchName(String batchName){
        this.batchName = batchName;
    }

    public Integer getScore(){
        return this.score;
    }

    public void setScore(Integer score){
        this.score = score;
    }

}