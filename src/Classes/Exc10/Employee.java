package Classes.Exc10;

class Employee {
    // Attributes
    private String name;
    private double baseSalary;
    private int yearsOfExperience;

    // Constructor
    public Employee(String name, double baseSalary, int yearsOfExperience) {
        this.name = name;
        this.baseSalary = Math.max(baseSalary, 0); // Ensure salary is non-negative
        this.yearsOfExperience = Math.max(yearsOfExperience, 0); // Ensure experience is non-negative
    }

    // Method to calculate annual bonus
    public double calculateYearEndBonus() {
        double bonusPercentage = 0.05 * yearsOfExperience;
        return baseSalary * bonusPercentage;
    }

    // Method to display employee's details and bonus
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Year-End Bonus: $" + calculateYearEndBonus());
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Base salary cannot be negative.");
        }
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0) {
            this.yearsOfExperience = yearsOfExperience;
        } else {
            System.out.println("Years of experience cannot be negative.");
        }
    }
}

