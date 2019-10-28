package designpattern.structural.composite.department;

public class FinancialDepartment implements Department {
 
    private Integer id;
    private String name;
 
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
 
    // standard constructor, getters,


    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}