package com.employees.form;

public interface HttpServletResponse {

    Object getWriter();
    void sendRedirect(String string);

}
