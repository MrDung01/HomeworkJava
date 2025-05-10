<%-- 
    Document   : FormDki
    Created on : May 8, 2025, 8:51:18 AM
    Author     : binhd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5"> <%--Tao khung co le tren--%>
            <h2 class="mb-4">Form Sign Up</h2>
            <form>
                <div class="mb-3">
                    <label for="inputEmail" class="form-label">Email</label>
                    <input type="email" class="form-control" id="inputEmail" placeholder="Email">
                </div>
                <div class="mb-3">
                    <label for="inputPassword" class="form-label">Pass</label>
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                </div>
                <div class="mb-3">
                    <label for="inputAddress" class="form-label">Address</label>
                    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                </div>

                <div class="mb-3">
                    <label for="inputAddress2" class="form-label">Address2</label>
                    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                </div>


            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
