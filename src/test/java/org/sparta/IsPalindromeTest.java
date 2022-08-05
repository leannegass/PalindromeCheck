package org.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsPalindromeTest {

    @Test
    @DisplayName( "if string is null return True")
    void ifStringIsNull(){
        Assertions.assertEquals(true, MyStrings.isPalindrome(""));
    }

    @Test
    @DisplayName( "if string is Maden return False")
    void ifStringIsMaden(){
        Assertions.assertEquals(false, MyStrings.isPalindrome("Maden"));
    }

    @Test
    @DisplayName( "if string is madam return True")
    void ifStringIsMadam(){
        Assertions.assertEquals(true, MyStrings.isPalindrome("madam"));
    }

    @Test
    @DisplayName( "if string is RAceCAR return True")
    void ifStringIsRAceCAR(){
        Assertions.assertEquals(true, MyStrings.isPalindrome("RAceCAR"));
    }

}
