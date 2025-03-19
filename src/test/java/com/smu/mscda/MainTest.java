package com.smu.mscda;
import static org.junit.Assert.assertEquals;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


public class MainTest {
@Test
public void testCapitalizeString() {
String input = "hello";
String expected = "Hello";
assertEquals(expected, StringUtils.capitalize(input));
}
@Test
public void testMd5Hash() {
String input = "Hello";
String expectedMd5 = DigestUtils.md5Hex(input);
assertEquals(expectedMd5, DigestUtils.md5Hex(input));
}
}