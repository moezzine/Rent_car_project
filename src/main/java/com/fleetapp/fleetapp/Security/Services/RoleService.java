package com.fleetapp.fleetapp.Security.Services;

import com.fleetapp.fleetapp.Repositories.UserRepository;
import com.fleetapp.fleetapp.Security.Models.Role;
import com.fleetapp.fleetapp.Security.Repository.RoleRepository;
import com.fleetapp.fleetapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    public List<Role> findall(){
        return roleRepository.findAll();
    }

    public void delete(int id){
        roleRepository.deleteById(id);
    }

    public void save(Role role){
       roleRepository.save(role);
    }

    public Optional<Role> findById(int id){
        return  roleRepository.findById(id);
    }

    public void assignuserrole(Integer userId,Integer roleId){
Role role=roleRepository.findById(roleId).orElse(null);
User user=userRepository.findById(userId).orElse(null);
Set<Role> roles=user.getRoles();
roles.add(role);
user.setRoles(roles);
userRepository.save(user);
    }

    public void  unassignuserrole(Integer userId, Integer roleId){
        User user=userRepository.findById(userId).orElse(null);
        Set<Role> roles=user.getRoles();
        roles.removeIf(x->x.getId()==roleId);
        userRepository.save(user);
    }
    public Set<Role> getUserRoles(User user){
        return user.getRoles();
    }
    public List<Role> getUserNotRoles(User user){
        return roleRepository.getUserNotRoles(user.getId());
    }
}
