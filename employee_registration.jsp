<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>
</head>
<body>
    <form action="register" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="department">Department:</label>
        <input type="text" id="department" name="department" required><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>
