<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Death Certificate Form</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<style>

                  body {
                                          background-image: url('https://img.freepik.com/free-photo/top-view-picture-frame-with-black-bow-dark-wall_179666-40057.jpg?t=st=1733508723~exp=1733512323~hmac=17054c75001d5c94f83bc90388860fbd2be89d25422c490147981186c311d0e8&w=996');
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

                   h2{ color:white;}


               </style>
    </head>
    <body>
    <h2>Death Certificate Form</h2>
    <form action="death" method="post">
    <pre>
    <input type="text" class="form-control" name="deceasedName" placeholder="Enter  name">
    <input type="text" class="form-control" name="deceasedAge" placeholder="Enter  Age">
    <input type="text" class="form-control" name="deceasedAddress" placeholder="Enter  Address">
    <input type="text" class="form-control" name="deceasedDob" placeholder="Enter  DOB">
    <input type="text" class="form-control" name="deceasedLasteDate" placeholder="Enter DOD">
    <input type="text" class="form-control" name="causeOfDeath" placeholder="Enter Cause of Death">


    <input type="submit" class="btn btn-primary" value="Send">
    </pre>
    </form>
    </body>
    </html>