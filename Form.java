//forms to fill
import java.util.Scanner;


public class Form{
    
    //declaring my fields
    String firstName;
    String lastName;
    int age;
    String countryOfOrigin;
    String countryOfResidence;
    String school;
    String major;
    String upcomingJob;


    public static void main(String []args){
        //create our object
        
        Form myform = new Form();
        Scanner scan = new Scanner(System.in);
        
        //getting inputs from our user
        System.out.println("Enter your first name: ");
        String first = scan.nextLine();
        System.out.println("Enter your last name: ");
        String last = scan.nextLine();
        System.out.println("Enter your age: ");
        int myAge = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Country of Origin: ");
        String myOrigin = scan.nextLine();
        System.out.println("Enter your Country of Resisdence: ");
        String residence = scan.nextLine();
        System.out.println("Enter the name of your school: ");
        String mySchool = scan.nextLine();
        System.out.println("Enter your major: ");
        String myMajor = scan.nextLine();
        System.out.println("Enter your upcoming job Summer 2020: ");
        String myJob = scan.nextLine();
        System.out.println()
        
        
        myform.setFirst(first);
        myform.getFirst();
        myform.setLast(last);
        myform.getLast();
        myform.setAge(myAge);
        myform.getAge();
        myform.setOrigin(myOrigin);
        myform.getOrigin();
        myform.setResidence(residence);
        myform.getResidence();
        myform.setSchool(mySchool);
        myform.getSchool();
        myform.setMajor(myMajor);
        myform.getMajor();
        myform.setJob(myJob);
        myform.getJob();
        
    }
    
    
    //first constructor
    public Form(){
        
    }
    
    public void setFirst(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirst(){
        System.out.println("First Name: " + firstName);
        return firstName;
    }
    
    public void setLast(String lastName){
        this.lastName = lastName;
    }
    
    public String getLast(){
        System.out.println("Last Name: " + lastName);
        return lastName;
    } 
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        System.out.println("Age: " + age);
        return age;
        
    }
    
    public void setOrigin(String countryOfOrigin){
        this.countryOfOrigin = countryOfOrigin;
    }
    
    public String getOrigin(){
        System.out.println("Country of Origin: " + countryOfOrigin);
        return countryOfResidence;
    }
    
    public void setResidence(String countryOfResidence){
        this.countryOfResidence = countryOfResidence;
        
    }
    
    public String getResidence(){
        System.out.println("Country of Residence: " + countryOfResidence);
        return countryOfResidence;
        
    }
    
    public void setSchool(String school){
        this.school = school;
    }
    
    public String getSchool(){
        System.out.println("Name of School: "+ school);
        return school;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    
    public String getMajor(){
        System.out.println("Major: " + major);
        return major;
    }
    
    public void setJob(String upcomingJob){
        this.upcomingJob = upcomingJob;
    }
    
    public String getJob(){
        System.out.println("Upcoming Job: " + upcomingJob);
        return upcomingJob;
    }
    
    
    
    
}



