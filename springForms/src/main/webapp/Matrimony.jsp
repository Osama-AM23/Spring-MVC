<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Matrimony Form</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>

         body {
               background-image: url('https://img.freepik.com/free-photo/navratri-interior-decoration_23-2151193730.jpg?t=st=1733506975~exp=1733510575~hmac=e9946c12d0d1d6202a6a9f9864f7973c5209a8770861cfcc001d9cb414c6bfaf&w=996');
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                min-height: 100vh;
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
                align-items: center;

                }
         h2{
            color:white;
         }
        </style>

    </head>
    <body>
    <h2>Matrimony Form</h2>
    <form action="marry" method="post">
    <pre>
    <input type="text" class="form-control" name="fullName" placeholder="Enter ur name">
    <input type="text" class="form-control" name="dob" placeholder="Enter ur DOB">
    <input type="text" class="form-control" name="gender" placeholder="Gender">
    <input type="text" class="form-control" name="email" placeholder="Enter ur Email">
    <input type="text" class="form-control" name="contact" placeholder="Enter ur contact">
    <input type="text" class="form-control" name="address"  placeholder="Enter ur address">
    <input type="text" class="form-control" name="religion" placeholder="Enter ur religion">
    <input type="text" class="form-control" name="caste" placeholder="Enter ur Caste">
    <input type="text" class="form-control" name="educationLevel" placeholder="Enter ur Education Level">
    <input type="text" class="form-control" name="income" placeholder="Enter ur inceome">

    <input type="submit" class="btn btn-primary" value="Apply">
    </pre>
    </form>
    </body>
    </html>