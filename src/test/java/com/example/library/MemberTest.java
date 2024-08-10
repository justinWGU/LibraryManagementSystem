package com.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberTest {

    @Test
    public void testMemberCreation() {
        // create instance of Member
        Member mem = new Member("Justin", "Justin@yahoo.com");
        assertEquals("Justin", mem.getName(), "Should be Justin");
        assertEquals("Justin@yahoo.com", mem.getEmail(), "Should be Justin@yahoo.com");
    }
}
