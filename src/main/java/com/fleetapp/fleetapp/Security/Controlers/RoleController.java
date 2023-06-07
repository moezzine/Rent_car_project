package com.fleetapp.fleetapp.Security.Controlers;

import com.fleetapp.fleetapp.Security.Models.Role;
import com.fleetapp.fleetapp.Security.Services.RoleService;
import com.fleetapp.fleetapp.Services.UserService;
import com.fleetapp.fleetapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    UserService userService;

    @GetMapping("/role")
    public String getlocations(Model model){
        List<Role> locationList=roleService.findall();
        model.addAttribute("role", locationList);
        return "role";
    }
    @PostMapping("/role/addnew")
    public String addCountry(Role role){
        roleService.save(role);
        return "redirect:/role";
    }
    @RequestMapping("/role/findById")
    @ResponseBody
    public Optional<Role> getById(int id){
        return roleService.findById(id);
    }

    @RequestMapping(value="/role/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Role role){
        roleService.save(role);
        return "redirect:/role";
    }
    @RequestMapping(value="/role/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        roleService.delete(id);
        return "redirect:/role";
    }
    @GetMapping("/security/user/Edit/{id}")
    public String editEmployee(@PathVariable Integer id, Model model){
        User user = userService.getById(id).orElse(null);
        model.addAttribute("user", user);
        model.addAttribute("userRoles", roleService.getUserRoles(user));
        model.addAttribute("userNotRoles", roleService.getUserNotRoles(user));
        return "/userEdit";
    }
    @RequestMapping("/security/role/assign/{userId}/{roleId}")
    public String assignRole(@PathVariable Integer userId,
                             @PathVariable Integer roleId){
        roleService.assignuserrole(userId, roleId);
        return "redirect:/user/Edit/"+userId;
    }
    @RequestMapping("/security/role/unassign/{userId}/{roleId}")
    public String unassignRole(@PathVariable Integer userId,
                               @PathVariable Integer roleId){
        roleService.unassignuserrole(userId, roleId);
        return "redirect:/user/Edit/"+userId;
    }
}
