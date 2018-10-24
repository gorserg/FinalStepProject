package org.danit.luckyfit.entity

import org.junit.Test
import static org.junit.Assert.assertEquals

class StatusTest {

    @Test
    void testGetIdSetIdGetNameSetNameToString() {
        def status = new Status()

        status.setId(1)
        status.setName("Test Name")

        assertEquals(status.id, status.getId())
        assertEquals(status.name, status.getName())
        assertEquals("Status{id=1, name='Test Name'}", status.toString())
    }
}
