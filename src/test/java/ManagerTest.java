import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "AB12345", 30000.00, "Accounts");
    }

    @Test
    public void can_get_name(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void can_get_ni(){
        assertEquals("AB12345", manager.getNi());
    }

    @Test
    public void can_get_salary(){
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void can_get_department_name(){
        assertEquals("Accounts", manager.getDeptName());
    }

    @Test
    public void can_raise_salary(){
        manager.raiseSalary(2000.00);
        assertEquals(32000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void can_get_bonus(){
        assertEquals(300.00, manager.payBonus(), 0.01);
    }
}
