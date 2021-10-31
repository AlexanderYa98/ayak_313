package com.t313.service;

import com.t313.model.Role;
import java.util.List;

public interface RoleService {

    void saveRole(Role role);

    List<Role> allRoles();

    Role getRoleByName(String role);
}
