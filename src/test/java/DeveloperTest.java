import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "AB12345", 35000.00);
    }

    @Test
    public void can_get_name(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void can_get_ni(){
        assertEquals("AB12345", developer.getNi());
    }

    @Test
    public void can_get_salary(){
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void can_raise_salary(){
        developer.raiseSalary(2000.00);
        assertEquals(37000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void can_get_bonus(){
        assertEquals(350.00, developer.payBonus(), 0.01);
    }
}
