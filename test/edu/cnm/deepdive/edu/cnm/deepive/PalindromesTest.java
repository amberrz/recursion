package edu.cnm.deepdive.edu.cnm.deepive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  @Test
  void testRecursive() {
    assertTrue(Palindromes.testRecursive("radar"));
    assertFalse(Palindromes.testRecursive("sonar"));
    assertTrue(Palindromes.testRecursive("abba"));
    assertFalse(Palindromes.testRecursive("abb"));
    assertTrue(Palindromes.testRecursive("x"));
    assertTrue(Palindromes.testRecursive(""));
  }
}