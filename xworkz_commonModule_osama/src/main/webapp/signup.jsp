<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Xworkz-Signup</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
     body {
        background-color: #f8f9fa;
        font-family: -apple-system, sans-serif ;
     }
</style>
</head>

<body>

    <header class="bg-dark py-3">
        <div class="container d-flex justify-content-left">
            <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Xworkz Logo" height="50">
        </div>
    </header>

    <div class="container my-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-primary text-white text-center">
                        <h4>Welcome to Xworkz Signup</h4>
                    </div>

                        <form action="signup" method="post">
                        <div class="card-body">
                            <div>
                                <label  for="userName" class="form-label"><i class="bi bi-person-circle"></i> Username</label>
                                <input type="text" class="form-control" id="userName" onChange="onUserName()" name="userName" placeholder="Enter user name" required>
                                <span id="displayResponse" style= color="red"></span>
                            </div>
                            <div>
                                <label for="email" class="form-label"><i class="bi bi-envelope-fill"></i> Email</label>
                                <input type="text" class="form-control" id="email" onChange="onEmail()" name="email" placeholder="Enter user email" required>
                                <span id="displayEmail" style= color="red"></span>
                            </div>
                            <div>
                                <label for="phone" class="form-label"><i class="bi bi-telephone-fill"></i> Phone</label>
                                <input type="text" class="form-control" id="phone" onChange="onPhone()" name="phone" placeholder="Enter user phone" required>
                                <span id="displayPhone" style= color="red"></span>
                            </div>
                            <div>
                                <label for="alterEmail" class="form-label"><i class="bi bi-envelope-fill"></i> Alternate Email</label>
                                <input type="text" class="form-control" id="alterEmail" onChange="onAlterEmail()" name="alterEmail" placeholder="Enter alter email" required>

                            </div>
                            <div>
                                <label for="alterPhone" class="form-label"><i class="bi bi-telephone-fill"></i> Alternate Phone</label>
                                <input type="text" class="form-control" id="alterPhone" onChange="onAlterPhone()" name="alterPhone" placeholder="Enter alter phone" required>

                            </div>
                            <div>
                                <label for="location" class="form-label"><i class="bi bi-geo-alt-fill"></i> Location</label>
                                <input type="text" class="form-control" id="location" name="location" placeholder="Enter user location" required>
                            </div>
                            <br>
                            <div>
                                <input type="submit" value="REGISTER" class="btn btn-success w-100">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <script>
        function onUserName(){
            console.log('user Name from jsp');
            var name= document.getElementById('userName');
            var nameValue= name.value;

            var xhttp = new XMLHttpRequest();

            xhttp.open("GET", "http://localhost:2004/xworkz_commonModule_osama/name/" +nameValue);
            xhttp.send();

            xhttp.onload = function(){
                            console.log(this.responseText)
                            document.getElementById("displayResponse").innerHTML = this.responseText;
                            }
        }

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

        function onPhone(){
            console.log('phone from jsp');
            var userPhone= document.getElementById('phone');
            var phoneValue= userPhone.value;

            var xhttp = new XMLHttpRequest();

            xhttp.open("GET", "http://localhost:2004/xworkz_commonModule_osama/userPhone/" +phoneValue);
            xhttp.send();

            xhttp.onload = function(){
                console.log(this.responseText)
                document.getElementById("displayPhone").innerHTML = this.responseText;
            }
        }

        function onAlterEmail(){
            console.log('AlterEmail from jsp');
            var userAlterEmail= document.getElementById('alterEmail');
            var alterMailValue= userAlterEmail.value;

            var xhttp = new XMLHttpRequest();

            xhttp.open("GET", "http://localhost:2004/xworkz_commonModule_osama/userAlterEmail/" +alterMailValue);
            xhttp.send();

            xhttp.onload = function(){
                console.log(this.responseText)
                document.getElementById("displayResponse").innerHTML = this.responseText;
            }
        }

        function onAlterPhone(){
            console.log('AlterPhone from jsp');
            var userAlterPhone= document.getElementById('alterPhone');
            var alterPhoneValue= userAlterPhone.value;

            var xhttp = new XMLHttpRequest();

            xhttp.open("GET", "http://localhost:2004/xworkz_commonModule_osama/userAlterPhone/" +alterPhoneValue);
            xhttp.send();

             xhttp.onload = function(){
                console.log(this.responseText)
                document.getElementById("displayResponse").innerHTML = this.responseText;
             }

        }
    </script>
</body>

</html>
