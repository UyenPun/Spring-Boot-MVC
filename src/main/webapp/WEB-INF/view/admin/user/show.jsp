<!-- jsp support vietnamese -->
<%@ page contentType="text/html;charset=UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="utf-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
      <meta name="description" content="Trần Uyên - Dự án laptopshop" />
      <meta name="author" content="Trần Uyên" />
      <title>Product - Trần Uyên</title>
      <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
      <link href="/css/styles.css" rel="stylesheet" />
      <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    </head>

    <body class="sb-nav-fixed">
      <!-- Header -->
      <jsp:include page="../layout/header.jsp" />
      <div id="layoutSidenav">
        <jsp:include page="../layout/sidebar.jsp" />
        <div id="layoutSidenav_content">
          <main>
            <div class="container-fluid px-4">
              <h1 class="mt-4">Manage Users</h1>
              <ol class="breadcrumb mb-4">
                <li class="breadcrumb-item active"><a href="/admin">Dashboard</a></li>
                <li class="breadcrumb-item active">Users</li>
              </ol>

              <div class="mt-5">
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
                        <c:forEach var="user" items="${users1}"> <!-- users1: Biến truyền qua từ controller-->
                          <tr>
                            <th>${user.id}</th>
                            <td>${user.email}</td>
                            <td>${user.fullName}</td>
                            <td>
                              <a href="/admin/user/${user.id}" class="btn btn-success">View</a> <!--Lấy id-->
                              <a href="/admin/user/update/${user.id}" class="btn btn-warning  mx-2">Update</a>
                              <a href="/admin/user/delete/${user.id}" class="btn btn-danger">Delete</a>
                            </td>
                          </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>

                </div>

              </div>
            </div>
          </main>
          <jsp:include page="../layout/footer.jsp" />
        </div>
      </div>

      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
      <script src="js/scripts.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
      <script src="js/chart-area-demo.js"></script>
      <script src="js/chart-bar-demo.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js"
        crossorigin="anonymous"></script>
      <script src="js/datatables-simple-demo.js"></script>
    </body>

    </html>