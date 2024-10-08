package com.company.controller.admin;

import com.company.domain.User;
import com.company.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/")
  public String getHomePage(Model model) {
    List<User> arrUsers = this.userService.getAllUserByEmail("cherrydo2018@gmail.com");
    System.out.println(arrUsers);

    model.addAttribute("message", "test");
    model.addAttribute("message2", "Welcome to from Controller!");
    return "hello";
  }

  @RequestMapping("/admin/user")
  public String getUserPage(Model model) {
    List<User> users = this.userService.getAllUser();
    // System.out.println(">> check Users:" + arrUsers);
    model.addAttribute("users1", users);
    return "admin/user/show";
  }

  // get id
  @RequestMapping("/admin/user/{id}")
  public String getUserDetailPage(Model model, @PathVariable long id) { // lấy động được id
    // System.out.println("Check path id:" + id);

    User user = this.userService.getByUserId(id); // lấy ra id bên service
    model.addAttribute("user", user); // hiển thị id lên view
    model.addAttribute("id", id);
    return "admin/user/detail";
  }

  @RequestMapping("/admin/user/create") // GET
  public String getCreateUserPage(Model model) {
    model.addAttribute("newUser", new User());
    return "admin/user/create";
  }

  @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
  public String createUserPage(Model model, @ModelAttribute("newUser") User newUser) { //
    // System.out.println("run here" + newUser);
    this.userService.handleSaveUser(newUser);
    return "redirect:/admin/user"; // khi tạo xong tự chuyển trang
  }

  @RequestMapping("/admin/user/update/{id}") // GET
  public String getUpdateUserPage(Model model, @PathVariable long id) {
    User currenUser = this.userService.getByUserId(id);
    model.addAttribute("newUser", currenUser);
    return "admin/user/update";
  }

  @PostMapping("/admin/user/update") // Method POST
  public String postUpdateUser(Model model, @ModelAttribute("newUser") User newUser) {
    User currenUser = this.userService.getByUserId(newUser.getId()); // lúc này bên phía view đã có id rồi
    if (currenUser != null) {
      // System.out.println("run here");
      currenUser.setAddress(newUser.getAddress());
      currenUser.setFullName(newUser.getFullName());
      currenUser.setPhone(newUser.getPhone());

      // lưu xuống database: (fix bug here)
      this.userService.handleSaveUser(currenUser);
    }

    return "redirect:/admin/user"; // khi tạo xong tự chuyển trang
  }

  // Delete:
  @GetMapping("/admin/user/delete/{id}")
  public String getDeleteUpdateUserPage(Model model, @PathVariable long id) {
    model.addAttribute("id", id);

    // Cách 1: để lấy đúng giá trị id (vì ban đầu id = 0 -> vì nếu truyền ngay là
    // new mà không set lại giá trị id)
    // User user = new User();
    // user.setId(id);

    model.addAttribute("newUser", new User()); // truyền user vừa set id vào
    return "admin/user/delete";
  }

  @PostMapping("/admin/user/delete")
  public String postDeleteUpdateUser(Model model, @ModelAttribute("newUser") User newUser) {
    // System.out.println("run here");

    this.userService.deleteByUser(newUser.getId());
    return "redirect:/admin/user"; // khi tạo xong tự chuyển trang
  }

}
