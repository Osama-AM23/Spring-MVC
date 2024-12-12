<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <title>Marriage Register</title>

     <style>

            body {
                font-family: -apple-system, sans-serif;
                           background-image: url('https://img.freepik.com/free-photo/photorealistic-wedding-venue-with-intricate-decor-ornaments_23-2151481511.jpg?t=st=1733998844~exp=1734002444~hmac=24fc00f16be309dad20e6a76e5051d60acc7b3d3565772de4a7b33fd73325a80&w=996');
                           background-size: cover;
                           background-position: center;
                           background-repeat: no-repeat;
                           min-height: 100vh;
                           display: flex;
                           justify-content: center;
                           align-items: center;
            }
            h2 {
                font-size: 3rem;
                font-weight: bolder;
                color: white;
            }
            h5 {
                 font-weight: bold;
                 color: black;
                    }

            ::placeholder {
                        font-family: 'Arial', sans-serif; /* Change to your desired font */
                        font-style: italic; /* Example: italicize the placeholder text */
                        color: #888888; /* Change color of placeholder text */
                        font-size: 14px; /* Adjust font size */
                    }

        </style>
</head>
<body>
	<form action="marriage" method="post">
    <H2>Marriage Register</H2>

    <H5>Enter your Details</H5>

    <pre>
    <input type="text" class="form-control" name="brideName" placeholder="Enter brideName"/>

    <input type="text" class="form-control" name="groomName" placeholder="Enter GroomName"/>

    <input type="submit" value="Register" class="btn btn-primary btn-block"/>

</pre>
</form>
</body>
</html>
