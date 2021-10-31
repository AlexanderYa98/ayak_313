package com.t313.controller;

import com.t313.model.Role;
import com.t313.model.User;
import com.t313.service.RoleService;
import com.t313.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class MyRESTController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public MyRESTController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @GetMapping("admin/allUsers")
    public List<User> showAllUsers() {
        List<User> allUsers = userService.allUsers();
        return allUsers;
    }


    @GetMapping("admin/{id}")
    public User getUser(@PathVariable long id) {
        User user = userService.getUser(id);
        return user;
    }

    @GetMapping("admin/authorities")
    public List<Role> showAllRoles() {
        List<Role> allRoles = roleService.allRoles();
        return allRoles;
    }


    @PostMapping("admin")
    public User addNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }


    @PutMapping("admin")
    public User updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping("admin/{id}")
    public String deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
        return "User with ID = " + id + " was deleted";
    }


}
