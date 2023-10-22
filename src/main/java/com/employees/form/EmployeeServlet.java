package com.employees.form;
import java.io.IOException;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
    private EmployeeDao employeeDao = new EmployeeDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String department = request.getParameter("department");

        Employee employee = new Employee(firstName, lastName, email, department);
        employeeDao.saveEmployee(employee);

        response.sendRedirect(request.getContextPath() + "/success.jsp"); // Redirect to a success page
    }
    
}
