package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.DAO.UserDao;
import vn.codegym.model.Login;
import vn.codegym.model.User;

/*TODO: Bước 5: Tạo UserController
        Lớp vn.codegym.model.UserController
         có phương thức home() trả về view home
          kèm theo một người dùng mặc định.
* */
@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("login", new Login());
        return modelAndView;
    }

    /*TODO: Bước 8: Bổ sung phương thức login() trong UserController
        - Phương thức login() nhận vào một model Login
         và thực hiện việc kiểm tra thông qua UserDao.
        - Nếu đăng nhập thành công thì trả về view user kèm theo đối tượng User.
        - Nếu đăng nhập thất bại thì trả về view error.
    * */
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        User user = UserDao.checkLogin(login);
        ModelAndView modelAndView;
        if (user == null) {
            modelAndView = new ModelAndView("error");
        } else {
            modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}