package com.t313.dao;

import com.t313.model.Role;

import java.util.List;

public interface RoleDao {

    void save(Role role);

    List<Role> getAllRoles();

    Role getRoleByName(String role);
}
