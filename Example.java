class Address {
    private String street;
    private String city;
    private String postalCode;

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getFullAddress() {
        return street + ", " + city + " " + postalCode;
    }

    public void updatePostalCode(String newPostalCode) {
        this.postalCode = newPostalCode;
    }

    public boolean isSameCity(Address otherAddress) {
        return this.city.equalsIgnoreCase(otherAddress.city);
    }
}


class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddressDetails() {
        return address.getFullAddress();
    }

    public void celebrateBirthday() {
        this.age += 1;
        System.out.println(name + " is now " + age + " years old.");
    }

    public boolean isSameAge(Person otherPerson) {
        return this.age == otherPerson.age;
    }
}


class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, Address address, String employeeId, double salary) {
        super(name, age, address); 
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double calculateAnnualSalary(double bonus) {
        return (salary * 12) + bonus;
    }

    public void promote(double salaryIncrease) {
        this.salary += salaryIncrease;
        System.out.println(getName() + " has been promoted. New salary: " + salary);
    }

    public boolean hasHigherSalary(Employee otherEmployee) {
        return this.salary > otherEmployee.salary;
    }
}