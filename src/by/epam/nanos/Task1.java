package by.epam.nanos;

public class Task1 {
    Task1(){
        System.out.println("Task 1");
        Student student = new Student("123", "Bill", "Microsoft", "Gates", "1/1/1970",
                "Wall street, NY", "555-0000", "IT", "1");
        student.show();

        Customer customer = new Customer("456", "Steve", "Apple", "Jobs", "Washington DC",
                "1234-1234-1234-1234", "123412341234");
        customer.show();
    }
}

class Student{
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;
    private String address;
    private String phone;
    private String faculty;
    private String course;

    Student(String id, String firstName, String middleName, String lastName, String birthDate, String address, String phone, String faculty, String course) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
    }

    public void show(){
        System.out.println("Student " +
                "ID: '" + id + '\'' +
                ", First Name: '" + firstName + '\'' +
                ", Middle Name: '" + middleName + '\'' +
                ", Last Name: '" + lastName + '\'' +
                ", Birth Date: " + birthDate +
                ", Address: '" + address + '\'' +
                ", Phone: '" + phone + '\'' +
                ", Faculty: '" + faculty + '\'' +
                ", Course: '" + course + '\'' +
                '}');
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


class Customer {
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String creditCard;
    private String bankAccount;

    public Customer(String id, String firstName, String middleName, String lastName, String address, String creditCard, String bankAccount) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public void show(){
        System.out.println("Customer " +
                "ID: '" + id + '\'' +
                ", First Name: '" + firstName + '\'' +
                ", Middle Name: '" + middleName + '\'' +
                ", Last Name: '" + lastName + '\'' +
                ", Address: '" + address + '\'' +
                ", Credit Card: '" + creditCard + '\'' +
                ", Bank Account: '" + bankAccount + '\'' +
                '}');
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
