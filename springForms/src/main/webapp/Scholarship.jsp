<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Scholarship Form</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

        <style>

                          body {
                                                  background-image: url('https://img.freepik.com/free-photo/top-view-academic-cap-glasses-with-keyboard_23-2148756567.jpg?t=st=1733508008~exp=1733511608~hmac=3528f5a477464f49c5e6f1f72b7d4c8c8daf99da91aaf79107264a2036b1aa3d&w=996');
                                                  background-size: cover;
                                                  background-position: center;
                                                  background-repeat: no-repeat;
                                                  min-height: 100vh;
                                                  display: flex;
                                                  flex-direction: column;
                                                  justify-content: center;
                                                  align-items: center;

                                              }


                           .container {
                               background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent white */
                               padding: 30px;
                               border-radius: 10px;

                           }

                       </style>

    </head>
    <body >
    <h2>ScholarShip Form</h2>
    <form action="scholar" method="post">
    <pre>
    <input type="text" class="form-control" name="fullName" placeholder="Enter ur name">
    <input type="text" class="form-control" name="dob" placeholder="Enter ur DOB">
    <input type="text" class="form-control" name="email" placeholder="Enter ur Email">
    <input type="text"class="form-control" name="academicInfo" placeholder="Enter ur Qualification">
    <input type="text"class="form-control" name="mobile" placeholder="Enter ur Mobile No" >
    <input type="submit" class="btn btn-dark" value="Apply">
    </pre>
    </form>
    </body>
    </html>