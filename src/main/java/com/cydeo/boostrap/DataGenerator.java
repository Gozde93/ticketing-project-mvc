package com.cydeo.boostrap;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.enums.Status;
import com.cydeo.service.ProjectService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import static com.cydeo.enums.Status.IN_PROGRESS;

@Component
public class DataGenerator implements CommandLineRunner {


    private final RoleService roleService;
    private final UserService userService;
    private final ProjectService projectService;

    public DataGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
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

        ProjectDTO project1 = new ProjectDTO("Spring MVC", "PR001",user1, LocalDate.now(),LocalDate.now().plusYears(25),"Creating Controoler", Status.OPEN);

        ProjectDTO project2 = new ProjectDTO("Spring ORM", "PR002",user2, LocalDate.now(),LocalDate.now().plusYears(10),"Creating Database", Status.IN_PROGRESS);

        ProjectDTO project3 = new ProjectDTO("Spring Container", "PR003",user3, LocalDate.now(),LocalDate.now().plusYears(32),"Creating Database", Status.OPEN);

        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);



    }
}
