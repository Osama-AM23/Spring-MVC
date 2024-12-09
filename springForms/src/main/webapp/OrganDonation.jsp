<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Organ Donation Form</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

                  body {
                                          background-image: url('https://img.freepik.com/free-photo/view-hands-holding-red-heart-represent-affection_23-2151728394.jpg?t=st=1733508216~exp=1733511816~hmac=43e5ae497f0a9fde461ef58e6d1cfd1067773fe3f92da93a27cc84403f265150&w=1060');
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
                      color:white;
                    }

               </style>
    </head>
    <body>
    <h2>Organ Donation Form</h2>
    <form action="donation" method="post">
    <pre>
    <input type="text" class="form-control" name="fullName" placeholder="Enter ur name">
    <input type="text" class="form-control" name="dob" placeholder="Enter ur DOB">
    <input type="text" class="form-control" name="gender" placeholder="Gender">
    <input type="text" class="form-control" name="bloodGroup" placeholder="Enter ur Blood Group">
    <input type="text" class="form-control" name="donationConsent" placeholder="Enter ur Donation Consent">
    <input type="text" class="form-control" name="email" placeholder="Enter ur Email">
    <input type="text" class="form-control" name="contact" placeholder="Enter ur contact">
    <input type="text" class="form-control" name="address"  placeholder="Enter ur address">
    <input type="text" class="form-control" name="medicalHistory" placeholder="Enter ur medical History">
    <input type="text" class="form-control" name="Signature" placeholder="Enter ur signature">

    <input type="submit" class="btn btn-primary" value="Submit">
    </pre>
    </form>
    </body>
    </html>