import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", "AB12345", 35000.00);
    }

    @Test
    public void can_get_name(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void can_get_ni(){
        assertEquals("AB12345", databaseAdmin.getNi());
    }

    @Test
    public void can_get_salary(){
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void can_raise_salary(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(37000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void can_get_bonus(){
        assertEquals(350.00, databaseAdmin.payBonus(), 0.01);
    }
}
