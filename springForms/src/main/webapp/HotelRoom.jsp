<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>HotlRoom Form</title>
                     <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<style>

                  body {
                                          font-family: 'Roboto', sans-serif;
                                          background-image: url('https://images.unsplash.com/photo-1504652517000-ae1068478c59?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
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
                   h2{
                        color: yellow;
                   }


               </style>
    </head>
    <body>
    <h2>HotelRoom Booking</h2>
    <form action="booking" method="post">
    <pre>
    <input type="text" class="form-control" name="fullName" placeholder="Enter ur name">
    <input type="text" class="form-control" name="totalGuest" placeholder="No Of Guest">
    <input type="text" class="form-control" name="email" placeholder="Enter ur Email">
    <input type="text" class="form-control" name="contact" placeholder="Enter ur contact">

    <input type="submit" class="btn btn-primary" value="Book">
    </pre>
    </form>
    </body>
    </html>