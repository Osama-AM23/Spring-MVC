<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <!-- Link to Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        body {
            background-color: #000;
            color: white;
            font-family: apple-system, sans-serif;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            background-color: #222;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.5);
            width: 100%;
            max-width: 400px;
        }

        .form-container h3 {
            color: #FFA500;
            text-align: center;
            margin-bottom: 20px;
        }

        .form-control {
            background-color: #333;
            border: 1px solid #FFA500;
            color: white;
            border-radius: 5px;
        }

        .form-control:focus {
            border-color: #FF4500;
            box-shadow: 0 0 5px rgba(255, 69, 0, 0.5);
        }

        .btn-primary {
            background-color: #FFA500;
            border: none;
            padding: 12px 20px;
            font-size: 16px;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
        }

        .btn-primary:hover {
            background-color: #FF4500;
        }

        .form-group {
            margin-bottom: 15px;
        }
        ::placeholder {
            color: #ccc;
            font-family: apple-system,sans-serif;
            font-style: italic;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h3>Enter your details</h3>
        <form action="details" method="post">
            <div class="form-group">
                <input type="text" class="form-control" name="name" placeholder="Enter your name" required>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="age" placeholder="Enter your age" required>
            </div>
            <div class="form-group">
                <input type="email" class="form-control" name="email" placeholder="Enter your email" required>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="password" placeholder="Enter your password" required>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="confirmPassword" placeholder="Confirm your password" required>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="phone" placeholder="Enter your phone no" required>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Register</button>
            </div>
        </form>
    </div>
</body>
</html>
