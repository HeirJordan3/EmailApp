import java.util.Locale;
import java.util.Scanner;

public class Email {



    private  String firstName;
    private  String lastName;
    private  String password;
    private  String department;
    private  String email;
    private  int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private  String alternateEmail;
    private  String companySuffix = "codedifferently.com";


    // Constructor to get the first name and Last Name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        // call a method asking for the department and will return a department
        this.department = setDepartment();


        this.password = randomPassword(defaultPasswordLength);


        //combine elements to generate email
        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + companySuffix;

    }




    private String randomPassword(int lenght){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[lenght];
        for (int i =0; i < lenght; i++){
           int random = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //ask for the department
    private  String setDepartment(){
        System.out.println("New worker: " + firstName +" "+ lastName + " \nDeparment Codes:\n1 for Technical Consultant\n2 for Director of Grants and Finance\n3 for Software Developer Instructor\n4 for Temp High Sch Asst Instructor\n5 for Instructor\n6 for Workforce Portfolio Manager\n7 for none\n Enter department code: ");
        Scanner in = new Scanner(System.in);
         int departmentChoice = in.nextInt();
        if (departmentChoice == 1){
            return "Technical Consultant";
        }else if(departmentChoice ==2){
            return ("Director of Grants and Finance");
        }else if (departmentChoice == 3){
            return ("Software Developer Instructor");
        }else if (departmentChoice == 4){
            return ("Temp High Sch Asst Instructor");
        }else if (departmentChoice == 5){
            return ("Instructor");
        }else if (departmentChoice == 6 ){
            return ("Workforce Portfolio Manager");
        }else if (departmentChoice == 7){
            return ("none");
        }

        return null;
    }




    // set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }


    // set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    // change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }


    public String getAlternateEmail() {
        return ("Your alternate email is: " +alternateEmail);
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "COMPANY EMAIL: " + email + "\nDEPARTMENT: " + department +"\nPassword: " + password;
    }

}
