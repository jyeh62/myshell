import org.junit.Test

internal class MyShellKtTest {

    @Test
    fun isAbsolute() {
        val myShell = MyShell()
        assert(myShell.isAbsolute("/"))
    }
}