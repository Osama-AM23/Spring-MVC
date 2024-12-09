<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hospital Form</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body{
                background-image: url('https://img.freepik.com/free-photo/blue-antibiotic-pill-laboratory-collection-variation-generative-ai_188544-46218.jpg?t=st=1733509193~exp=1733512793~hmac=c6f85b4348ff35fede7165dcf4378aa52dd576ac1a166a6b9edd567cafd73c79&w=1060');
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
    <h2>Hospital Admission Form</h2>
    <form action="hospital" method="post">
    <pre>
    <input type="text" class="form-control" name="fullName" placeholder="Enter ur full name">
    <input type="text" class="form-control" name="age" placeholder="Enter ur Age">
    <input type="text" class="form-control" name="problem" placeholder="Enter ur problem">
    <input type="text" class="form-control" name="address" placeholder="Enter ur Address">
    <input type="text" class="form-control" name="contact" placeholder="Enter ur contact no">

    <input type="submit" class="btn btn-success" value="Apply">
    </pre>
    </form>
    </body>
    </html>