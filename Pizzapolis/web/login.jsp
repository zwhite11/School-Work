<%@page import="com.jhuep.web_development.pizzapolis.database.RetrieveHelper"%>
<%@page import="com.jhuep.web_development.pizzapolis.entity.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Login</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="style.css">
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
        .w3-bar,h1,button {font-family: "Montserrat", sans-serif}
        .fa-anchor,.fa-coffee {font-size:200px}
    </style>
    <body>


        <!-- Navbar -->
        <div class="w3-top">
            <div class="w3-bar w3-red w3-card-2 w3-left-align w3-large">
                <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
                <a href="./index.html" class="w3-bar-item w3-button w3-padding-large w3-white">Home</a>
                <a href="./aboutus.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">About Pizzapolis</a>
                <div class="w3-dropdown-hover w3-red">
                    <button class="w3-button w3-hide-small w3-padding-large w3-red w3-hover-white">Menu</button>
                    <div class="w3-red w3-dropdown-content w3-bar-block w3-card-4 ">
                        <a href="./pizza.html" class="w3-bar-item w3-button">Pizza</a>
                        <a href="./sides.html" class="w3-bar-item w3-button">Sides</a>

                    </div>
                </div>  
                <a href="./contactus.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Contact Us</a>
                <a href="./order.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Order Online Now!</a>
                <a href="./viewCart.html" class="w3-bar-item w3-button w3-padding-large">Your Cart</a>
            </div>
        </div>
        <%
            String message = "";
            Customer customer = RetrieveHelper.retrieveCustomer(request.getParameter("username"), request.getParameter("password"));
            if (customer == null) {
                message = "Unrecognized username or password.";
            } else {
                message = "Thank you for logging in " + customer.getName();
                session.setAttribute("customer", customer);
            }
        %>

        <!-- First Grid -->
        <div class="w3-row-padding w3-padding-64 w3-container">
            <div class="w3-content">
                <h1><%=message%></h1>
            </div>
        </div>


        <script>
            // Used to toggle the menu on small screens when clicking on the menu button
            function myFunction() {
                var x = document.getElementById("navDemo");
                if (x.className.indexOf("w3-show") == -1) {
                    x.className += " w3-show";
                } else {
                    x.className = x.className.replace(" w3-show", "");
                }
            }
        </script>

    </body>
</html>
