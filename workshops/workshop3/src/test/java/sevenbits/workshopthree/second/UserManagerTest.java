package sevenbits.workshopthree.second;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserManagerTest {

    @Test
    public void getUserByIndex() throws UserManagerException, IOException {
        User expect = new User("Ivan","Programmer");

        ICollection iCollection = mock(ICollection.class);
        when(iCollection.get(0)).thenReturn(expect);

        UserManager userManager = new UserManager(iCollection);
        assertEquals(expect, userManager.getUserByIndex(0));

    }

    @org.junit.Test(expected = UserManagerException.class)
    public void getUserByIndexException() throws UserManagerException, IOException {
        ICollection iCollection = mock(ICollection.class);

        when(iCollection.get(0)).thenThrow(new IOException());

        UserManager userManager = new UserManager(iCollection);
        userManager.getUserByIndex(0);
    }

    @org.junit.Test
    public void createDefault() throws UserManagerException, IOException {
        ICollection iCollection = mock(ICollection.class);

        UserManager userManager = new UserManager(iCollection);

        userManager.createDefault("Ivan");

        verify(iCollection).add(new User("Ivan", "default"));
    }

    @org.junit.Test(expected = UserManagerException.class)
    public void createDefaultException() throws UserManagerException, IOException {
        ICollection iCollection = mock(ICollection.class);

        UserManager userManager = new UserManager(iCollection);


        doThrow(IOException.class).when(iCollection).add(new User("Ivan", "default"));

        userManager.createDefault("Ivan");
    }

}