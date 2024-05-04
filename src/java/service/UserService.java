package service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserService {
    @RequestMapping("/{userId}/bookmarks")
    public String getUserInfo(@PathVariable long userId) {
        return "none";
    }
}
