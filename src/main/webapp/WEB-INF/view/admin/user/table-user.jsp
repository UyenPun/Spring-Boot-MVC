<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Table Users</title>
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <!-- <link href="/css/demo.css" rel="stylesheet"> -->

  </head>

  <body>
    <div class="container mt-5">
      <div class="row">
        <div class="col-12 mx-auto">
          <div class="d-flex justify-content-between">
            <h3>Table users</h3>
            <a href="/admin/user/create" class="btn btn-primary">Create a user</a>
          </div>

          <hr />
          <table class="table table-bordered table-hover">
            <thead>
              <tr>
                <th>ID</th>
                <th>Email</th>
                <th>Full Name</th>
                <th>Action</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th>1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>
                  <button class="btn btn-success">View</button>
                  <button class="btn btn-warning  mx-2">Update</button>
                  <button class="btn btn-danger">Delete</button>
                </td>
              </tr>
              <tr>
                <th>2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>
                  <button class="btn btn-success">View</button>
                  <button class="btn btn-warning  mx-2">Update</button>
                  <button class="btn btn-danger">Delete</button>
                </td>
              </tr>

            </tbody>
          </table>
        </div>

      </div>

    </div>
  </body>

  </html>