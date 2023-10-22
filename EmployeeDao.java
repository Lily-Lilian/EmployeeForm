import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    private static List<Employee> employeeList = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employeeList.add(employee);
    }
    

    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
