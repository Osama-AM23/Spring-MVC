<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Registration</title>

     <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background-image: url('https://img.freepik.com/free-photo/top-view-tourist-objects-frame-with-copy-space_23-2148786099.jpg?t=st=1733722115~exp=1733725715~hmac=f911e2f4cc2c6e23e0ad16f1c92da94a5ebdd5c2ce23eca3060b65e8879444c4&w=1060');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        /* .form-container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 30px;
            border-radius: 10px;
            width: 100%;
            max-width: 600px;
        } */

        h2, h3 {
            color: #ffffff;
            text-align: center;
        }

        .form-control, .form-select, .form-check-input {
            margin-bottom: 15px;
        }

        .btn-info {
            width: 100%;
        }

        label{
            color:blue;
        }

        .form-check-label {
            color: rgb(91, 28, 208);
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Passport Seva</h2>
        <h3>PSP Division</h3>
        <hr>
        <h2>User Registration</h2>
        <form action="passport" method="post">
            <div class="mb-3">
                <label>Register to apply at*</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="applyAt" value="passportOffice" id="passportOffice">
                    <label class="form-check-label" for="passportOffice">Passport Office</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="applyAt" value="cvpDelhi" id="cvpDelhi">
                    <label class="form-check-label" for="cvpDelhi">CVP Delhi</label>
                </div>
            </div>

            <div class="mb-3">
                <label for="passportOffice">Passport Office*</label>
                <select class="form-select" name="passportOffice" id="passportOffice">
                    <option value="">SELECT</option>
                    <option value="Delhi">Delhi</option>
                    <option value="Dwarka">Dwarka</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Pune">Pune</option>
                    <option value="Chennai">Chennai</option>
                    <option value="Coimbatore">Coimbatore</option>
                    <option value="Bengaluru">Bengaluru</option>
                    <option value="Mangalore">Mangalore</option>
                    <option value="Hyderabad">Hyderabad</option>
                    <option value="Kochi">Kochi</option>
                    <option value="Jammu">Jammu</option>
                    <option value="Chandigarh">Chandigarh</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="fullName">Given Name*</label>
                <input type="text" class="form-control" name="fullName" id="fullName" placeholder="First Name + Middle Name" required>
            </div>

            <div class="mb-3">
                <label for="surName">SurName*</label>
                <input type="text" class="form-control" name="surName" id="surName" required>
            </div>

            <div class="mb-3">
                <label for="dob">Date of Birth (DD/MM/YYYY)*</label>
                <input type="text" class="form-control" name="dob" id="dob" placeholder="DD/MM/YYYY" required>
            </div>

            <div class="mb-3">
                <label for="email">Email ID*</label>
                <input type="email" class="form-control" name="email" id="email" required>
            </div>

            <div class="mb-3">
                <label>Do you want your Login ID to be the same as E-mail ID?*</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="loginIdSame" value="yes" id="loginYes" required>
                    <label class="form-check-label" for="loginYes">Yes</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="loginIdSame" value="no" id="loginNo">
                    <label class="form-check-label" for="loginNo">No</label>
                </div>
            </div>

            <div class="mb-3">
                <label for="loginId">Login ID*</label>
                <input type="text" class="form-control" name="loginId" id="loginId" required>
            </div>

            <div class="mb-3">
                <label for="password">Password*</label>
                <input type="password" class="form-control" name="password" id="password" required>
            </div>

            <div class="mb-3">
                <label for="confirmPassword">Confirm Password*</label>
                <input type="password" class="form-control" name="confirmPassword" id="confirmPassword" required>
            </div>

            <button type="submit" class="btn btn-info">Register</button>
        </form>
    </div>

</body>
</html>
