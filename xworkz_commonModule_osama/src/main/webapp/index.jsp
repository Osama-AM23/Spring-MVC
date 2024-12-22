<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>X-Workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: -apple-system, sans-serif ;
        }

        header {
            background-color: #212529;
            color: #fff;
            padding: 10px 0;
        }

        header .logo {
            width: 150px;
            height: auto;
        }

        header .navbar {
            display: flex;
            justify-content: flex-end;
        }

        header .navbar a {
            color: #fff;
            margin-left: 20px;
            text-decoration: none;
            font-size: 18px;
            transition: color 0.3s ease;
        }

        header .navbar a:hover {
            color: #007bff;
        }

        .main-content {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 80vh;
            text-align: center;
            padding: 20px;
            background-color: #fff;
        }

        .main-content .info {
            padding: 50px;
        }

        .info h1 {
            font-size: 36px;
            color: red;
        }

        .info p {
            font-size: 20px;
            margin: 10px 0;
        }

        .info .btn {
            font-size: 18px;
            margin-top: 20px;
        }

       footer {
            background-color: #212529;
            color: #fff;
            padding: 10px 0;
            text-align: center;
            font-size: 15px;
            width: 100%;
            height: 80px;
        }

    </style>
</head>

<body>

    <header>
        <div class="container d-flex justify-content-between align-items-center">
            <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Logo" class="logo">
            <div class="navbar">
                <a href="signin.jsp" class="btn btn-outline-light">Sign In</a>
                <a href="signup.jsp" class="btn btn-outline-light">Sign Up</a>
            </div>
        </div>
    </header>

    <div class="main-content">
        <div class="info">
            <h1>FREE 1 Month Class for Any Graduates</h1>
            <p><strong>Contact:</strong> 9886971480 / 9886971483</p>
            <p><strong>Upcoming Batches:</strong> Limited seats available</p>
        </div>
    </div>

    <footer>
      <p><strong>Our Branches:</strong> Rajajinagar, BTM Layout</p>
      <p>Copyright &copy; 2022, All Right Reserved</p>
    </footer>

</body>

</html>
