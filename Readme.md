# 51. Bài Tập Giao diện Tạo Mới (CREATE) User

1. Yêu cầu

- Tạo đối tượng User, bao gồm các thông tin sau:
  id: long
  email: String
  password: String
  fullName: String
  address: String;
  phone: String
  Viết getter, setter, toString
- Tạo view create new user, sử dụng Bootstrap và có các thông tin sau:
  email, password, fullName, address, phone

2. Gợi ý cách làm
   Tạo thêm folder, đặt tên là domain -> User.java
   Với view, chia thành 2 folder: client/admin
   Folder admin: lưu giao diện xử lý tại admin
   Folder client: lưu giao diện xử lý tại user (client)
   Tạo thêm view admin/user/create.jsp
   Tạo thêm url /admin/user
   Về giao diện form, sử dụng:
   https://getbootstrap.com/docs/5.3/forms/overview/#overview
   Chia layout nhanh với: Container, Row, Col của bootstrap
   https://getbootstrap.com/docs/5.3/layout/breakpoints/
