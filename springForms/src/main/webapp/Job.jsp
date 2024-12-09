<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Job Form</title>
         <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

        <style>
             body{
                            font-family: 'Roboto', sans-serif;
                            background-image: url('https://images.ctfassets.net/co0pvta7hzrh/4H1nuPnqVhm1LfMaUubJV5/0ab8068ea9a44fa2df7904283dbb909c/phone-sales-specialist-job-application-form-thumbnail.png');
                            background-size: cover;
                            background-position: center;
                            background-repeat: no-repeat;
                            min-height: 100vh;
                            display: flex;
                            flex-direction: column;
                            justify-content: center;
                            align-items: center;
                        }

        </style>
    </head>
    <body>
    <h2>Job Form</h2>
    <form action="apply" method="post">
    <pre>
    <input type="text" class="form-control" name="fullName" placeholder="Enter ur name">
    <input type="text" class="form-control" name="dob" placeholder="Enter ur DOB">
    <input type="text" class="form-control" name="email" placeholder="Enter ur Email">
    <input type="text"class="form-control" name="contact" placeholder="Enter ur contact">
    <input type="text"class="form-control" name="qualification" placeholder="Enter ur qualification" >
    <input type="text" class="form-control" name="experience" placeholder="Enter ur experience">
    <input type="text" class="form-control" name="skills"  placeholder="Enter ur Skills">
    <input type="text" class="form-control" name="address"  placeholder="Enter ur address">


    <input type="submit" class="btn btn-primary" value="Apply">
    </pre>
    </form>
    </body>
    </html>