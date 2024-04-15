package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test brackets in the correct order, "[]"
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test brackets in front of other characters, "[]LaunchCode"
    @Test
    public void bracketsFollowedByCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //Test brackets around other characters, "[LaunchCode]"
    @Test
    public void bracketsAroundCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //Test brackets within other characters, "Launch[Code]"
    @Test
    public void bracketsWithinCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //Test multiples consecutive pairs of brackets, "[][][]"
    @Test
    public void multipleConsecutiveBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    //Test multiples pairs of brackets within other brackets, "[[[]]]"
    @Test
    public void multipleNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    //Test single opening bracket, "["
    @Test
    public void singleOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //Test single closing bracket, "]"
    @Test
    public void singleClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //Test reversed brackets, "]["
    @Test
    public void reversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //Test single opening bracket with other characters, "[LaunchCode"
    @Test
    public void singleOpeningBracketWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //Test single closing bracket with other characters, "LaunchCode]"
    @Test
    public void singleClosingBracketWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    //Test unbalanced bracket within other characters, "]Launch[Code"
    @Test
    public void unbalancedBracketsWithinCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code"));
    }

    //Test multiple unbalanced brackets, "]]][[["
    @Test
    public void multipleUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }

    //Test string of characters without brackets, "LaunchCode"
    @Test
    public void charactersWithoutBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    //Test empty string, ""
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

}