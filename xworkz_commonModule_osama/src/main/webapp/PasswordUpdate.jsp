<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Password-Update</title>
    <style>
        body {
            background-color: #f8f9fa;
            font-family: -apple-system, sans-serif;
        }
        .signin-container {
            margin-top: 50px;
        }


        .container {
            max-width: 500px;
            margin-top: 50px;
        }
        .form-title {
            text-align: center;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>

    <header class="bg-dark py-3">
        <div class="container d-flex justify-content-left">
            <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Xworkz Logo" height="50">
        </div>
    </header>

    <div class="container">
            <div class="form-container">
                <h3 class="form-title text-primary">Update Your Password</h3>

                <form action="updatePassword" method="post">

                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" onChange="onEmail()" name="email"
                            placeholder="Enter your Email" required><span id="displayEmail" style= color="red"></span>
                    </div>

                    <div class="mb-3">
                        <label for="newPassword" class="form-label">New Password</label>
                        <input type="password" class="form-control" id="newPassword" name="newPassword"
                            placeholder="Enter your new password" required>
                        <div id="passwordStrength" class="password-strength"></div>
                    </div>

                    <div class="mb-3">
                        <label for="confirmPassword" class="form-label">Confirm Password</label>
                        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword"
                            placeholder="Confirm your new password" required>
                        <div id="confirmPasswordFeedback" class="invalid-feedback"></div>
                    </div>


                    <button type="submit" class="btn btn-success w-100" id="submitButton">Update Password</button>
                </form>
            </div>
        </div>
    <script>
        function onEmail(){
                    console.log('email from jsp');
                    var userEmail= document.getElementById('email');
                    var emailValue= userEmail.value;

                    var xhttp = new XMLHttpRequest();

                    xhttp.open("GET", "http://localhost:2004/xworkz_commonModule_osama/userEmail/" +emailValue);
                    xhttp.send();

                    xhttp.onload = function(){
                        console.log(this.responseText)
                        document.getElementById("displayEmail").innerHTML = this.responseText;
                    }
                }
        </script>
</body>
</html>