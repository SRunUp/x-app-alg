package x.app.alg

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class AlgApplication:CommandLineRunner{
    override fun run(vararg args: String?) {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    runApplication<AlgApplication>(*args)
}
