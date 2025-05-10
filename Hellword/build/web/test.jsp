<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Form Sign Up Bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
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

        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="inputCity" class="form-label">City</label>
                <input type="text" class="form-control" id="inputCity">
            </div>

            <div class="col-md-4 mb-3">
                <label for="inputState" class="form-label">State</label>
                <select id="inputState" class="form-select">
                    <option selected>Choose...</option>
                    <option>State 1</option>
                    <option>State 2</option>
                </select>
            </div>

            <div class="col-md-2 mb-3">
                <label for="inputZip" class="form-label">Zip</label>
                <input type="text" class="form-control" id="inputZip">
            </div>
        </div>

        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="checkMeOut">
            <label class="form-check-label" for="checkMeOut">Check me out</label>
        </div>

        <button type="submit" class="btn btn-primary">Sign in</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
