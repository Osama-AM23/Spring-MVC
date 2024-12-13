<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>X-workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>

            body {
                margin: 0;
                font-family: Apple-system, sans-serif;
            }
            .navbar {
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 10px 20px;
                background-color:rgba(154, 244, 214, 0.564);
                color: white;
            }
            .navbar .logo img{
                height: 80px;
            }
            .navbar .login-btn {
                text-decoration: none;
                color: rgb(29, 27, 27);
                background-color:transparent;
                padding: 10px 15px;
                border-radius: 5px;
                transition: background-color 0.3s;
            }
            .navbar .login-btn:hover {
                background-color: #dca912;
            }


        @keyframes fadeIn {
            0% { opacity: 0; transform: translateY(-30px); }
            100% { opacity: 1; transform: translateY(0); }
        }

        .logo-animate {
            animation: fadeIn 1s ease-out;
        }


        @keyframes slideIn {
            0% { opacity: 0; transform: translateX(-100%); }
            100% { opacity: 1; transform: translateX(0); }
        }

        .heading-animate {
            animation: slideIn 1s ease-out;
        }


        .btn-animate:hover {
            transform: scale(1.1);
            transition: transform 0.3s ease;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <div class="logo">
            <img src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" >
        </div>
        <a href="Login.jsp" class="login-btn">LOGIN</a>
    </div>
    <div class="container text-center mt-5">
        <h2 class="heading-animate">Welcome To X-workz</h2>
    </div>

</body>
</html>
