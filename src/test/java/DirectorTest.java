import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bob", "AB12345", 50000.00, "Board", 1000000.00);
    }

    @Test
    public void can_get_name(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void can_get_ni(){
        assertEquals("AB12345", director.getNi());
    }

    @Test
    public void can_get_salary(){
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void can_get_department_name(){
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void can_get_budget(){
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void can_raise_salary(){
        director.raiseSalary(10000.00);
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void can_get_bonus(){
        assertEquals(1000.00, director.payBonus(), 0.01);
    }
}
