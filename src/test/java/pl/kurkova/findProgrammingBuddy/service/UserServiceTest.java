package pl.kurkova.findProgrammingBuddy.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kurkova.findProgrammingBuddy.domain.Technology;
import pl.kurkova.findProgrammingBuddy.domain.User;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    public void saveUser() {
        //Given
        Technology java = new Technology();
        Technology html = new Technology();
        List<Technology> technologiesToStudy = new ArrayList<>();
        technologiesToStudy.add(java);
        technologiesToStudy.add(html);
        User user = new User(1L, "kurkova", "Poznań", "junior", 4, technologiesToStudy);

        //When
        User saveUser = userService.saveUser(user);

        //Then
        assertEquals(user.getId(), saveUser.getId());
    }
}
