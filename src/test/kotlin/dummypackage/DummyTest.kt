package dummypackage

import org.amshove.kluent.shouldNotBeNull
import org.junit.Test

class DummyTest {
    @Test
    fun testeroni() {
        val nullString: String? = null
        nullString.shouldNotBeNull()
    }
}
