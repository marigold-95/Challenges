
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDriven  extends SerializationHelper{

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Users> Records = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int userChoice;

        boolean quit = false;

        do {

            System.out.println("MENU");
            System.out.println("1: Add Record");
            System.out.println("2: Delete Record");
            System.out.println("3: Update Record");
            System.out.println("4: Search Record");
            System.out.println("5: Display Records");
            System.out.println("9: Exit program");
            System.out.print("Enter your selection : ");

            System.out.print("Your choice, 0 to quit: ");

            userChoice = sc.nextInt();

            switch (userChoice) {

                case 1:

                    // Add user

                    System.out.println("Enter your Name:");
                    String name = sc.next();
                    System.out.println("Enter your Surname:");
                    String surname = sc.next();
                    // email address
                    System.out.println("Enter your Email Address: ");
                    String emailAddress = sc.next();
                    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
                    //matching the given email address if is valid format
                    boolean result = emailAddress.matches(regex);
                    if(result) {
                        System.out.println("valid email");
                    } else {
                        System.out.println("Given email is not valid");
                    }

                    //date of birth
                    System.out.println("Enter date in format dd/MM/yyyy: ");
                    String date_of_birth = sc.next();


                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    // define a formatter;

                    LocalDate theDate = LocalDate.parse(date_of_birth, formatter);

                    // display it using the same formatter
                    String backToStr = formatter.format(theDate);

                    String year = backToStr.split("/")[2];
                    int age = 2021 - Integer.parseInt(year);
                    System.out.println("You are " + age + "years old");

                    System.out.println("Hello " +name + "  "+surname);

                    Records.add(new Users(name,surname,emailAddress,age));
                    serialiseToFile(new Users(name,surname,emailAddress,age),"abc.ser");
                    JSONSerializationHelper.serialiseToFile(new Users(name,surname,emailAddress,age),"abc.json");


                    break;

                case 2:
                    //delete user

                    //Prompt the user for their email
                    //if not found show error message
                    System.out.println("Enter your Email address: ");
                    String searchEmailAddres = sc.next();
                    File file = new File("abc.ser");
                    file.delete();

                   /* for(int i =0; i<Records.size(); i++){
                        if(Records.get(i).getEmail().equalsIgnoreCase(searchEmailAddres)){
                            System.out.println(Records.remove(i));
                            System.out.println("User successfully deleted");
                        }else
                        {
                            System.out.println("Email not found");
                        }
                    }*/


                    break;

                case 3:
                    // Update record
                    //Prompt the user for their email and search by email
                    //if not found show error message
                    System.out.println("Enter your Email address: ");
                    String searchEmailAddre = sc.next();

                    for(int i =0; i<Records.size(); i++){
                        if(Records.get(i).getEmail().equalsIgnoreCase(searchEmailAddre)){
                            Records.set(i, new Users("updatedName","updatedSurname","Updated@gmail.com",111));

                            System.out.println("Enter your Name:");
                            String nameUpdate = sc.next();
                            System.out.println("Enter your Surname:");
                            String surnameUpdate = sc.next();
                            // email address
                            System.out.println("Enter your Email Address: ");
                            String emailAddressUpdate = sc.next();
                            String regexs = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
                            //matching the given email address if is valid format
                            boolean results = emailAddressUpdate.matches(regexs);
                            if(results) {
                                System.out.println("valid email");
                            } else {
                                System.out.println("Given email is not valid");
                            }

                            System.out.println("Enter date in format dd/MM/yyyy: ");
                            String date_of_births = sc.next();


                            DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");    // define a formatter;

                            LocalDate theDates = LocalDate.parse(date_of_births, formatters);

                            // display it using the same formatter
                            String backToStrs = formatters.format(theDates);

                            String years = backToStrs.split("/")[2];
                            int ages = 2021 - Integer.parseInt(years);

                            Records.get(i).setFirstName(nameUpdate);
                            Records.get(i).setSurname(surnameUpdate);
                            Records.get(i).setEmail(emailAddressUpdate);
                            Records.get(i).setAge(ages);




                            System.out.println("User details Successfully updated");
                        }else
                        {
                            System.out.println("Email not found");
                        }

                    }


                    break;
                case 4:
                    //  Search record using email ,if not found show an error message
                    System.out.println("Enter your Email address: ");
                    String searchEmailAddress = sc.next();



                    for(int i =0; i<Records.size(); i++){
                        if(Records.get(i).getEmail().equalsIgnoreCase(searchEmailAddress)){
                            System.out.println(Records.get(i));
                        }else
                        {
                            System.out.println("Email not found");
                        }
                    }


                    break;
                case 5:
                    System.out.println("from serial"+ deserializeFromFile("abc.ser"));
                    System.out.println("from Json "+ JSONSerializationHelper.deserializeFromFile("abc.json",Users.class));
                    //  Display All Records
                    // for(Users userRecord : Records){
                    //    System.out.println(userRecord);
                   // }


                    break;

                case 6:

                    quit = true;

                    break;

                default:

                    System.out.println("Wrong choice.");

                    break;

            }

            System.out.println();

        } while (!quit);

        System.out.println("Thank You!");

    }




}