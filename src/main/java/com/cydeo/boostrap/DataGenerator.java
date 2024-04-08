package com.cydeo.boostrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {


    private final RoleService roleService;
    private final UserService userService;

    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L, "Admin");
        RoleDTO managerRole = new RoleDTO(2L, "Manager");
        RoleDTO employeeRole = new RoleDTO(3L, "Employee");


        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John","Kesy","john@cydeo.com","Abc1",true,"7459684532",managerRole, Gender.MALE);

        UserDTO user5 = new UserDTO("Mike","Smith","mike@cydeo.com","Abc2",true,"7459684533",managerRole, Gender.MALE);

        UserDTO user2 = new UserDTO("Delisa","Norra","delisa@cydeo.com","123",true,"7459684538",managerRole, Gender.FEMALE);

        UserDTO user3 = new UserDTO("Craig","Jark","craig@cydeo.com","Abc3",true,"7459684532",managerRole, Gender.MALE);

        UserDTO user4 = new UserDTO("Shaun","Hayns","shaun@cydeo.com","Abc4",true,"7459684412",managerRole, Gender.MALE);

        UserDTO user6 = new UserDTO("Elizabeth","Loren","elizabeth@cydeo.com","Abc4",true,"7459684412",managerRole, Gender.FEMALE);

        UserDTO user7 = new UserDTO("Maria","Ada","maria@cydeo.com","Abc4",true,"7459684412",managerRole, Gender.FEMALE);

        UserDTO user8 = new UserDTO("Bill","Matt","bill@cydeo.com","Abc4",true,"7459684846",managerRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);



    }
}
