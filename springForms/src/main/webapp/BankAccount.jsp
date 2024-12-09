<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bank Account Form</title>
             <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">

         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

               <style>

                  body {
                                          font-family: 'Roboto', sans-serif;
                                          background-image: url('https://img.freepik.com/free-vector/indian-digital-rupee-fluid-background-with-text-space_1017-53763.jpg?t=st=1733504824~exp=1733508424~hmac=000e94933db77518adcb51924508da5423b5872d5b86f9b4d1fe4a9a267f7e2c&w=996');
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
    <body>
    <h2>Bank Account Form</h2>
    <form action="bank" method="post">
    <pre>
    <input type="text" class="form-control" name="fullName" placeholder="Enter ur full name">
    <input type="text" class="form-control" name="age" placeholder="Enter ur Age">
    <input type="text" class="form-control" name="aadhaarNo" placeholder="Enter ur Aadhaar no">
    <input type="text" class="form-control" name="contact" placeholder="Enter ur contact no">

    <input type="submit" class="btn btn-primary" value="Send">
    </pre>
    </form>
    </body>
    </html>