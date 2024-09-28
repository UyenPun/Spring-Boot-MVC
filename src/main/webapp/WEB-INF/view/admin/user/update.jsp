<!-- jsp support vietnamese -->
<%@ page contentType="text/html;charset=UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


      <!DOCTYPE html>
      <html lang="en">

      <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="Trần Uyên - Dự án laptopshop" />
        <meta name="author" content="Trần Uyên" />
        <title>Create User</title>
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
                    <div class="col-md-6 col-12 mx-auto"> <!-- Laptop: 1/2 ; Mobile: full -->
                      <h3>Update a user</h3>
                      <hr />
                      <form:form method="post" action="/admin/user/update" modelAttribute="newUser">
                        <div class="mb-3" style="display: none">
                          <label class="form-label">Id:</label>
                          <form:input type="text" class="form-control" path="id" />
                          <!--path trùng với thuộc tính domain-->
                        </div>
                        <div class="mb-3">
                          <label class="form-label">Email:</label>
                          <form:input type="email" class="form-control" path="email" disabled="true" />
                          <!--disabled: true không update-->
                        </div>
                        <div class="mb-3">
                          <label class="form-label">Phone number:</label>
                          <form:input type="text" class="form-control" path="phone" />
                        </div>
                        <div class="mb-3">
                          <label class="form-label">Full Name:</label>
                          <form:input type="text" class="form-control" path="fullName" />
                        </div>
                        <div class="mb-3">
                          <label class="form-label">Address:</label>
                          <form:input type="text" class="form-control" path="address" />
                        </div>

                        <button type="submit" class="btn btn-warning">Update</button>
                      </form:form>
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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
          crossorigin="anonymous"></script>
        <script src="js/chart-area-demo.js"></script>
        <script src="js/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js"
          crossorigin="anonymous"></script>
        <script src="js/datatables-simple-demo.js"></script>
      </body>

      </html>