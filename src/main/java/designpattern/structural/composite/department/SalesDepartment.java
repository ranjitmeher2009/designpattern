package designpattern.structural.composite.department;

public class SalesDepartment implements Department {
 
    private Integer id;
    private String name;
 
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
 
    // standard constructor, getters, setters

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}